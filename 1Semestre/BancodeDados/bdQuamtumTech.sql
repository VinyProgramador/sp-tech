	CREATE DATABASE QuamtumTech; 
	USE QuamtumTech;

	-- Tabela das empresas:
	CREATE TABLE Cliente(
	idCliente INT PRIMARY KEY AUTO_INCREMENT,
	Nome VARCHAR(100),
	Ddd VARCHAR(3),
	Contato VARCHAR(9),
	Email VARCHAR(100),
	Cnpj INT
	);

	-- tabela dos sensores
	CREATE TABLE Sensor(
	IdSensor INT PRIMARY KEY AUTO_INCREMENT,
	Localização VARCHAR(100)
	);

	-- Tabela de registros 

	CREATE TABLE Registro (
	idRegistro INT PRIMARY KEY AUTO_INCREMENT,
	DataHoraRegistro DATETIME,
	codOnibus VARCHAR(10)
	);
    
    SELECT*FROM Registr ;