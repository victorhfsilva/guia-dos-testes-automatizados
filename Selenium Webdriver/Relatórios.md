# Selenium Webdriver

## **Geração de Relatórios no Selenium WebDriver:**

Gerar relatórios é uma prática essencial durante a automação de testes para documentar os resultados e fornecer insights sobre a qualidade do software testado. 

#### **1. Utilizando Frameworks de Relatórios:**

Existem vários frameworks disponíveis para geração de relatórios no Selenium WebDriver, como:
- ExtentReports
- TestNG Reports
- Allure Reports
- Cucumber Reports

#### **2. Configurando o Framework de Relatórios:**

Cada framework tem sua própria configuração e uso. Por exemplo, para ExtentReports, você precisa configurar o objeto `ExtentReports` e `ExtentTest` para adicionar informações aos relatórios.

Exemplo (ExtentReports):

```java
ExtentReports extent = new ExtentReports("caminho/para/o/arquivo/relatorio.html", true);
ExtentTest test = extent.createTest("Nome do Teste", "Descrição do Teste");
```

#### **3. Adicionando Informações aos Relatórios:**

Depois de configurar o framework de relatórios, você pode adicionar informações relevantes aos relatórios durante a execução dos testes.

Exemplo (ExtentReports):

```java
test.pass("Ação realizada com sucesso");
test.fail("Ocorreu uma falha");
test.addScreenCaptureFromPath("caminho/para/o/arquivo/screenshot.png");
```

#### **4. Finalizando e Salvando o Relatório:**

Após a conclusão dos testes, você precisa finalizar e salvar o relatório para garantir que todas as informações sejam registradas corretamente.

Exemplo (ExtentReports):

```java
extent.flush();
extent.close();
```

#### **Observações Importantes:**

- Escolha o framework de relatórios que melhor atenda às necessidades do seu projeto em termos de recursos, facilidade de uso e integração com outros frameworks de automação.
- Os relatórios devem ser claros, concisos e fornecer informações detalhadas sobre o progresso e os resultados dos testes.