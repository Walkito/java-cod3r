use wm;

select e.nome as Estado, 
	   c.nome as Cidade,
       e.regioes as Região
from estados e, cidades c 
where e.id = c.estado_id;

-- Inner Join
select
	c.nome as Cidade,
	e.nome as Estado,
    regioes as Região
from estados e
inner join cidades c on e.id = c.estado_id;

select * from cidades c inner join prefeitos p on c.id = p.cidade_id;

-- Left Join

select * from cidades c left join prefeitos p on c.id = p.cidade_id;

-- Right Join

select * from cidades c right join prefeitos p on c.id = p.cidade_id;

-- Full Join

select * from cidades c left join prefeitos p on c.id = p.cidade_id
union
select * from cidades c right join prefeitos p on c.id = p.cidade_id;