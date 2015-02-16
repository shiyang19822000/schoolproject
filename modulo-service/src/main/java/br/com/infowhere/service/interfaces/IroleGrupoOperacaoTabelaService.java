package br.com.infowhere.service.interfaces;

import br.com.infowhere.model.RoleGrupoOperacaoTabela;
import br.com.infowhere.model.Usuario;

import java.util.List;

public interface IroleGrupoOperacaoTabelaService {

    List<RoleGrupoOperacaoTabela> todos();

    RoleGrupoOperacaoTabela salvar(RoleGrupoOperacaoTabela roleGrupoOperacaoTabela);

    RoleGrupoOperacaoTabela recuperarPorId(Long id);

    RoleGrupoOperacaoTabela alterar(RoleGrupoOperacaoTabela roleGrupoOperacaoTabela);

    List<RoleGrupoOperacaoTabela> recuperarRolesUsuario(Usuario usuario);

}
