package br.com.infowhere.dao;

import br.com.infowhere.config.DatabaseConfigTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

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

     @Test
     public void executaTeste(){
         assertEquals(true,true);
     }

}
