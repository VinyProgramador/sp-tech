-- 01
CREATE DATABASE escolaIdioma;
USE escolaIdioma;

CREATE TABLE Curso(
idCurso int primary key auto_increment,
nomeCurso varchar(70),
coordenador varchar(70)
);

SELECT*FROM Curso;

CREATE TABLE aluno(
idAluno int primary key auto_increment,
nome varchar(70),
ra varchar (10) unique,
bairro varchar(70)
);

SELECT*FROM aluno;

CREATE TABLE cursoDoAluno(
idcursoDoAluno int primary key auto_increment,
FKCurso int,
foreign key (FKCurso) references Curso (idCurso),
FKaluno int,
foreign key (FKaluno) references aluno (idAluno),

nota decimal(3,1),
dtInicio date,
nivelAluno varchar(50),
check (nivelAluno ='iniciante' or nivelAluno='intermediario' or nivelAluno='avançado' )
);

INSERT INTO Curso 
(nomeCurso,coordenador)
VALUES
('Ingles','Cleber'),
('Espanhol','Mauro'),
('Italiano','Cezar');

INSERT INTO aluno
(nome,ra,bairro)
VALUES
('Felipe','017','Alphaville'),
('Alex','018','São Carlos'),
('Andrew','019','Itaquera');

INSERT INTO cursoDoAluno
(FKCurso,FKaluno,nota,dtInicio,nivelAluno)
VALUES
('01','01',8,'2022/06/30','iniciante'),
('02','02',9,'2020/06/05','intermediario'),
('03','03',6,'2019/06/18','avançado');

-- 02
SELECT*FROM Curso;
SELECT*FROM aluno;
SELECT*FROM cursoDoAluno;

-- 03
SELECT * FROM aluno INNER JOIN curso ON aluno.idAluno = Curso.idCurso order by idAluno desc;

-- 04
 SELECT * FROM aluno INNER JOIN curso ON aluno.idAluno = Curso.idCurso WHERE nomeCurso='espanhol';
 
 -- 05 
 SELECT * FROM aluno INNER JOIN cursoDoAluno ON aluno.idAluno = cursoDoAluno.idcursoDoAluno;
 
 -- 06 
  select round(avg(nota),2) as 'Media de Notas' from cursoDoAluno;

-- 07 
select min(nota) as 'Menor nota', max(nota) as 'Maior nota' from cursoDoAluno;

-- 08
select nomeCurso, min(nota) as 'Menor nota', max(nota) as 'Maior nota' from cursoDoAluno
inner join curso on curso.idCurso = cursoDoAluno.idcursoDoAluno
GROUP BY nomeCurso;

-- 9
select nome, min(nota) as 'Menor nota', max(nota) as 'Maior nota' from Aluno
inner join cursoDoAluno on aluno.idAluno = cursoDoAluno.idcursoDoAluno
GROUP BY nome;

-- 10
SELECT nota  as 'Nota dos Alunos'from cursoDoAluno;

-- 11
SELECT distinct nota 'Nota dos Alunos distintas'from cursoDoAluno;

-- 12 
SELECT count(nota) 'Nota dos Alunos quantidade:'from cursoDoAluno;

-- 13 
SELECT count(distinct nota) 'Nota dos Alunos distintas da tabela'from cursoDoAluno;



