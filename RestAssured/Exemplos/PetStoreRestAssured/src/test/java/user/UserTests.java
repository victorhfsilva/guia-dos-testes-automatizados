package user;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.specification.RequestSpecification;
import org.example.user.User;
import org.junit.jupiter.api.*;

import static org.hamcrest.Matchers.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserTests {

    private static User user;
    public static Faker faker;
    public static RequestSpecification request;

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        faker = new Faker();

        user = new User(
                faker.name().username(),
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().safeEmailAddress(),
                faker.internet().password(8,10),
                faker.phoneNumber().toString()
        );
    }

    @BeforeEach
    public void setRequest() {
        request = RestAssured.given()
                .header("api-key", "special-key")
                .header("Content-type", "application/json");
    }
    @Test
    @Order(1)
    public void postUser() {
        request
                .body(user)
                .when()
                .post("/user")
                .then()
                .assertThat().statusCode(200)
                .and().body("code", equalTo(200))
                .and().body("type", equalTo("unknown"))
                .and().body("message", isA(String.class))
                .and().body("size()", equalTo(3));
    }

    @Test
    @Order(2)
    public void getLogin() {
        request
                .param("username", user.getUsername())
                .param("password", user.getPassword())
                .when()
                .get("/user/login")
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .time(lessThan(2000L))
                .and()
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("loginResponseSchema.json"));
    }

    @Test
    @Order(3)
    public void getUser() {
        request
                .when()
                .get("/user/" + user.getUsername())
                .then()
                .assertThat()
                .statusCode(200)
                .and().body("username", equalTo(user.getUsername()))
                .and().body("firstName", equalTo(user.getFirstName()))
                .and().body("lastName", equalTo(user.getLastName()))
                .and().body("password", equalTo(user.getPassword()))
                .and().body("email", equalTo(user.getEmail()))
                .and().body("phone", equalTo(user.getPhone()));
    }
}
