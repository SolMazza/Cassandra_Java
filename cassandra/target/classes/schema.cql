create keyspace if not exists unidade_popular with replication = {'class':'SimpleStrategy', 'replication_factor':1};
create table if not exists movimentos_socias(id UUID PRIMARY KEY, message text, fundacao date);

Insert queries:
 insert into unidade_popular.movimentos_socias(id, message, fundacao) values (uuid(), 'Movimento de Lutas nos Bairros Vilas e Favelas(MLB)', '1999-01-01');