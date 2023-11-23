crea imagen docker para la base de datos del


docker run --name almacendb -e POSTGRES_PASSWORD=pass123456 -p 5432:5432 -d postgres