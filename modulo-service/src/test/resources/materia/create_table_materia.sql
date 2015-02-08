CREATE SEQUENCE public.materias_sequencer INCREMENT BY 1 NO MINVALUE NO MAXVALUE START WITH 1 NO CYCLE;
CREATE SEQUENCE public.usuarios_sequencer INCREMENT BY 1 NO MINVALUE NO MAXVALUE START WITH 1 NO CYCLE;

CREATE TABLE IF NOT EXISTS schoolproject_test.public.materias (
	idmateria int4 NOT NULL DEFAULT NEXTVAL('materias_sequencer'),
	nomemateria varchar(40) NOT NULL,
	PRIMARY KEY (idmateria)
);

CREATE TABLE schoolproject_test.public.usuarios (
	idusuario int4 DEFAULT nextval('usuarios_sequencer') NOT NULL,
	nomeusuario varchar(50) NOT NULL,
	senhausuario varchar(10) NOT NULL,
	emailusuario varchar(40) NOT NULL,
	PRIMARY KEY (idusuario)
);