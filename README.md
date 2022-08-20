# SpringBootTexoMovie

## Prerequisitos
JDK 8

Maven 3.8.1

IDE de sua escolha(Preferência Sprint Tool Suite 4)

Banco de dados H2
   
## Executar a aplicação
A aplicação foi criada sobre microserviço. Seguir a sequência de execução abaixo:

![image](https://user-images.githubusercontent.com/16020782/185726031-59cbad21-b7fe-4150-8432-2ed379f3fdcc.png)

1. Executar o Discovery
```shell script
com.texo.app.discovery.AppDiscoveryServiceApplication
```
1.1 Para visualizar os microserviços disponíveis acessar este endereço: http://localhost:9999/

2. Executar o microserviço AppApiMovies
```shell script
com.texo.app.api.movies.AppApiMoviesApplication
```

3. Executar o API Gateway
```shell script
com.texo.app.discovery.AppDiscoveryServiceApplication
```

## Endpoints
Que trata do objetivo desse projeto. 
```shell script
localhost:8080/movies/min-max-interval-awards
```
realiza a consulta de todos os dados.
```shell script
localhost:8080/movies/all
```
