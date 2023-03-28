<h3>1. Criar e executar container (Comandos iniciais)</h3>
Para executar os seguintes comandos é necessário ter o docker e docker compose instalados.

Criando uma network para execução dos containers
```shell
docker network create -d bridge postgres-network
```

Executar um container docker com postgres 15
```shell
docker run --name test-postgres --network=postgres-network -e "POSTGRES_PASSWORD=postgres123456" -p 5432:5432 -v db-data-postgres:/var/lib/postgresql/data -d postgres:15-alpine
```

Criando um container para executar pgAdmin4
```shell
docker run --name test-pgadmin-postgres-network --network=postgres-network -p 15432:80 -e "PGADMIN_DEFAULT_EMAIL=admin@admin.com" -e "PGADMIN_DEFAULT_PASSWORD=admin" -d dpage/pgadmin4
```

Acessar URL http://localhost:15432 e na tela de login do pgAdmin 4 usar o login e senha atribuidos em PGADMIN_DEFAULT_EMAIL e PGADMIN_DEFAULT_PASSWORD.

- Criar um servidor: Server > Register > Server

```
Tab General
    Name: Local
    
Tab Conection
    Host name/address: test-postgres
    Port: 5432
    Maintenance: postgres
    Username: postgres
    Password: postgres123456
```

<h3>2. Comandos básicos docker</h3>

Iniciar containers do postgres e pgadmin

```shell
docker start test-postgres
```

```shell
docker start test-pgadmin-postgres-network 
```

Exibir todos os containers como tabela
```shell
docker ps -a --format "table {{.ID}}\t{{.Names}}\t{{.Status}}"
```

Para todos os containers
```shell
docker stop $(docker ps -a -q)   
```

Inspecionar um container
```shell
docker inspect CONTAINER_NAME 
```
