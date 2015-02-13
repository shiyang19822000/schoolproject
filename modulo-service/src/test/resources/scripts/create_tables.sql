CREATE TABLE IF NOT EXISTS schoolproject_test.public.tabelas (
	idtabela int4 NOT NULL,
	nometabela varchar(25),
	PRIMARY KEY (idtabela)
);

CREATE TABLE IF NOT EXISTS schoolproject_test.public.grupo (
	idgrupo int4 NOT NULL,
	nomegrupo varchar(40) NOT NULL,
	PRIMARY KEY (idgrupo)
);

CREATE TABLE IF NOT EXISTS schoolproject_test.public.grupo_usuarios (
	idgrupousuario int4 NOT NULL,
	idgrupo int4 NOT NULL,
	idusuario int4 NOT NULL,
	PRIMARY KEY (idgrupousuario)
);

CREATE TABLE IF NOT EXISTS schoolproject_test.public.operacao (
	idoperacao int4 NOT NULL,
	nomeoperacao varchar(25) NOT NULL,
	PRIMARY KEY (idoperacao)
);

CREATE TABLE IF NOT EXISTS schoolproject_test.public.role_grupo_operacao_tabela (
	idrole int4 NOT NULL,
	idgrupo int4 NOT NULL,
	idoperacao int4 NOT NULL,
	idtabela int4 NOT NULL,
	PRIMARY KEY (idrole)
);

ALTER TABLE schoolproject_test.public.grupo_usuarios
	ADD FOREIGN KEY (idgrupo)
	REFERENCES grupo (idgrupo);

ALTER TABLE schoolproject_test.public.grupo_usuarios
	ADD FOREIGN KEY (idusuario)
	REFERENCES usuarios (idusuario);

ALTER TABLE schoolproject_test.public.role_grupo_operacao_tabela
	ADD FOREIGN KEY (idgrupo)
	REFERENCES grupo (idgrupo);

ALTER TABLE schoolproject_test.public.role_grupo_operacao_tabela
	ADD FOREIGN KEY (idoperacao)
	REFERENCES operacao (idoperacao);

ALTER TABLE schoolproject_test.public.role_grupo_operacao_tabela
	ADD FOREIGN KEY (idtabela)
	REFERENCES tabelas (idtabela);