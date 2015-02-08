package br.com.infowhere.dao;


import br.com.infowhere.crud.CrudService;
import br.com.infowhere.dao.interfaces.IusuarioDao;
import br.com.infowhere.model.Usuario;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.SpringSessionContext;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import javax.sql.DataSource;

@Repository
public class UsuarioDao extends CrudService<Usuario> implements IusuarioDao {

    @Override
    public Usuario buscaPorEmailESenha(String email, String senha) {

        TypedQuery<Usuario> query = getEntityManager().createQuery("from Usuario usuario where usuario.emailUsuario=? and usuario.senhaUsuario=?", Usuario.class);

        query.setParameter(1, email);
        query.setParameter(2, senha);

        return query.getSingleResult();

    }
}
