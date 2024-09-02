use wm;

-- Criando a tabela estado
create table estados (
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(45) NOT NULL,
    sigla VARCHAR(2),
    regioes ENUM('Norte', 'Nordeste', 'Centro-Oeste', 'Sudeste', 'Sul') NOT NULL,
    populacao DECIMAL(5,2) NOT NULL,
    PRIMARY KEY (id),
    UNIQUE KEY (nome),
    UNIQUE KEY (sigla)
);

-- Inserindo valores na tabela estados
INSERT INTO estados (nome, sigla, regioes, populacao) VALUES ('Acre', 'AC', 'Norte', 0.83);
INSERT INTO estados (nome, sigla, regioes, populacao) VALUES ('Alagoas', 'AL', 'Norte', 3.38), 
('Amapá', 'AP', 'Norte', 0.8), ('Amazonas', 'AM', 'Norte', 4.06);

INSERT INTO estados
    (nome, sigla, regioes, populacao)
VALUES
    ('Bahia', 'BA', 'Nordeste', 15.34),
    ('Ceará', 'CE', 'Nordeste', 9.02),
    ('Distrito Federal', 'DF', 'Centro-Oeste', 3.04),
    ('Espírito Santo', 'ES', 'Sudeste', 4.02),
    ('Goiás', 'GO', 'Centro-Oeste', 6.78),
    ('Maranhao', 'MA', 'Nordeste', 7.00),
    ('Mato Grosso', 'MT', 'Centro-Oeste', 3.34),
    ('Mato Grosso do Sul', 'MS', 'Centro-Oeste', 2.71),
    ('Minas Gerais', 'MG', 'Sudeste', 21.12),
    ('Pará', 'PA', 'Norte', 8.36),
    ('Paraíba', 'PB', 'Nordeste', 4.03),
    ('Parana', 'PR', 'Sul', 11.22),
    ('Pernambuco', 'PE', 'Nordeste', 9.47),
    ('Piauí', 'PI', 'Nordeste', 3.22),
    ('Rio de Janeiro', 'RJ', 'Sudeste', 16.72),
    ('Rio Grande do Norte', 'RN', 'Nordeste', 3.51),
    ('Rio Grande do Sul', 'RS', 'Sul', 11.32),
    ('Rondônia', 'RO', 'Norte', 1.81),
    ('Roraima', 'RR', 'Norte', 0.52),
    ('Santa Catarina', 'SC', 'Sul', 7.01),
    ('São Paulo', 'SP', 'Sudeste', 45.10),
    ('Sergipe', 'SE', 'Nordeste', 2.29),
    ('Tocantins', 'TO', 'Norte', 1.55);

-- Consultando tabela estados
SELECT * FROM estados;

SELECT 
	nome as 'Nome do Estado', 
    sigla 
FROM estados 
WHERE regioes = 'sul';

SELECT nome, regioes, populacao FROM estados WHERE populacao >= 10 ORDER BY populacao DESC;

-- Atualizando tabela estado
UPDATE estados
SET nome = 'Maranhão'
WHERE sigla = 'MA';

SELECT est.nome FROM estados est WHERE sigla = 'MA';

UPDATE estados
SET nome = 'Paraná', populacao = 11.32
WHERE sigla = 'PR';

SELECT est.nome, sigla, populacao FROM estados est WHERE sigla = 'PR';

INSERT INTO estados (id, nome, sigla, regioes, populacao)
VALUES (1000, 'Novo', 'NV', 'Sul', 2.54);

INSERT INTO estados (nome, sigla, regioes, populacao)
VALUES ('Mais Novo', 'MN', 'Norte', 2.51);

SELECT * FROM estados;

DELETE FROM estados
WHERE sigla = 'MN';

SELECT * FROM estados;

DELETE FROM estados WHERE id >= 1000;

SELECT * FROM estados;

-- Consulta Agregada

SELECT regioes AS 'Região', SUM(populacao) AS Total FROM estados GROUP BY regioes ORDER BY Total DESC;