# Selenium Webdriver

## **Cookies no Selenium WebDriver:**

Os cookies são pequenos fragmentos de dados armazenados pelo navegador e enviados de volta ao servidor em solicitações subsequentes. O Selenium WebDriver oferece suporte para manipulação de cookies durante a automação de testes. 

#### **1. Obtendo Todos os Cookies:**

```java
// Obtém todos os cookies do navegador
Set<Cookie> cookies = driver.manage().getCookies();
```

#### **2. Obtendo um Cookie Específico:**

```java
// Obtém um cookie específico pelo seu nome
Cookie cookie = driver.manage().getCookieNamed("cookieName");
```

#### **3. Adicionando um Novo Cookie:**

```java
// Adiciona um novo cookie
Cookie newCookie = new Cookie("cookieName", "cookieValue");
driver.manage().addCookie(newCookie);
```

#### **4. Excluindo um Cookie Específico:**

```java
// Exclui um cookie específico pelo seu nome
driver.manage().deleteCookieNamed("cookieName");
```

#### **5. Excluindo Todos os Cookies:**

```java
// Exclui todos os cookies do navegador
driver.manage().deleteAllCookies();
```

#### **6. Modificando um Cookie Existente:**

```java
// Modifica o valor de um cookie existente
Cookie cookie = driver.manage().getCookieNamed("cookieName");
driver.manage().deleteCookie(cookie);
Cookie modifiedCookie = new Cookie("cookieName", "newValue");
driver.manage().addCookie(modifiedCookie);
```

#### **7. Obtendo o Valor de um Cookie:**

```java
// Obtém o valor de um cookie específico pelo seu nome
String cookieValue = driver.manage().getCookieNamed("cookieName").getValue();
```

#### **8. Verificando se um Cookie Existe:**

```java
// Verifica se um cookie específico existe
boolean isCookiePresent = driver.manage().getCookieNamed("cookieName") != null;
```

#### **9. Obtendo Informações de um Cookie:**

```java
// Obtém informações detalhadas de um cookie específico
Cookie cookie = driver.manage().getCookieNamed("cookieName");
String cookieName = cookie.getName();
String cookieValue = cookie.getValue();
String cookieDomain = cookie.getDomain();
String cookiePath = cookie.getPath();
Date cookieExpiry = cookie.getExpiry();
```

#### **Observações Importantes:**

- Certifique-se de entender a política de cookies do site que está sendo testado para manipulá-los corretamente durante a automação.
- A manipulação de cookies é útil para testar cenários relacionados à autenticação, preferências do usuário, experiência personalizada, entre outros.