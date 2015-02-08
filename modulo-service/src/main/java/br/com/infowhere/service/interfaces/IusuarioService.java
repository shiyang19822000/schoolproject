package br.com.infowhere.service.interfaces;

import br.com.infowhere.model.Usuario;

import java.util.List;

public interface IusuarioService {

    List<Usuario> todos();

    Usuario salvar(Usuario usuario);

    Usuario recuperarPorId(Long id);

    Usuario alterar(Usuario usuario);

}
