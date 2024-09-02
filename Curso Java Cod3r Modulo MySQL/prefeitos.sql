use wm;

create table if not exists prefeitos(
	id int unsigned not null auto_increment,
    nome varchar(255) not null,
    cidade_id int unsigned,
    primary key (id),
    unique key (cidade_id),
    foreign key (cidade_id) references cidades (id)
);

insert into prefeitos (nome, cidade_id) 
values ('Rodrigo Neves', 2),
	   ('Raquel Lyra', 3),
       ('Zenaldo Coutinho', null);
       
select * from prefeitos;

insert into prefeitos(nome, cidade_id)
values ('Rafael Greca', null);

insert into prefeitos(nome, cidade_id)
values ('Rodrigo Pinheiro', 3);