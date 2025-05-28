# projeto-hu

Comando para criar o banco de dados:
```bash
docker run -d --name mysql_hu -e MYSQL_ROOT_PASSWORD=admin -e MYSQL_USER=admin -e MYSQL_PASSWORD=admin -e MYSQL_DATABASE=db -p 3306:3306 mysql:8.0
```
