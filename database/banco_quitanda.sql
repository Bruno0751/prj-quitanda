CREATE TABLE test.clientes_quitanda (
	id_cliente INT AUTO_INCREMENT NOT NULL,
	nome VARCHAR(50) NULL,
    cpf VARCHAR(11) NULL,
    idade TINYINT NULL,
    data_registro DATE NOT NULL,
    hora_registro TIME NOT NULL,
    CONSTRAINT pkid_cliente PRIMARY KEY(id_cliente));
    
INSERT INTO test.clientes_quitanda
VALUES (NULL, 'Bruno', '03154619003', 25, NOW(), NOW()),
(NULL, 'Ivo', '22222222222', 60, NOW(), NOW()),
(NULL, 'Daniel', '11111111111', 30, NOW(), NOW());

CREATE TABLE test.frutas_quitanda (
	id_fruta INT AUTO_INCREMENT NOT NULL,
	nome VARCHAR(50) NULL,
    valor FLOAT(2.10) NULL,
    quantidade INT NULL,
    data_registro DATE NOT NULL,
    hora_registro TIME NOT NULL,
    CONSTRAINT pkid_fruta PRIMARY KEY(id_fruta));
    
INSERT INTO test.frutas_quitanda
VALUES (NULL, 'Abacaxi', 10.00, 50, NOW(), NOW()),
(NULL, 'Abacate', 12.50, 30, NOW(), NOW()),
(NULL, 'Pitaia', 31.10, 50, NOW(), NOW());

CREATE TABLE test.quitandas_quitanda (
	id_quitanda INT AUTO_INCREMENT NOT NULL,
	nome VARCHAR(50) NULL,
    cliente VARCHAR(50) NULL,
    funcionario VARCHAR(50) NULL,
    data_registro DATE NOT NULL,
    hora_registro TIME NOT NULL,
    CONSTRAINT pkid_quitanda PRIMARY KEY(id_quitanda));
    
INSERT INTO test.quitandas_quitanda
VALUES (NULL, 'Quitanda do seu madruga', 'Seu Osvalldo', 'KIKO', NOW(), NOW()),
(NULL, 'Quitanda do José', 'Josefina', 'Madalena', NOW(), NOW()),
(NULL, 'Quitanda dos macacos', 'KAKO', 'Chita', NOW(), NOW());