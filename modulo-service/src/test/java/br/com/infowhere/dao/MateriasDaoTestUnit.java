package br.com.infowhere.dao;

import br.com.infowhere.config.DatabaseConfigTest;
import br.com.infowhere.dao.interfaces.ImateriasDao;
import br.com.infowhere.model.Materia;
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
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= DatabaseConfigTest.class)
@SqlGroup({
        @Sql({"/materia/create_table_materia.sql", "/materia/insert_table_materia.sql"}),
        @Sql(scripts = "/drop/drop_tables.sql", executionPhase = org.springframework.test.context.jdbc.Sql.ExecutionPhase.AFTER_TEST_METHOD)
}
)
@Transactional
public class MateriasDaoTestUnit {

    @Autowired
    private ImateriasDao materiasDao;

    @Test
    public void validaQuantidadeMaterias(){
        List<Materia> materias = materiasDao.buscarTodos();
        assertEquals(materias.size(),3);
    }

    @Test
    public void validaPrimeiraMaterias(){
        List<Materia> materias = materiasDao.buscarTodos();
        assertEquals(materias.contains(new Materia(1,"Cobit")),true);
    }

    @Test
    public void salvarMateria(){
        Materia materia = new Materia("Banco de dados");
        Materia materiaPersistida = materiasDao.salvar(materia);
        assertNotNull(materiaPersistida.getIdMateria());
        assertEquals(materiaPersistida.getIdMateria(),4);

        Materia materia2 = new Materia("Java");
        materiaPersistida = materiasDao.salvar(materia2);
        assertNotNull(materiaPersistida.getIdMateria());
        assertEquals(materiaPersistida.getIdMateria(),5);

    }

}
