CREATE SEQUENCE public.materias_sequencer INCREMENT BY 1 NO MINVALUE NO MAXVALUE START WITH 1 NO CYCLE;

CREATE TABLE IF NOT EXISTS schoolproject_test.public.materias (
	idmateria int4 NOT NULL DEFAULT NEXTVAL('materias_sequencer'),
	nomemateria varchar(40) NOT NULL,
	PRIMARY KEY (idmateria)
);