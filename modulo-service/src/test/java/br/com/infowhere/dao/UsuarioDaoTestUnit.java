package br.com.infowhere.dao;

import br.com.infowhere.config.DatabaseConfigTest;
import br.com.infowhere.dao.interfaces.IusuarioDao;
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

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= DatabaseConfigTest.class)
@SqlGroup({
        @Sql({"/materia/create_table_materia.sql", "/materia/insert_table_materia.sql"}),
        @Sql(scripts = "/drop/drop_tables.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
}
)
@Transactional
public class UsuarioDaoTestUnit {

    @Autowired
    private IusuarioDao usuarioDao;

    @Test
    public void validarQuantidadeUsuarios(){
        List<Usuario> usuarios = usuarioDao.buscarTodos();
        assertEquals(usuarios.size(),2);
    }

    @Test
    public void validarPrimeiraUsuarios(){
        List<Usuario> usuarios = usuarioDao.buscarTodos();
        assertEquals(usuarios.contains(new Usuario(1L)),true);
    }

    @Test
    public void validarBuscaEmailSenha(){
        Usuario usuarioBusca = usuarioDao.buscaPorEmailESenha("ltsiciliano@gmail.com","leleco");
        assertNotNull(usuarioBusca.getIdUsuario());
    }

    @Test
    public void salvarUsuario(){
        Usuario usuario = new Usuario("joaquim","jsenha","joaquim@gmail.com");
        Usuario usuarioPersistida = usuarioDao.salvar(usuario);
        assertNotNull(usuarioPersistida.getIdUsuario());
        assertTrue(usuarioPersistida.getIdUsuario().equals(3L));

        Usuario usuario2 = new Usuario("maria","msenha","maria@gmail.com");
        usuarioPersistida = usuarioDao.salvar(usuario2);
        assertNotNull(usuarioPersistida.getIdUsuario());
        assertTrue(usuarioPersistida.getIdUsuario().equals(4L));

    }

    @Test
    public void validarBuscaPorIdUsuario(){
        assertEquals(usuarioDao.buscarPorId(1L).getNomeUsuario().toUpperCase(), "LEANDRO");
    }

    @Test
    public void validarAlteracaoUsuario(){
        Usuario usuario = usuarioDao.buscarPorId(1L);
        usuario.setNomeUsuario("ltsiciliano");
        Usuario usuarioPersistida = usuarioDao.alterar(usuario);

        assertEquals(usuarioDao.buscarPorId(1L).getNomeUsuario().toUpperCase(), "LTSICILIANO");
        assertEquals(usuarioPersistida.getNomeUsuario().toUpperCase(), "LTSICILIANO");
    }

    @Test
    public void validarExclusaoUsuario(){
        usuarioDao.excluir(usuarioDao.buscarPorId(1L));
        assertNull(usuarioDao.buscarPorId(1L));
    }

}
