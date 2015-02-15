INSERT INTO schoolproject_test.public.grupo(idgrupo, nomegrupo) VALUES (1, 'adm');
INSERT INTO schoolproject_test.public.grupo(idgrupo, nomegrupo) VALUES (2, 'estudante');
INSERT INTO schoolproject_test.public.grupo(idgrupo, nomegrupo) VALUES (3, 'professor');


INSERT INTO schoolproject_test.public.grupo_usuarios(idgrupousuario,idgrupo, idusuario) VALUES (1,1, 1);
INSERT INTO schoolproject_test.public.grupo_usuarios(idgrupousuario,idgrupo, idusuario) VALUES (2,2, 2);
INSERT INTO schoolproject_test.public.grupo_usuarios(idgrupousuario,idgrupo, idusuario) VALUES (3,1, 2);
INSERT INTO schoolproject_test.public.grupo_usuarios(idgrupousuario,idgrupo, idusuario) VALUES (4,3, 3);

INSERT INTO schoolproject_test.public.materias(nomemateria) VALUES ('TESTE SEFAZ eiiii');
INSERT INTO schoolproject_test.public.materias(nomemateria) VALUES ('Opa ! Leandro ! blz ?');
INSERT INTO schoolproject_test.public.materias(nomemateria) VALUES ('Vai tafarel ! vai q Ã© sua !');
INSERT INTO schoolproject_test.public.materias(nomemateria) VALUES ('TESTE SEFAZ 333');
INSERT INTO schoolproject_test.public.materias(nomemateria) VALUES ('o naufrago');
INSERT INTO schoolproject_test.public.materias(nomemateria) VALUES ('ai vou eu ! epa');

INSERT INTO schoolproject_test.public.tabelas(idtabela, nometabela)VALUES (1, 'materia');

INSERT INTO schoolproject_test.public.operacao(idoperacao, nomeoperacao) VALUES (1, 'inserir');
INSERT INTO schoolproject_test.public.operacao(idoperacao, nomeoperacao) VALUES (2, 'alterar');
INSERT INTO schoolproject_test.public.operacao(idoperacao, nomeoperacao) VALUES (3, 'excluir');
INSERT INTO schoolproject_test.public.operacao(idoperacao, nomeoperacao) VALUES (4, 'consultar');
INSERT INTO schoolproject_test.public.operacao(idoperacao, nomeoperacao) VALUES (5, 'imprimir');

/*----------*/

INSERT INTO schoolproject_test.public.role_grupo_operacao_tabela (idrole, idgrupo, idoperacao, idtabela) VALUES (1, 2, 4, 1);
INSERT INTO schoolproject_test.public.role_grupo_operacao_tabela (idrole, idgrupo, idoperacao, idtabela) VALUES (2, 3, 1, 1);

INSERT INTO schoolproject_test.public.role_grupo_operacao_tabela (idrole, idgrupo, idoperacao, idtabela) VALUES (3, 1, 1, 1);
INSERT INTO schoolproject_test.public.role_grupo_operacao_tabela (idrole, idgrupo, idoperacao, idtabela) VALUES (4, 1, 2, 1);
INSERT INTO schoolproject_test.public.role_grupo_operacao_tabela (idrole, idgrupo, idoperacao, idtabela) VALUES (5, 1, 3, 1);
INSERT INTO schoolproject_test.public.role_grupo_operacao_tabela (idrole, idgrupo, idoperacao, idtabela) VALUES (6, 1, 4, 1);
INSERT INTO schoolproject_test.public.role_grupo_operacao_tabela (idrole, idgrupo, idoperacao, idtabela) VALUES (7, 1, 5, 1);