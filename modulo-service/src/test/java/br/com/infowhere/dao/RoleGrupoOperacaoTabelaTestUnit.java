package br.com.infowhere.dao;

import br.com.infowhere.config.DatabaseConfigTest;
import br.com.infowhere.dao.interfaces.IroleGrupoOperacaoTabelaDao;
import br.com.infowhere.model.RoleGrupoOperacaoTabela;
import br.com.infowhere.model.Usuario;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= DatabaseConfigTest.class)
@SqlGroup({
        @Sql({"/materia/create_table_materia.sql",
                "/scripts/create_tables.sql",
                "/materia/insert_table_materia.sql",
                "/scripts/insert_table.sql"}),
        @Sql(scripts = "/drop/drop_tables.sql",
                executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
}
)
@Transactional
public class RoleGrupoOperacaoTabelaTestUnit {

    @Autowired
    private IroleGrupoOperacaoTabelaDao roleGrupoOperacaoTabelaDao;

     @Test
     public void recuperaRolesUsuario(){
         Usuario usuario = new Usuario(1L);
         List<RoleGrupoOperacaoTabela> rolesUsuario = roleGrupoOperacaoTabelaDao.recuperarRolesUsuario(usuario);
         assertEquals(rolesUsuario.size(),5);
     }

    @Test
    public void recuperaTodasRoles(){
        List<RoleGrupoOperacaoTabela> roles = roleGrupoOperacaoTabelaDao.buscarTodos();
        assertEquals(roles.size(),7);
    }

}
