# Comandos Utilitários do Cypress

### **Acessar Variáveis de Ambiente**:

- **cy.env()**: Acessa variáveis de ambiente definidas no arquivo `cypress.json` ou passadas via linha de comando.
  ```javascript
  const username = Cypress.env('USERNAME') // Obtém o valor da variável de ambiente 'USERNAME'
  ```

### **Obter a Hora Atual**:

- **cy.clock()**: Controla o relógio interno do Cypress para manipular o tempo em testes que envolvem temporização.
  ```javascript
  const now = new Date(2024, 3, 16).getTime() // Obtém a data e hora atuais
  cy.clock(now) // Define o relógio interno para a data e hora especificadas
  ```

### **Manipular Cookies**:

- **cy.setCookie()**: Define um cookie no contexto do teste.
  ```javascript
  cy.setCookie('session_id', 'abc123') // Define um cookie com o nome 'session_id' e valor 'abc123'
  ```

- **cy.clearCookie()**: Limpa um cookie do contexto do teste.
  ```javascript
  cy.clearCookie('session_id') // Limpa o cookie com o nome 'session_id'
  ```

- **cy.clearCookies**: Limpa todos os cookies do contexto de teste
    ```javascript
    cy.clearCookies()
    ```

### **Capturar Screenshots e Vídeos**:

- **cy.screenshot()**: Captura um screenshot da página no momento da execução do teste.
  ```javascript
  cy.screenshot('homepage') // Captura um screenshot da página e salva como 'homepage.png'
  ```

- **cy.recordVideo()**: Grava um vídeo da execução do teste.
  ```javascript
  cy.recordVideo() // Começa a gravar um vídeo da execução do teste
  ```

### **Definir Tamanho da Janela do Navegador**:

- **cy.viewport()**: Define o tamanho da janela do navegador durante o teste.
  ```javascript
  cy.viewport(1280, 720) // Define a largura e altura da janela do navegador
  ```

### **Gerar Números Aleatórios**:

- **cy.random()**: Gera um número aleatório entre 0 e 1.
  ```javascript
  const randomNumber = cy.random() // Gera um número aleatório entre 0 e 1
  ```

### **Escrever no Console**:

- **cy.log()**: Escreve mensagens no console do Cypress durante a execução do teste.
  ```javascript
  cy.log('Teste iniciado') // Escreve uma mensagem no console do Cypress
  ```

Esses são alguns dos comandos utilitários mais comuns no Cypress. Eles são úteis para realizar tarefas diversas durante a execução dos testes, como configurar o ambiente, manipular o tempo de espera, acessar variáveis de ambiente, entre outros. Ao escrever testes, é importante considerar o uso desses comandos para garantir que seus testes sejam robustos, confiáveis e eficazes.