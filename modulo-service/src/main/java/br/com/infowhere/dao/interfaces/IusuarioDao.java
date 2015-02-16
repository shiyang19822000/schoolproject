package br.com.infowhere.dao.interfaces;


import br.com.infowhere.model.Usuario;

import java.util.List;

public interface IusuarioDao {

    Usuario salvar(Usuario usuario);

    Usuario alterar(Usuario usuario);

    void excluir(Usuario usuario);

    public Usuario buscarPorId(Long id);

    public List<Usuario> buscarTodos();

    public Usuario buscaPorEmailESenha(String email, String senha);

    public Usuario buscaPorEmail(String email);

}
