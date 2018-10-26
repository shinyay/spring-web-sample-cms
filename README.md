# spring-web-sample-cms

## Database for Spring JPA
### Postgres
```
docker pull mongo:3.4
docker network create cms-application
docker run -d --name postgres --net cms-application -p 5432:5432 -e POSTGRES_PASSWORD=cms@springfive postgres:9.6-alpine
```

### MongDB
```
docker pull postgres:9.6-alpine
docker network create cms-application
docker run -d --name mongodb --net cms-application -p 27017:27017 mongo:3.4
docker run -d --link mongodb:mongo --net cms-application -p 8081:8081 mongo-express
```

### CMS Application
```
docker pull shinyay/cms
docker run -d --name cms --link mongodb:mongodb --net cms-application -p 8080:8080 shinyay/cms
```
## Jib - Containerize your Maven project

Build Docker image

```
$ mvn compile jib:build
```
