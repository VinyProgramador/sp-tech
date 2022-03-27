CREATE DATABASE Herois_Dc_Marvel;
USE  Herois_Dc_Marvel;

CREATE TABLE Herois_Dc(
  ID int,
  NomeHerois varchar(40),
  HqdoHeroi varchar(100),
  AnoCriacaoHeroi int
  );
  
  CREATE TABLE Herois_Marvel(
  ID int,
  NomeHerois varchar(40),
  HqdoHeroi varchar(100),
  AnoCriacaoHeroi int
  );
  
  INSERT INTO herois_dc
  (ID,NomeHerois,HqdoHeroi,AnoCriacaoHeroi) 
  VALUES
('1','Batman','Batman Ego','1939'),
('2','Super-Man','Homem de Aço','1989'),
('3','Mulher-Maravilha','Amazona','1987'),
('4','Aquaman','Rei de Atlanta','1999'),
('5','Flash','Flash-Point','2014'),
('6','Caçador de Marte','Alienigena','2006'),
('7','Arqueiro Verde','Alvo','1969'),
('8','SuperGirl','Prima de Ka-el','2002'),
('9','Darkside','Darkside a furia','1977'),
('10','Robin','Ano um','1986');

SELECT NomeHerois FROM herois_dc WHERE NomeHerois LIKE'Su%';


 INSERT INTO herois_Marvel
  (ID,NomeHerois,HqdoHeroi,AnoCriacaoHeroi) 
  VALUES
('1','Hiomen de ferro','Guerra','2009'),
('2','Capitão America','Homem do USA','1979'),
('3','Thanos','O ditador Roxo','1957'),
('4','Pantera Negra','Rei de Wakanda','2007'),
('5','X-man','Froça X','2019'),
('6','Dead Pool','Louco!','2001'),
('7','Gavião Arqueiro','Alvo na mira','1989'),
('8','Feiticeira Escarlate','Visão escarlate','2010'),
('9','Surfista Prateado','Homen no espaço','1973'),
('10','Homen Aranha','Grandes Responsabilidades.','2002');
Select * from herois_Marvel;





  



