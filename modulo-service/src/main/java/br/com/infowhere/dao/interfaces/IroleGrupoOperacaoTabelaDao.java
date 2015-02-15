package br.com.infowhere.dao.interfaces;


import br.com.infowhere.model.RoleGrupoOperacaoTabela;
import br.com.infowhere.model.Usuario;

import java.util.List;

public interface IroleGrupoOperacaoTabelaDao {

    RoleGrupoOperacaoTabela salvar(RoleGrupoOperacaoTabela roleGrupoOperacaoTabela);

    RoleGrupoOperacaoTabela alterar(RoleGrupoOperacaoTabela roleGrupoOperacaoTabela);

    void excluir(RoleGrupoOperacaoTabela roleGrupoOperacaoTabela);

    public RoleGrupoOperacaoTabela buscarPorId(Long id);

    public List<RoleGrupoOperacaoTabela> buscarTodos();

    public List<RoleGrupoOperacaoTabela> recuperarRolesUsuario(Usuario usuario);

}
