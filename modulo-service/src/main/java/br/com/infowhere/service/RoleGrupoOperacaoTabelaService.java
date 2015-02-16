package br.com.infowhere.service;

import br.com.infowhere.dao.interfaces.IroleGrupoOperacaoTabelaDao;
import br.com.infowhere.model.RoleGrupoOperacaoTabela;
import br.com.infowhere.model.Usuario;
import br.com.infowhere.service.interfaces.IroleGrupoOperacaoTabelaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleGrupoOperacaoTabelaService implements IroleGrupoOperacaoTabelaService{

    @Autowired
    private IroleGrupoOperacaoTabelaDao roleGrupoOperacaoTabelaDao;

    @Override
    public List<RoleGrupoOperacaoTabela> todos() {
        return roleGrupoOperacaoTabelaDao.buscarTodos();
    }

    @Override
    public RoleGrupoOperacaoTabela salvar(RoleGrupoOperacaoTabela roleGrupoOperacaoTabela) {
        return null;
        //TODO falta implementar
    }

    @Override
    public RoleGrupoOperacaoTabela recuperarPorId(Long id) {
        return null;
        //TODO falta implementar
    }

    @Override
    public RoleGrupoOperacaoTabela alterar(RoleGrupoOperacaoTabela roleGrupoOperacaoTabela) {
        return null;
        //TODO falta implementar
    }

    @Override
    public List<RoleGrupoOperacaoTabela> recuperarRolesUsuario(Usuario usuario) {
        return roleGrupoOperacaoTabelaDao.recuperarRolesUsuario(usuario);
    }
}
