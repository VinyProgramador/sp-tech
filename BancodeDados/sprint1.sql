-- 1. No MySQL Workbench, utilizando o banco de dados ‘sprint1’:
-- Escreva e execute os comandos para:
-- • Criar a tabela chamada Atleta para conter os dados: idAtleta (int e chave primária da
-- tabela), nome (varchar, tamanho 40), modalidade (varchar, tamanho 40), qtdMedalha
-- (int, representando a quantidade de medalhas que o atleta possui)
-- • Inserir dados na tabela, procurando colocar mais de um atleta para cada modalidade
-- e pelo menos 5 atletas.
-- Execute os comandos para:


CREATE DATABASE sprint1;
USE sprint1;

CREATE TABLE Atleta (
idAtleta int primary key,
nome VARCHAR(40),
modalidade VARCHAR(40),
qtdMedalha INT
);

INSERT INTO Atleta
(idAtleta,nome,modalidade,qtdMedalha)
 VALUES
 ('01','Gabriel Medina','Surf','4'),
 ('02','Italo Ferreira ','Surf','3'),
 ('03','Neymar Junior','Futebol','26'),
 ('04','Cristiano Ronaldo','Futebol','32'),
 ('05','Stephen Curry','Basketball ','5'),
 ('06','LeBron James','Basketball ','8'),
 ('07','Novak Djokovic','Tênis','44'),
 ('08','Serena Williams','Tênis','39'),
 ('09','Patrick Mahomes','Futebol americano','8'),
 ('10','Russell Wilson','Futebol americano','5'),
 ('11','Caeleb Dressel ','Natação','7'),
 ('12','Emma McKeon','Natação','4');
 


-- Exibir todos os dados da tabela.
SELECT*FROM Atleta;
-- Atualizar a quantidade de medalhas do atleta com id=1;
UPDATE Atleta SET qtdMedalha='50' WHERE idAtleta=01;
-- Atualizar a quantidade de medalhas do atleta com id=2 e com o id=3;
UPDATE Atleta SET qtdMedalha='70' WHERE idAtleta in(02,03);
-- Atualizar o nome do atleta com o id=4;
UPDATE Atleta SET nome ='Joanzinho' WHERE idAtleta =4;
-- Adicionar o campo dtNasc na tabela, com a data de nascimento dos atletas, tipo date
ALTER TABLE Atleta ADD dtNasc DATE;

-- Atualizar a data de nascimento de todos os atletas;
UPDATE Atleta SET dtNasc='2000/09/13' WHERE idAtleta='01';
UPDATE Atleta SET dtNasc='1997/07/02' WHERE idAtleta='02';
UPDATE Atleta SET dtNasc='1985/05/27' WHERE idAtleta='03';
UPDATE Atleta SET dtNasc='1993/10/04' WHERE idAtleta='04';
UPDATE Atleta SET dtNasc='1992/09/18' WHERE idAtleta='05';
UPDATE Atleta SET dtNasc='1982/07/30' WHERE idAtleta='06';
UPDATE Atleta SET dtNasc='1977/01/24' WHERE idAtleta='07';
UPDATE Atleta SET dtNasc='1996/08/11' WHERE idAtleta='08';
UPDATE Atleta SET dtNasc='1999/12/04' WHERE idAtleta='09';
UPDATE Atleta SET dtNasc='2001/10/27' WHERE idAtleta='10';
UPDATE Atleta SET dtNasc='1990/11/29' WHERE idAtleta='11';
UPDATE Atleta SET dtNasc='1981/08/24' WHERE idAtleta='12';


-- Excluir o atleta com o id=5
DELETE FROM Atleta WHERE idAtleta='05';

-- Exibir os atletas onde a modalidade é diferente de natação
SELECT nome,modalidade FROM Atleta WHERE modalidade <> 'Natação';

-- Exibir os dados dos atletas que tem a quantidade de medalhas maior ou igual a 3
SELECT* FROM Atleta WHERE qtdMedalha >=3;

-- Modificar o campo modalidade do tamanho 40 para o tamanho 60
ALTER TABLE Atleta MODIFY modalidade VARCHAR (60);

-- Descrever os campos da tabela mostrando a atualização do campo modalidade
DESCRIBE Atleta modalidade;

--  Limpar os dados da tabela; 
TRUNCATE TABLE Atleta;






-- 2. No MySQL Workbench, utilizando o banco de dados ‘sprint1’:
-- Criar a tabela chamada Musica para conter os dados: idMusica, titulo (tamanho 40), artista
-- (tamanho 40), genero (tamanho 40), sendo que idMusica é a chave primária da tabela.
-- Inserir dados na tabela, procurando colocar um gênero de música que tenha mais de uma
-- música, e um artista, que tenha mais de uma música cadastrada. Procure inserir pelo
-- menos umas 7 músicas.
-- Execute os comandos para:

CREATE TABLE Musica(
idMusica INT PRIMARY KEY,
titulo CHAR(40),
artista CHAR(40),
genero CHAR(40)
);
 
 INSERT INTO Musica
 (idMusica,titulo,artista,genero)
 VALUES
 ('01','dusk till dawn','Zayn','pop'),
 ('02','save your thears','Zayn','pop'),
 ('03','máquina do tempo','Matuê','trap'),
 ('04','3am','Matuê','trap'),
 ('05','morena','Gusttavo Lima','sertanejo'),
 ('06','milú','Gusttavo Lima','sertanejo'),
 ('07','como tudo deve ser','charlie brown jr','rock'),
 ('08','céu azul','charlie brown jr.','rock'),
 ('09','sicko mode','David Guetta','eletronica'),
 ('10','titanium','David Guetta','eletronica'),
 ('11','negro drama','Racionais Mcs','rap'),
 ('12','jesus chorou','Racionais Mcs','rap'),
 ('13','ritmo dos mandela','Mc Pedrinho','funk','100'),
 ('14','cavalo de troia','Mc Kevin','funk','100');


 -- Exibir todos os dados da tabela.
SELECT*FROM Musica;

-- Adicionar o campo curtidas do tipo int na tabela
ALTER TABLE Musica ADD curtidas INT;

-- Atualizar o campo curtidas de todas as músicas inseridas;
UPDATE  Musica SET curtidas='100' WHERE idMusica;
	
-- Modificar o campo artista do tamanho 40 para o tamanho 80;
ALTER TABLE Musica MODIFY artista CHAR (80);

-- Atualizar a quantidade de curtidas da música com id=1
UPDATE Musica SET curtidas='180' WHERE idMusica='01';

-- Atualizar a quantidade de curtidas das músicas com id=2 e com o id=3
UPDATE Musica Set curtidas='300' WHERE idMusica IN ('01','02');

-- Atualizar o nome da música com o id=5
UPDATE Musica SET titulo='na hora de amar' WHERE idMusica='05';

-- Excluir a música com o id=4
DELETE FROM Musica WHERE idMusica='04';

-- Exibir as músicas onde o gênero é diferente de funk;
SELECT*FROM  Musica WHERE genero <> 'funk';

-- Exibir os dados das músicas que tem curtidas maior ou igual a 20
SELECT*FROM Musica WHERE curtidas >= 20;

-- Descrever os campos da tabela mostrando a atualização do campo artista
DESCRIBE Musica artista;

-- Limpar os dados da tabela
TRUNCATE TABLE Musica;



-- 3. No MySQL Workbench, utilizando o banco de dados ‘sprint1’:
-- Criar a tabela chamada Filme para conter os dados: idFilme, título (tamanho 50), genero
-- (tamanho 40), diretor (tamanho 40), sendo que idFilme é a chave primária da tabela.
-- Inserir dados na tabela, procurando colocar um gênero de filme que tenha mais de um
-- filme, e um diretor, que tenha mais de um filme cadastrado. Procure inserir pelo menos
-- uns 7 filmes.

CREATE TABLE Filme(
idFilme INT PRIMARY KEY,
título CHAR(50),
genero CHAR(40),
diretor CHAR(40)
);

INSERT INTO Filme
(idFilme,título,genero,diretor)
VALUES
('01','Batman vs Superman','herois','Zack Snyder'),
('02','Man of Stell','herois','Zack Snyder'),
('03','Dunkirk','guerra','Christopher Nolan'),
('04','Tenet','guerra','Christopher Nolan'),
('05','missão resgate','ação','Jonathan Hensleigh'),
('06','infiltrado','ação','Jonathan Hensleigh'),
('07','Por Lugares Incríveis','romance','Brett Haley'),
('08','Adoráveis Mulheres','romance','Brett Haley'),
('09','Espíritos Obscuros','terror','Scott Cooper'),
('10','Chamado a Meia Noite','terror','Scott Cooper'),
('11','Free Guy','comédia','Shawn Levy'),
('12','Alerta Vermelho','comédia','Shawn Levy'),
('13','Assalto ao Banco da Espanha','suspense','Antoine Fuqua','Mark Wahlberg'),
('14','infinito','suspense','Antoine Fuqua','Mark Wahlberg' );



-- Exibir todos os dados da tabela.
SELECT*FROM Filme;

-- Adicionar o campo protagonista do tipo varchar(50) na tabela;
ALTER TABLE Filme ADD protagonista VARCHAR(50);

-- Atualizar o campo protagonista de todas os filmes inseridos;
UPDATE Filme SET protagonista='Henry Cavill' WHERE idFilme=01;
UPDATE Filme SET protagonista='Henry Cavill' WHERE idFilme=02;
UPDATE Filme SET protagonista='	Harry Styles' WHERE idFilme=03;
UPDATE Filme SET protagonista='Robert Pattinson' WHERE idFilme=04;
UPDATE Filme SET protagonista='Liam Neeson' WHERE idFilme=05;
UPDATE Filme SET protagonista='Jason Statham' WHERE idFilme=06;
UPDATE Filme SET protagonista='Justice Smith' WHERE idFilme=07;
UPDATE Filme SET protagonista='Saoirse Ronan' WHERE idFilme=08;
UPDATE Filme SET protagonista='Scott Cooper' WHERE idFilme=09;
UPDATE Filme SET protagonista='Kate Siegel' WHERE idFilme=10;
UPDATE Filme SET protagonista='Ryan Reynolds' WHERE idFilme=11;
UPDATE Filme SET protagonista='The Rock' WHERE idFilme=12;

-- Modificar o campo diretor do tamanho 40 para o tamanho 150;
ALTER TABLE Filme MODIFY diretor CHAR(150);

-- Atualizar o diretor do filme com id=5
UPDATE Filme SET diretor='James Gun' WHERE idFilme=05;

-- Atualizar o diretor dos filmes com id=2 e com o id=7
UPDATE Filme SET diretor ='Paul Dano' WHERE idFilme IN ('02','07');

-- Atualizar o título do filme com o id=6;
UPDATE Filme Set título='infiltrado totalmente!' WHERE idFilme=06;

-- Excluir o filme com o id=3;
DELETE FROM Filme WHERE idFilme=03;

-- Exibir os filmes em que o gênero é diferente de drama;
SELECT *FROM Filme WHERE genero <> 'drama';

-- Exibir os dados dos filmes que o gênero é igual ‘suspense’;
SELECT *FROM Filme WHERE genero = 'suspense';

-- Descrever os campos da tabela mostrando a atualização do campo protagonista e diretor;
describe Filme protagonista  ;
describe Filme diretor ;

-- Limpar os dados da tabela; 
TRUNCATE TABLE Filme;





-- 4 No MySQL Workbench, utilizando o banco de dados ‘sprint1’:
-- Criar a tabela chamada Professor para conter os dados: idProfessor, nome (tamanho 50),
-- especialidade (tamanho 40), dtNasc (date), sendo que idProfessor é a chave primária da
-- tabela.
-- Exemplo do campo data: ‘AAAA-MM-DD’, ‘1983-10-13’.
-- Inserir dados na tabela, procurando colocar uma especialista para mais de um professor.
-- Procure inserir pelo menos uns 6 professores.
-- Execute os comandos para

CREATE TABLE Professor(
idProfessor INT PRIMARY KEY,
nome CHAR(50),
especialidade CHAR(40),
dtNasc DATE
);
INSERT INTO Professor
(idProfessor,nome,especialidade,dtNasc)
VALUES
('01','Arnaldo Pereira','Historia','1999/10/27'),
('02','Caio Gulart','Historia','2000/03/15'),
('03','Denise Campos','Portugues','1996/08/19'),
('04','Clara de Almeida','Portugues','1993/10/27'),
('05','Fernando Neto','Matematica','1984/12/29'),
('06','Fabrina Tristão','Matematica','1977/01/08'),
('07','Vinicius de Almeida','Programação Web','1978/05/12'),
('08','Bruno Armando','Programação Web','2001/07/21'),
('09','Bruna Amaral','Arquitetura Computacional','1994/03/13'),
('10','Joana Silva','Arquitetura Computacional','1992/09/12'),
('11','Alex Barreira','Banco de Dados','1990/03/27'),
('12','Alex Edinaldo','Banco de Dados','1991/04/03'),
('13','Gabriele Matos','Projeto e Inovação','1992/09/04'),
('14','Renata de Andrade','Projeto e Inovação','1993/01/06'),
('15','Ruí Barbosa','Algoritimos','1972/04/16'),
('16','Heitor Nunes','Algoritimos','1996/06/22');


-- Exibir todos os dados da tabela.
SELECT*FROM Professor;

-- Adicionar o campo funcao do tipo varchar(50), onde a função só pode ser ‘monitor’,‘assistente’ ou ‘titular’
ALTER TABLE Professor ADD funcao VARCHAR(50);

-- Atualizar os professores inseridos e suas respectivas funções;
UPDATE Professor SET funcao='titular' WHERE idProfessor =01;
UPDATE Professor SET funcao='monitor' WHERE idProfessor =02;
UPDATE Professor SET funcao='titular' WHERE idProfessor =03;
UPDATE Professor SET funcao='titular' WHERE idProfessor =04;
UPDATE Professor SET funcao='monitor' WHERE idProfessor =05;
UPDATE Professor SET funcao='titular' WHERE idProfessor =06;
UPDATE Professor SET funcao='assistente' WHERE idProfessor =07;
UPDATE Professor SET funcao='titular' WHERE idProfessor =08;
UPDATE Professor SET funcao='titular' WHERE idProfessor =09;
UPDATE Professor SET funcao='assistente' WHERE idProfessor =10;
UPDATE Professor SET funcao='titular' WHERE idProfessor =11;
UPDATE Professor SET funcao='monitor' WHERE idProfessor =12;
UPDATE Professor SET funcao='titular' WHERE idProfessor =13;
UPDATE Professor SET funcao='monitor' WHERE idProfessor =14;
UPDATE Professor SET funcao='assistente' WHERE idProfessor =15;
UPDATE Professor SET funcao='titular' WHERE idProfessor =16;

-- Inserir um novo professor
INSERT INTO Professor 
(idProfessor,nome)
VALUES
('17','Marcos Teixeira');

-- Excluir o professor onde o idProfessor é igual a 5;
DELETE FROM Professor WHERE idProfessor ='05';

-- Excluir o professor onde o idProfessor é igual a 5;
SELECT*FROM Professor WHERE funcao='titular';

-- Exibir apenas as especialidades e as datas de nascimento dos professores monitores;
SELECT dtNasc,especialidade FROM Professor WHERE funcao='monitor' ; 

-- Atualizar a data de nascimento do idProfessor igual a 3;
UPDATE Professor SET dtNasc ='1991/09/13' WHERE idProfessor=03;

-- Limpar a tabela Professor
TRUNCATE TABLE Professor;



-- 5 No MySQL Workbench, utilizando o banco de dados ‘sprint1’:
-- Criar a tabela chamada Curso para conter os dados: idCurso, nome (tamanho 50), sigla
-- (tamanho 3), coordenador, sendo que idCurso é a chave primária da tabela.
-- Inserir dados na tabela, procure inserir pelo menos 3 cursos.
-- Execute os comandos para:

CREATE TABLE Curso(
idCurso INT PRIMARY KEY,
nome CHAR(50),
sigla CHAR(3),
coordenador CHAR(40)
);

INSERT INTO Curso
(idCurso,nome,sigla,coordenador)
VALUES
('01','Tecnologia da Informação','TI','Mauro'),
('02','Análise e Desenvolvimento de Sistemas','ADS','Denis'),
('03','Sistemas da Informação','SSI','Samanta'),
('04','Ciência da Computação','CCO','Clodoaldo'),
('05','Tecnologia em Banco de Dados','TBD','Marisa'),
('06','Engenharia da Computação','ENG','Marcos'),
('07','Big Data Analytics','BDA','Paulo'),
('08','Engenharia de Controle e Automação','ECA','Monica'),
('09','Sistemas para Internet','SI','Alberto'),
('10','Programação para Jogos','PPJ','Caio');


 -- Exibir todos os dados da tabela.
SELECT*FROM Curso;

-- Exibir apenas os coordenadores dos cursos
SELECT coordenador FROM Curso;

-- Exibir apenas os dados dos cursos de uma determinada sigla.
SELECT*FROM Curso WHERE sigla='ADS';

-- Exibir os dados da tabela ordenados pelo nome do curso.
SELECT*FROM Curso ORDER BY nome ASC;

-- Exibir os dados da tabela ordenados pelo nome do coordenador em ordem decrescente.
SELECT*FROM Curso ORDER BY coordenador DESC;

-- Exibir os dados da tabela, dos cursos cujo nome comece com uma determinada letra.
SELECT*FROM Curso WHERE nome LIKE 'A%'; 

-- Exibir os dados da tabela, dos cursos cujo nome termine com uma determinada letra.
SELECT*FROM Curso WHERE nome LIKE '%S';

-- Exibir os dados da tabela, dos cursos cujo nome tenha como segunda letra uma determinada letra
SELECT*FROM Curso WHERE nome LIKE '_N%';

-- Exibir os dados da tabela, dos cursos cujo nome tenha como penúltima letra uma determinada letra
SELECT*FROM Curso WHERE nome LIKE '%E_';

-- Elimine a tabela.
DROP TABLE Curso;



-- 6 No MySQL Workbench, utilizando o banco de dados ‘sprint1’:
-- Você vai criar uma tabela para armazenar os dados de revistas (como por ex: Veja, Isto é,
-- Epoca, Quatro Rodas, Claudia, etc).
-- Escreva e execute os comandos para:
-- Criar a tabela chamada Revista para conter os campos: idRevista (int e chave
-- primária da tabela), nome (varchar, tamanho 40), categoria (varchar, tamanho 30). Os
-- valores de idRevista devem iniciar com o valor 1 e ser incrementado automaticamente
-- pelo sistema.
-- Inserir 4 registros na tabela, mas sem informar a categoria.
-- Escreva e execute os comandos para:

CREATE TABLE Revista(
idRevista INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(40),
categoria VARCHAR(30)

)AUTO_INCREMENT = 01;


INSERT INTO Revista
(nome)
VALUES
('Veja'),
('Isto é'),
('Epoca'),
('Quatro Rodas'),
('Claudia');

-- Exibir todos os dados da tabela.
SELECT*FROM Revista;

-- Atualize os dados das categorias das 3 revistas inseridas. Exibir os dados da tabela novamente para verificar se atualizou corretamente
UPDATE Revista SET categoria='Notícias' WHERE idRevista=01;
UPDATE Revista SET categoria='Arte‎' WHERE idRevista=02;
UPDATE Revista SET categoria='Arquitetura‎' WHERE idRevista=03;
UPDATE Revista SET categoria='Automobilismo' WHERE idRevista=04;
UPDATE Revista SET categoria='Agricultura‎' WHERE idRevista=05;

-- Insira mais 3 registros completos.
INSERT INTO Revista
(nome,categoria)
VALUES
('A Sentinela','Religiosa '),
('BusinessWeek','Economia'),
('Capricho','Revista de Adolescentes');

-- Exibir novamente os dados da tabela.
SELECT*FROM Revista;

-- Exibir a descrição da estrutura da tabela.
DESCRIBE Revista;

-- Alterar a tabela para que a coluna categoria possa ter no máximo 40 caracteres.
ALTER TABLE Revista MODIFY categoria VARCHAR(40);

-- Exibir novamente a descrição da estrutura da tabela, para verificar se alterou o tamanho da coluna categoria
DESCRIBE Revista;

-- Acrescentar a coluna periodicidade à tabela, que é varchar(15).
ALTER TABLE Revista ADD periodicidade VARCHAR(15);

-- Exibir os dados da tabela.
SELECT*FROM Revista;

-- Excluir a coluna periodicidade da tabela.
ALTER TABLE Revista DROP COLUMN periodicidade;