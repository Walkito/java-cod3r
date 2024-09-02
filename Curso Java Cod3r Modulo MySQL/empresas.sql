use wm;

create table if not exists empresas (
	id int unsigned not null auto_increment,
    nome varchar(255) not null,
    cnpj int unsigned,
    primary key (id),
    unique key (cnpj)
);

-- cidades_empresas
create table if not exists empresas_unidades (
	empresa_id int unsigned not null,
    cidade_id int unsigned not null,
    sede tinyint (1) not null,
    primary key (empresa_id, cidade_id)
);

alter table empresas modify cnpj varchar(14);

insert into empresas (nome, cnpj)
values ('Bradesco', 23508521000150),
('Vale', 24869744000105),
('Cielo', 47323809000118);

desc empresas;
desc prefeitos;
select * from empresas;
select * from cidades;
select * from empresas_unidades;

insert into empresas_unidades (empresa_id, cidade_id, sede)
values (1, 1, 1),
	   (1, 2, 0),
       (2, 1, 0),
       (2, 2, 1);
       
select * from empresas_unidades;
       
