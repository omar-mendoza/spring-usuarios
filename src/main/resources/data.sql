DROP TABLE IF EXISTS usuarios;

CREATE TABLE usuarios (
	id INT AUTO_INCREMENT PRIMARY KEY,
	codigo VARCHAR(12),
	nombre VARCHAR(200),
	direccion VARCHAR(200),
	poblacion VARCHAR(200),
	cp VARCHAR (200),
	ciudad VARCHAR(200),
	telefono VARCHAR(20),
	email VARCHAR (100)
);
