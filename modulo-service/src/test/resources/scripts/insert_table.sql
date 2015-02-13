INSERT INTO schoolproject_test.public.grupo(idgrupo, nomegrupo) VALUES (1, 'adm');
INSERT INTO schoolproject_test.public.grupo(idgrupo, nomegrupo) VALUES (2, 'estudante');

INSERT INTO schoolproject_test.public.grupo_usuarios(idgrupousuario,idgrupo, idusuario) VALUES (1,1, 1);
INSERT INTO schoolproject_test.public.grupo_usuarios(idgrupousuario,idgrupo, idusuario) VALUES (2,2, 2);
INSERT INTO schoolproject_test.public.grupo_usuarios(idgrupousuario,idgrupo, idusuario) VALUES (3,1, 2);

INSERT INTO schoolproject_test.public.materias(nomemateria) VALUES ('TESTE SEFAZ eiiii');
INSERT INTO schoolproject_test.public.materias(nomemateria) VALUES ('Opa ! Leandro ! blz ?');
INSERT INTO schoolproject_test.public.materias(nomemateria) VALUES ('Vai tafarel ! vai q Ã© sua !');
INSERT INTO schoolproject_test.public.materias(nomemateria) VALUES ('TESTE SEFAZ 333');
INSERT INTO schoolproject_test.public.materias(nomemateria) VALUES ('o naufrago');
INSERT INTO schoolproject_test.public.materias(nomemateria) VALUES ('ai vou eu ! epa');

INSERT INTO schoolproject_test.public.operacao(idoperacao, nomeoperacao) VALUES (1, 'inserir');
INSERT INTO schoolproject_test.public.operacao(idoperacao, nomeoperacao) VALUES (2, 'alterar');
INSERT INTO schoolproject_test.public.operacao(idoperacao, nomeoperacao) VALUES (3, 'excluir');
INSERT INTO schoolproject_test.public.operacao(idoperacao, nomeoperacao) VALUES (4, 'consultar');
INSERT INTO schoolproject_test.public.operacao(idoperacao, nomeoperacao) VALUES (5, 'imprimir');

INSERT INTO schoolproject_test.public.usuarios(nomeusuario, senhausuario, emailusuario) VALUES ('leandro', 'leleco', 'ltsiciliano@gmail.com');
INSERT INTO schoolproject_test.public.usuarios(nomeusuario, senhausuario, emailusuario) VALUES ('mario', 'mario', 'mario@gmail.com');
