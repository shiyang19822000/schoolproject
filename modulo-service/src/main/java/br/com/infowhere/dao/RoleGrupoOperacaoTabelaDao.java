package br.com.infowhere.dao;


import br.com.infowhere.crud.CrudService;
import br.com.infowhere.dao.interfaces.IroleGrupoOperacaoTabelaDao;
import br.com.infowhere.model.RoleGrupoOperacaoTabela;
import br.com.infowhere.model.Usuario;
import org.springframework.stereotype.Repository;
import javax.persistence.Query;

import java.util.List;

@Repository
public class RoleGrupoOperacaoTabelaDao extends CrudService<RoleGrupoOperacaoTabela> implements IroleGrupoOperacaoTabelaDao {

    @Override
    public List<RoleGrupoOperacaoTabela> recuperarRolesUsuario(Usuario usuario) {

        String jpaquery = "select distinct rgop from RoleGrupoOperacaoTabela as rgop" +
                " join rgop.grupo as grupo" +
                " join rgop.operacao as operacao" +
                " join rgop.tabela as tabela" +
                " join grupo.grupoUsuarios as gu" +
                " join gu.usuario as u where gu.usuario = :usuario";

        Query query = getEntityManager().createQuery(jpaquery);
        query.setParameter("usuario",usuario);

        return query.getResultList();

    }
}
