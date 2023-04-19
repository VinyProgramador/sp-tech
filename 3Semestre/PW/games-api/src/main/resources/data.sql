INSERT INTO Company
(name,year_creation)
VALUES
('Nintendo', '1990-03-15'),
('Santa Monica', '2000-07-10'),
('Warner Games', '1987-01-17');

INSERT INTO Game
(name,year_launch,is_ratedr,company_id)
VALUES
('Zelda ocarina of time','1998-11-01',false,1),
('Zelda Tears of the Kingdom','2023-01-01',false,1),
('God of War 3','2010-02-15',true,2),
('God of War Ragnarok','2022-11-10',true,2),
('Batman Arkham Knight','2016-07-21',false,3);
