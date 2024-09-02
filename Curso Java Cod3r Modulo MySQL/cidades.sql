use wm;

create table if not exists cidades (
	id int unsigned not null auto_increment,
    nome varchar(255) not null,
    estado_id int unsigned not null,
    area decimal(10,2),
    primary key (id),
    foreign key (estado_id) references estados (id)
);

-- create table if not exists teste(
-- 	id int unsigned not null auto_increment primary key
-- );

-- drop table if exists teste;

select * from estados;

insert into cidades (nome, area, estado_id)
values ('Campinas', 795, 28);

insert into cidades (nome, area, estado_id)
values ('Niteroi', 795, 22);

insert into cidades (nome, area, estado_id)
values (
'Caruaru', 
920.6, 
(select id from estados where sigla = 'PE')
);

insert into cidades (nome, area, estado_id)
values (
'Juazeiro do Norte', 
248.2, 
(select id from estados where sigla = 'CE')
);


