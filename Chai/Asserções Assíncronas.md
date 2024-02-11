# Chai

## Asserções Assíncronas

Ao lidar com operações assíncronas, como chamadas de API ou operações de E/S, é importante garantir que suas asserções sejam executadas somente após a conclusão da operação assíncrona. O Chai oferece suporte para asserções assíncronas usando métodos como `eventually`, `fulfilled`, `rejected`, entre outros. Aqui estão os principais conceitos e exemplos:

### Asserções Assíncronas Básicas

Para asserções em promessas, você pode usar o método `eventually` para garantir que a asserção seja executada somente após a resolução da promessa:

```javascript
// Verifica se a promessa é cumprida com um valor específico
return expect(promessa).to.eventually.equal(valorEsperado);
```

### Asserções de Promessa Cumprida e Rejeitada

Você pode usar `fulfilled` para verificar se a promessa é cumprida e `rejected` para verificar se a promessa é rejeitada:

```javascript
// Verifica se a promessa é cumprida
return expect(promessa).to.eventually.be.fulfilled;

// Verifica se a promessa é rejeitada com um erro específico
return expect(promessa).to.eventually.be.rejectedWith('mensagemDeErro');
```

### Asserções Assíncronas com Timers

Às vezes, é necessário lidar com asserções assíncronas que envolvem temporizadores, como esperar um certo tempo antes de verificar uma condição. Você pode usar `setTimeout` em conjunto com asserções assíncronas do Chai:

```javascript
// Espera 1000 milissegundos antes de verificar uma condição
return new Promise((resolve, reject) => {
    setTimeout(() => {
        resolve(expect(valorReal).to.equal(valorEsperado));
    }, 1000);
});
```

### Conclusão

Com as asserções assíncronas no Chai, você pode garantir que seus testes lidem corretamente com operações assíncronas, como promessas e temporizadores. Isso é essencial para garantir a precisão e a confiabilidade dos seus testes em ambientes assíncronos, como aplicações web e APIs.