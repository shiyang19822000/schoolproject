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

import static org.junit.Assert.*;

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
    public void validarQuantidadeMaterias(){
        List<Materia> materias = materiasDao.buscarTodos();
        assertEquals(materias.size(),3);
    }

    @Test
    public void validarPrimeiraMaterias(){
        List<Materia> materias = materiasDao.buscarTodos();
        assertEquals(materias.contains(new Materia(1L,"Cobit")),true);
    }

    @Test
    public void salvarMateria(){
        Materia materia = new Materia("Banco de dados");
        Materia materiaPersistida = materiasDao.salvar(materia);
        assertNotNull(materiaPersistida.getIdMateria());
        assertTrue(materiaPersistida.getIdMateria().equals(4L));

        Materia materia2 = new Materia("Java");
        materiaPersistida = materiasDao.salvar(materia2);
        assertNotNull(materiaPersistida.getIdMateria());
        assertTrue(materiaPersistida.getIdMateria().equals(5L));

    }

    @Test
    public void validarBuscaPorId(){
        assertEquals(materiasDao.buscarPorId(1L).getNomeMateria().toUpperCase(), "COBIT");
    }

    @Test
    public void validarAlteracao(){
        Materia materia = materiasDao.buscarPorId(1L);
        materia.setNomeMateria("Redes");
        Materia materiaPersistida = materiasDao.alterar(materia);

        assertEquals(materiasDao.buscarPorId(1L).getNomeMateria().toUpperCase(), "REDES");
        assertEquals(materiaPersistida.getNomeMateria().toUpperCase(), "REDES");
    }

    @Test
    public void validarExclusao(){
        materiasDao.excluir(materiasDao.buscarPorId(1L));
        assertNull(materiasDao.buscarPorId(1L));
    }

}
