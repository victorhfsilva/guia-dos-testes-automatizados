# Selenium Webdriver

## **Janelas e Frames:**

O Selenium WebDriver oferece suporte para manipulação de janelas do navegador e frames dentro de páginas da web.

### **Trabalhando com Janelas do Navegador:**

#### **1. Obtendo o Identificador da Janela Atual:**

Se você estiver em uma determinada janela e desejar mudar para outra, primeiro pode ser útil obter o identificador da janela atual usando o método `getWindowHandle()`.

Exemplo:

```java
String currentWindowHandle = driver.getWindowHandle();
```

#### **2. Obtendo Identificadores de Todas as Janelas Abertas:**

Você pode usar o método `getWindowHandles()` para obter uma coleção de todos os identificadores de janelas abertas pelo WebDriver. Em seguida, você pode iterar sobre essa coleção para encontrar o identificador da janela desejada.

Exemplo:

```java
Set<String> windowHandles = driver.getWindowHandles();
for (String handle : windowHandles) {
    // Realize as ações necessárias para determinar qual identificador corresponde à janela desejada
}
```

#### **3. Comparando Propriedades das Janelas:**

Você pode comparar propriedades das janelas, como título, URL ou outras propriedades exclusivas, para determinar qual janela é a desejada.

Exemplo:

```java
for (String handle : windowHandles) {
    driver.switchTo().window(handle);
    if (driver.getTitle().equals("Título da Janela Desejada")) {
        // O identificador da janela desejada é 'handle'
        break;
    }
}
```

#### **4. Filtrando Janelas por Critérios Específicos:**

Você pode aplicar filtros para encontrar a janela desejada com base em critérios específicos, como título, URL, etc.

Exemplo:

```java
String desiredWindowHandle = windowHandles.stream()
                                          .filter(handle -> driver.switchTo().window(handle).getTitle().equals("Título da Janela Desejada"))
                                          .findFirst()
                                          .orElseThrow(() -> new RuntimeException("Janela desejada não encontrada"));
```

#### **5. Trocando de Janela:**

```java
driver.switchTo().window(mainWindowHandle); // Trocar de janela
```

### **Trabalhando com Frames:**

#### **1. Trocar para um Frame Pelo Índice:**

```java
driver.switchTo().frame(0); // Trocar para o frame pelo índice (índice baseado em zero)
```

#### **2. Trocar para um Frame Pelo Nome ou ID:**

```java
driver.switchTo().frame("frameName"); // Trocar para o frame pelo nome ou ID
```

#### **3. Voltar ao Contexto Padrão:**

```java
driver.switchTo().defaultContent(); // Voltar ao contexto padrão (fora de todos os frames)
```

#### **4. Trabalhar com Frames Aninhados:**

```java
driver.switchTo().frame("frameName1"); // Trocar para o primeiro frame
driver.switchTo().frame("frameName2"); // Trocar para o segundo frame (dentro do primeiro frame)
```

### **Observações Importantes:**

- Certifique-se de trocar para o contexto correto antes de interagir com os elementos dentro de uma janela ou frame.
- Ao trabalhar com janelas, armazene o identificador da janela principal para poder retornar a ela posteriormente.