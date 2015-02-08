package br.com.infowhere.service;

import br.com.infowhere.config.DatabaseConfigTest;
import br.com.infowhere.model.Materia;
import br.com.infowhere.service.interfaces.ImateriaService;
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
        @Sql(scripts = "/drop/drop_tables.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
}
)
public class MateriasServiceTestUnit {

    @Autowired
    private ImateriaService materiasService;

    @Test
    public void validaQuantidadeMaterias(){
        List<Materia> materias = materiasService.todos();
        assertEquals(materias.size(),3);
    }

    @Test
    public void validaPrimeiraMaterias(){
        List<Materia> materias = materiasService.todos();
        assertEquals(materias.contains(new Materia(1L,"Cobit")),true);
    }

}
