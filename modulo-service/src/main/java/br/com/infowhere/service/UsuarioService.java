package br.com.infowhere.service;

import br.com.infowhere.dao.interfaces.IusuarioDao;
import br.com.infowhere.model.Usuario;
import br.com.infowhere.service.interfaces.IusuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UsuarioService implements IusuarioService{

    @Autowired
    private IusuarioDao iusuarioDao;

    public List<Usuario> todos(){
        return iusuarioDao.buscarTodos();
    }

    @Override
    public Usuario salvar(Usuario usuario) {
        return iusuarioDao.salvar(usuario);
    }

    @Override
    public Usuario recuperarPorId(Long id) {
        return iusuarioDao.buscarPorId(id);
    }

    @Override
    public Usuario alterar(Usuario usuario) {
        return iusuarioDao.alterar(usuario);
    }


}
