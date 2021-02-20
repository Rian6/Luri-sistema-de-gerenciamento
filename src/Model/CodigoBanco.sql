create table atacado(
idatacado serial primary key,
nome varchar(18),
cnpj varchar(18),
empresa varchar(18)
);
create table produto(
idproduto serial primary key,
nome varchar(18),
quantidade numeric(18),
preco varchar(18),
codigo varchar(18)
);
create table usuario(
idusuario serial primary key,
nome varchar(18),
login varchar(18),
senha varchar(18)
);
create table freezer(
idfreezer serial primary key,
nome varchar(18),
kwh varchar(18),
status varchar(7),
tempo varchar(18)
)

