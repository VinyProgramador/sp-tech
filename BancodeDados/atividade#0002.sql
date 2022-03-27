CREATE DATABASE SaladeAula;
USE SaladeAula;

CREATE TABLE Amigos (
     id int,
	 Nome char(40),
     NomedaMae char(40));
     
    
  INSERT INTO Amigos
  (id,Nome,NomedaMae)
  VALUES
   ('1','Benício Araújo','Maraisa Araújo'),
   ('2','Bruno Armando','Emerson Armando'),
   ('3','Cleber Machado','Maria Machado'),
   ('4','Edson Arantes','Clara Arantes'),
   ('5','Murilo Souza','Cleuza Souza'),
   ('6','Aldemir Nunes','Vania Nunes'),
   ('7','Vinicius Almeida ','Suellen Almeida'),
   ('8','Isabella Teobaldo','Christina Teobaldo'),
   ('9','Marcos Assunção Araújo','Paula Assunção'),
   ('10','Geovana Maciel','Tereza Maciel'),
   ('11','Pedro Marques','Isis Marques'),
   ('12','Oldair Pereira','Luiza Pereira'),
   ('13','Bruna Souza','Natalia Souza'),
   ('14','Annie Alencar','Maisa Alencar'),
   ('15','Paulo Andrade','Amanda Andrade');
   
  
  -- SELECT Nome FROM Amigos  where Nome='Oldair Pereira';
  -- SELECT Nome FROM Amigos  where Nome like '%air Pereira';
  
  SELECT*FROM AmigosLegais;
  -- ALTER TABLE Amigos Rename to AmigosLegais;
  -- ALTER TABLE AmigosLegais
  -- RENAME COLUMN Nome to NomeAlunos;
  -- UPDATE AmigosLegais SET NomeAlunos='Paulo Andrade Torres' WHERE id='15';
  
  SELECT*FROM AmigosLegais;