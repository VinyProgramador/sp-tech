	CREATE DATABASE AtividadeRightLeftJoin;
	USE AtividadeRightLeftJoin; 

	CREATE TABLE Pais(
	id_pais INT PRIMARY KEY AUTO_INCREMENT,
	paisOrigem VARCHAR(50),
	idioma VARCHAR(50),
	siglaPais VARCHAR(50)
	);

	INSERT INTO Pais
	(paisOrigem,idioma,siglaPais)
	VALUES
	('Brasil','Portugues','BR'),
	('Espanha','Espanhol','EU'),
	('Argentina','Espanhol','ARG'),
	('Alemanha','Alemão','ALE');

	INSERT INTO Pais
	(paisOrigem,idioma,siglaPais)
	VALUES
	('França','Frances','FRA'),
	('Holanda','Holandes','HOL'),
	('Angola','Angolano','ANG');


	CREATE TABLE Atleta(
	id_atleta INT PRIMARY KEY AUTO_INCREMENT,
	fk_pais INT,
	FOREIGN KEY (fk_pais)REFERENCES Pais(id_pais),
	genero CHAR(1),
	CHECK (genero = 'M' or genero='F'),
	nomeAtleta VARCHAR(50),
	modalidade VARCHAR(50),
	qtdMedalha INT ,
	dtMedalha DATETIME DEFAULT CURRENT_TIMESTAMP
	);

	INSERT INTO Atleta
	(fk_pais,genero,nomeAtleta,modalidade,qtdMedalha)
	VALUES
	('1','M','Maria Clara','Natação',47),
	('2','F','Neymar Jr','Futebol',58),
	('3','M','Gabriel Medina','Surf',10);

	INSERT INTO Atleta
	(genero,nomeAtleta,modalidade,qtdMedalha)
	VALUES
	('M','Robson','Atletismo',3),
	('F','Maria','Atletismo',7),
	('M','Cruzue','Natação',81),
	('M','Cleber','Corredor',4);

    -- Exemplo com INNER JOIN, LEFT JOIN, RIGHT JOIN
	SELECT*FROM Atleta AS ATL LEFT JOIN Pais AS PA ON ATL.fk_pais=PA.id_pais;
	SELECT*FROM Atleta AS ATL RIGHT JOIN Pais AS PA ON ATL.fk_pais=PA.id_pais;
	SELECT*FROM Atleta AS ATL  JOIN Pais AS PA ON ATL.fk_pais=PA.id_pais ;
    
    -- Exemplo com NULL, IS NOT NULL, 
	SELECT*FROM Atleta AS ATL RIGHT JOIN Pais AS PA ON ATL.fk_pais=PA.id_pais WHERE ATL.fk_pais IS NULL;
	SELECT*FROM Atleta AS ATL RIGHT JOIN Pais AS PA ON ATL.fk_pais=PA.id_pais WHERE ATL.fk_pais IS NOT NULL;

	SELECT*FROM Atleta AS ATL LEFT JOIN Pais AS PA ON ATL.fk_pais=PA.id_pais WHERE ATL.fk_pais IS NULL;
	SELECT*FROM Atleta AS ATL LEFT JOIN Pais AS PA ON ATL.fk_pais=PA.id_pais WHERE ATL.fk_pais IS NOT NULL;

