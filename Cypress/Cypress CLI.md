# Guia do Cypress CLI

O Cypress CLI (Command Line Interface) é uma ferramenta poderosa que oferece uma variedade de comandos para configurar, executar e gerenciar seus testes Cypress de forma eficiente.

## Instalação

Antes de usar o Cypress CLI, é necessário instalar o Cypress como uma dependência de desenvolvimento em seu projeto. Você pode instalá-lo globalmente ou localmente, dependendo das suas necessidades.

Para instalar globalmente:

```bash
npm install -g cypress
```

Para instalar localmente (recomendado para projetos específicos):

```bash
npm install --save-dev cypress
```

## Comandos Básicos

### Abrir o Test Runner

O comando `cypress open` abre a interface gráfica do Test Runner do Cypress, onde você pode executar e depurar seus testes de forma interativa.

```bash
cypress open
```

### Executar Testes em Modo de Headless

O comando `cypress run` executa seus testes em segundo plano, sem a necessidade de uma interface gráfica. É útil para execuções em ambientes de integração contínua ou para automação de testes.

```bash
cypress run
```

### Executar Testes em um Único Arquivo

Você pode especificar um único arquivo de teste para executar usando o argumento `--spec`.

```bash
cypress run --spec path/to/your/test/file.spec.js
```

### Definir Variáveis de Ambiente

Você pode definir variáveis de ambiente para seus testes usando `--env`. Isso é útil para configurar diferentes ambientes ou passar parâmetros para seus testes.

```bash
cypress run --env username=admin,password=123456
```

### Ignorar Testes

Se você deseja ignorar um ou mais testes, use a opção `--ignore-test-files`.

```bash
cypress run --ignore-test-files "test1.spec.js,test2.spec.js"
```

### Executar em Diferentes Browsers

O Cypress permite que você execute seus testes em diferentes navegadores usando a opção `--browser`.

```bash
cypress run --browser chrome
```

## Conclusão

O Cypress CLI oferece uma ampla gama de recursos e opções para configurar e executar seus testes Cypress de maneira eficiente. Com os comandos e opções adequados, você pode automatizar seus testes de forma eficaz e garantir a qualidade do seu aplicativo. Experimente os diferentes comandos e personalize-os de acordo com suas necessidades específicas de teste.