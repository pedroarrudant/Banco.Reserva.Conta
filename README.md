# Banco Reserva Conta

Esse aplicativo tem a finalidade de simular a feature de depósito em contas, porém segregando o seu valor guardado em "sonhos", para que vc possa se planejar melhor no futuro. Projeto feito de acordo com atividade semestral da FIAP.

## Instalação

Você pode usar o arquivo docker do projeto para simular comportamentos.

Estando na pasta do Dockerfile execute o comando abaixo para dockerizar a aplicação:

```bash
docker build -t AppBackend .

docker run AppBackend -p 8080:8080
```

Para utilizar do mongo DB dockerizado também se faz necessária a virtualização do mesmo.

## Meta

Pedro Arruda – [@pedroarrudant](https://twitter.com/pedroarrudant) – pedro.arruda@outlook.com.br

[https://github.com/pedroarrudant](https://github.com/pedroarrudant)

## Contributing

1. Faça o [fork](https://github.com/pedroarrudant/Banco.Reserva.Conta/fork) do projeto.
2. Crie uma _branch_ para sua modificação (`git checkout -b feature/fooBar`)
3. Faça o _commit_ (`git commit -am 'Add some fooBar'`)
4. _Push_ (`git push origin feature/fooBar`)
5. Crie um novo _Pull Request_
