CREATE DATABASE GruposProfessores;

USE GruposProfessores;

CREATE TABLE professor(
	idProfessor INT PRIMARY KEY AUTO_INCREMENT,
    nomeProfessor VARCHAR(60) NOT NULL,
    disciplina VARCHAR(60)
)AUTO_INCREMENT = 10000;

CREATE TABLE grupo(
	idGrupo INT PRIMARY KEY AUTO_INCREMENT,
    nomeGrupo VARCHAR(60),
	descricaoDoProjeto VARCHAR(60)
);

CREATE TABLE aluno(
	 ra INT PRIMARY KEY,
	 nomeAluno VARCHAR(60),
     emailAluno VARCHAR(60),
	 fkGrupo INT, FOREIGN KEY (fkGrupo) REFERENCES grupo(idGrupo)
);

CREATE TABLE avaliacao(
	fkGrupo INT, FOREIGN KEY (fkGrupo) REFERENCES grupo(idGrupo),
	fkProfessor INT, FOREIGN KEY (fkProfessor) REFERENCES professor(idProfessor),
	PRIMARY KEY (fkGrupo, fkProfessor),
	notaAvalicao DECIMAL(3,1),
	dataAvaliacao DATETIME
);

-- 2

INSERT INTO professor
(nomeProfessor, disciplina)
VALUES 
('Manoel', 'Pesquisa e inovação'),
('Caio', 'Algoritmo'),
('Alex', 'Banco de dados');
        
INSERT INTO grupo
(nomeGrupo, descricaoDoProjeto)
VALUES
 ('Grupo 1', 'Sistema para Vacinas'),
 ('Grupo 2', 'Sistema para Teperatura de Cacau'),
 ('Grupo 3', 'Sistemas de Controle de Aglomeração');
        
INSERT INTO aluno
VALUES 
('0123', 'Mauricio', 'Mauricio@gmail.com', '3'),
('0328', 'Vinicius', 'Vinicius@gmail.com', '2'),
('0229', 'Kawan', 'Kawan@gmail.com', '1'),
('0145', 'Dênis', 'Dênis@gmail.com', '2');
        
INSERT INTO avaliacao
(fkGrupo,fkProfessor,notaAvalicao,dataAvaliacao)
VALUES
(1, 10000,'8','2022/02/22'),
(2, 10001,'5','2022/02/24'),
(3, 10002,'9','2022/02/23');
-- 3

SELECT * FROM grupo;   

SELECT * FROM aluno;       
 
SELECT * FROM avaliacao;

SELECT * FROM professor;


-- 5

SELECT * FROM aluno a JOIN grupo g ON  a.fkGrupo = g.idGrupo;

-- 6

SELECT * FROM aluno a JOIN grupo g ON  a.fkGrupo = g.idGrupo WHERE nomeGrupo = 'Grupo 2';

-- 7

SELECT round(AVG(notaAvalicao),2) AS 'Media das notas de todos os grupos:' FROM avaliacao;

-- 8

SELECT  MIN(notaAvalicao) AS 'Nota minima das avaliações:', MAX(notaAvalicao) AS 'Nota maxima das avaliações:' FROM avaliacao;

-- 9

SELECT SUM(notaAvalicao) AS 'soma das notas dos grupos' FROM avaliacao;

-- 10

SELECT * FROM avaliacao a JOIN professor p ON a.fkProfessor = p.idProfessor JOIN grupo g ON a.fkGrupo = g.idGrupo;

-- 11

SELECT * FROM avaliacao a JOIN professor p ON a.fkProfessor = p.idProfessor JOIN grupo g ON a.fkGrupo = g.idGrupo WHERE nomeGrupo = 'Grupo 1';

-- 12

SELECT * FROM avaliacao a JOIN professor p ON a.fkProfessor = p.idProfessor JOIN grupo g ON a.fkGrupo = g.idGrupo WHERE nomeProfessor = 'Caio';

-- 14

SELECT DISTINCT (notaAvalicao) AS 'Quantidade de notas que são diferentes:' FROM avaliacao;

-- 15

SELECT p.nomeProfessor, round(AVG(a.notaAvalicao),2) AS  'Media das notas dos grupos:', sum(a.notaAvalicao) AS  'Soma das notas dos grupos' FROM avaliacao a JOIN professor p ON a.fkProfessor = p.idProfessor WHERE nomeProfessor = 'Manoel';

-- 16

SELECT g.nomeGrupo, round(AVG(a.notaAvalicao),2) AS 'Media das notas de todos os grupos:', sum(a.notaAvalicao) AS 'soma das notas dos grupos' FROM avaliacao a JOIN grupo g ON a.fkGrupo = g.idGrupo WHERE nomeGrupo = 'Grupo 3';

-- 17

SELECT p.nomeProfessor, MIN(a.notaAvalicao) AS 'Maior Nota:', MAX(a.notaAvalicao) AS 'Menor Nota:' FROM avaliacao a JOIN professor p ON a.fkProfessor = p.idProfessor where nomeProfessor = 'Alex';

-- 18

SELECT g.nomeGrupo, MIN(a.notaAvalicao) AS 'Maior nota:', MAX(a.notaAvalicao) AS 'Menor nota:' FROM avaliacao a JOIN grupo g ON a.fkGrupo = g.idGrupo WHERE nomeGrupo = 'Grupo 1';