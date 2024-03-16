# Hooks de Ciclo de Vida no Cypress

Hooks de ciclo de vida no Cypress são funções especiais que você pode usar para executar ações antes, depois ou entre os testes em sua suíte de testes. Eles fornecem um meio poderoso de configurar o ambiente de teste, inicializar estados e limpar recursos, garantindo que seus testes sejam executados de forma consistente e confiável.

## 1. before()

O hook `before()` é executado uma vez, antes de todos os testes na suíte de testes. É útil para realizar tarefas de inicialização que precisam ser feitas antes de iniciar os testes.

**Exemplo:**
```javascript
before(() => {
  // Inicializar o aplicativo antes de iniciar os testes
  cy.visit('/')
})
```

## 2. beforeEach()

O hook `beforeEach()` é executado antes de cada teste na suíte de testes. É útil para configurar o estado inicial antes de cada teste individual.

**Exemplo:**
```javascript
beforeEach(() => {
  // Limpar o estado ou realizar ações comuns antes de cada teste
  cy.clearLocalStorage()
})
```

## 3. afterEach()

O hook `afterEach()` é executado após cada teste na suíte de testes. É útil para limpar recursos ou realizar ações de limpeza após a conclusão de cada teste.

**Exemplo:**
```javascript
afterEach(() => {
  // Limpar recursos ou realizar ações de limpeza após cada teste
  cy.clearCookies()
})
```

## 4. after()

O hook `after()` é executado uma vez, após todos os testes na suíte de testes. É útil para realizar tarefas de limpeza ou finalização após a conclusão de todos os testes.

**Exemplo:**
```javascript
after(() => {
  // Realizar ações de limpeza ou finalização após a execução de todos os testes
  cy.log('Todos os testes foram concluídos')
})
```

Os hooks de ciclo de vida no Cypress permitem que você configure o ambiente de teste de maneira flexível e robusta, garantindo que seus testes sejam executados de forma consistente e previsível. Ao usar esses hooks, você pode garantir que seu código seja limpo, organizado e fácil de manter, tornando sua suíte de testes mais eficiente e confiável.