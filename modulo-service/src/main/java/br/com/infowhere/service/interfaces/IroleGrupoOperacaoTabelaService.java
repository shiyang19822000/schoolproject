package br.com.infowhere.service.interfaces;

import br.com.infowhere.model.Materia;
import br.com.infowhere.model.RoleGrupoOperacaoTabela;
import br.com.infowhere.model.Usuario;

import java.util.List;

public interface IroleGrupoOperacaoTabelaService {

    List<Materia> todos();

    Materia salvar(Materia materia);

    Materia recuperarPorId(Long id);

    Materia alterar(Materia materia);

    List<RoleGrupoOperacaoTabela> recuperarRolesUsuario(Usuario usuario);

}
