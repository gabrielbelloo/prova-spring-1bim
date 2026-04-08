## Como instalar:

- Instale o Java na versão 25
  
- Clone o repositório
```
git clone https://github.com/gabrielbelloo/prova-spring-1bim
```

- Rode o código na IDE de sua preferência


## Exemplos de requisições:

- Rota da API
```
localhost:8080/api/produtos/
```

- Requisição GET
```
localhost:8080/api/produtos/
```
ou
```
localhost:8080/api/produtos/{id}
```

- Requisição POST
```
localhost:8080/api/produtos/
```
```
{
    "nome": "Produto",
    "descricao": "Descricao",
    "preco": 50.00,
    "status": "INATIVO"
}
```

- Requisição DELETE
```
localhost:8080/api/produtos/{id}
```

- Requisição PUT
```
localhost:8080/api/produtos/{id}
```
```
{
    "nome": "ProdutoAlterado",
    "descricao": "DescricaoAlterado",
    "preco": 55.00,
    "status": "INATIVO"
}
```
