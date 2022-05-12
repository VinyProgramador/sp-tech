CREATE DATABASE petShop;
USE petShop;

 
	CREATE TABLE Cliente(
	idCliente INT PRIMARY KEY AUTO_INCREMENT,
	nomeCliente VARCHAR (50),
	telFixo VARCHAR(14),
	celCliente VARCHAR(14),
	enderecoCliente VARCHAR (45),
    clienteIndicado INT,
    FOREIGN KEY (clienteIndicado) REFERENCES Cliente(idCliente)
	);
    
    CREATE TABLE raca(
    idRaca INT PRIMARY KEY AUTO_INCREMENT ,
	nomeRaca VARCHAR(50) ,
	valorMedio DECIMAL(7,2) CHECK (valorMedio > 0)
    );
    
    SELECT * FROM raca;
    
    INSERT INTO raca VALUES 
    (Null, 'Pitbull', '600'),
    (Null, 'Vira lata', '100'),
    (Null, 'Chihuahua', '1200'),
    (Null, 'Duroc', '1000'),
    (Null, 'Himalaio', '800');

	CREATE TABLE Pet(
	 idPet INT PRIMARY KEY AUTO_INCREMENT,
	 tipoPet VARCHAR(50),
	 dtNasc DATE,
	 nomePet VARCHAR(50),
     chipPet CHAR(14) UNIQUE,
	 FK_Raca INT,
     FOREIGN KEY(FK_Raca) REFERENCES raca(idRaca),
	 FK_idCliente INT,
	 FOREIGN KEY(FK_idCliente) REFERENCES Cliente(idCliente)
	 )
     AUTO_INCREMENT=101;
     
     INSERT INTO Cliente
     (nomeCliente,telFixo,celCliente,enderecoCliente,clienteIndicado)
     VALUES
     ('Gustavo Silva','3266-1048','99489-4350','Rua Francisco Branco Barros',NULL),
     ('Ricardo Santos','1437-0876','94483-1552','Rua João Santos',NULL),
     ('Marcia Santos','2434-5950','98304-1291','Av Paulista',NULL);


     INSERT INTO Cliente
     (nomeCliente,telFixo,celCliente,enderecoCliente,clienteIndicado)
     VALUES
     ('Vinicius de Almeida','3266-1048','99489-4350','Rua AlçaPrima',01),
     ('Andrew Ferrai','9937-7776','99999-1552','Rua Joao Deodoro',02),
     ('Carlos Manoel','6734-5920','98992-2221','Av Paulo Maria',03);
     
     INSERT INTO Pet
     (tipoPet,dtNasc,nomePet,chipPet,FK_Raca,FK_idCliente)
     VALUES
     ('cachorro','2019/11/23','Pretinho','12334',2, 1),
     ('gato','2019/03/31','Tody','4567392',5, 2),
     ('cachorro','2020/05/01','Icaro','123444',2, 4),
     ('Porco','2021/12/10','Rosinha','423789',4, 3),
     ('cachorro','2020/02/26','Goran','214456',1, 1),
	 ('Coelho','2022/01/22','Leite','0948182',Null, 5),
     ('cachorro','2022/04/26','Patinhas','218456',1, null),
     ('cachorro','2020/10/06','Pipoca','190456',1, null);

	 SELECT*FROM Cliente;
     
     SELECT*FROM Pet;
     
     select*from Raca;
     
     
     
     ALTER TABLE raca RENAME COLUMN Raca TO FK_Raca;
     ALTER TABLE raca add foreign key (FK_Raca) REFERENCES raca(idRaca);
     
     SELECT * from pet as pe right join cliente as cl on pe.FK_idCliente  = cl.idCliente;
     SELECT * from pet as pe left join cliente as cl on pe.FK_idCliente  = cl.idCliente where FK_idCliente is not null;
     SELECT * from pet as pe left join cliente as cl on pe.FK_idCliente  = cl.idCliente where FK_idCliente is null;
     SELECT * from pet as pe left join cliente as cl on pe.FK_idCliente  = cl.idCliente;
     SELECT pet.nomePet, raca.nomeRaca FROM raca INNER JOIN pet ON raca.idRaca = FK_Raca;
     
     
     
     SELECT cli.nomeCliente as cliente, cli2.nomeCliente as indicado_do FROM Cliente as cli 
     INNER JOIN Cliente as cli2 on cli.clienteIndicado = cli2.idCliente;
     
     SELECT cli.nomeCliente as cliente, cli2.nomeCliente as indicado_do FROM Cliente as cli 
	 INNER JOIN Cliente as cli2 on cli.clienteIndicado = cli2.idCliente WHERE cli.clienteIndicado IS NULL;
     
     SELECT cli.nomeCliente as foiIndicado, cli2.nomeCliente as Indicador FROM Cliente as cli 
	 INNER JOIN Cliente as cli2 on cli.clienteIndicado = cli2.idCliente WHERE cli.clienteIndicado IS NOT NULL;

 
 
  SELECT cli.nomeCliente as foiIndicado, cli2.nomeCliente as Indicador FROM Cliente as cli 
  RIGHT JOIN Cliente as cli2 on cli.clienteIndicado = cli2.idCliente WHERE cli.clienteIndicado IS NULL;
     
  SELECT cli.nomeCliente as foiIndicado, cli2.nomeCliente as Indicador FROM Cliente as cli 
  LEFT JOIN Cliente as cli2 on cli.clienteIndicado = cli2.idCliente WHERE cli.clienteIndicado IS NOT NULL;