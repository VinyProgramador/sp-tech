CREATE DATABASE AtividadeJoin;
USE AtividadeJoin; 

CREATE TABLE Pais(
id_pais INT PRIMARY KEY AUTO_INCREMENT,
continente VARCHAR(50),
idioma VARCHAR(50),
siglaPais VARCHAR(50)
);

INSERT INTO Pais
(continente,idioma,siglaPais)
VALUES
('Asiatica','Tailandes','ASI'),
('Europa','Espanhol','EU'),
('America Sul','Espanhol','AMS');



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
SELECT*FROM Atleta;

SELECT id_atleta,fk_pais,genero,nomeAtleta,modalidade,qtdMedalha,dtMedalha,idioma,siglaPais FROM Atleta JOIN Pais ON id_pais = fk_pais;

SELECT nomeAtleta,modalidade,continente,idioma FROM Atleta INNER JOIN Pais ON id_pais = fk_pais;



CREATE TABLE modalidade(
id_modalidade INT PRIMARY KEY AUTO_INCREMENT,
fk_Atleta INT,
FOREIGN KEY (fk_Atleta)REFERENCES Atleta(id_atleta),
epocaModalidade CHAR(1), 
CHECK (epocaModalidade = 'I' or epocaModalidade='V'),
paisOlimpiadas VARCHAR(50)
);
INSERT INTO modalidade
(fk_Atleta,epocaModalidade,paisOlimpiadas)
VALUES
('01','V','Tokyo'),
('02','V','Brasil'),
('03','V','Brasil');

SELECT id_atleta,epocaModalidade,paisOlimpiadas,nomeAtleta FROM Atleta INNER JOIN modalidade ON id_atleta = fk_Atleta;









