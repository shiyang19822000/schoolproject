import br.com.infowhere.dao.interfaces.ImateriasDao;
import br.com.infowhere.model.Materia;
import config.DatabaseConfigTest;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= DatabaseConfigTest.class)
@SqlGroup({
        @Sql({"/materia/create_table_materia.sql", "/materia/insert_table_materia.sql"}),
        @Sql(scripts = "/drop/drop_tables.sql", executionPhase = org.springframework.test.context.jdbc.Sql.ExecutionPhase.AFTER_TEST_METHOD)
}
)
public class MateriasTestUnit {

    @Autowired
    private ImateriasDao materiasDao;

    @Test
    public void validaQuantidadeMaterias(){

        List<Materia> materias = materiasDao.todasMaterias();
        assertEquals(materias.size(),3);
    }

    @Test
    public void validaPrimeiraMaterias(){

        List<Materia> materias = materiasDao.todasMaterias();

        assertEquals(materias.contains(new Materia(3,"Cobit")),true);

    }

}
