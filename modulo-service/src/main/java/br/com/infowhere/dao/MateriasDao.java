package br.com.infowhere.dao;


import br.com.infowhere.dao.interfaces.ImateriasDao;
import br.com.infowhere.model.Materia;
import org.hibernate.Query;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

public class MateriasDao implements ImateriasDao {

    @PersistenceContext
    private EntityManager entityManager;

/*    @Transactional(readOnly = true)
    public List<Cliente> buscaTodosAtivoOuDesativado(boolean ativo) {

        String jpaquery = "SELECT cliente FROM Cliente cliente WHERE ativo = :ativo";
        Query query = sessionFactory.getCurrentSession().createQuery(jpaquery);

        query.setParameter("ativo",ativo);

        return query.list();

    }*/

    @Transactional(readOnly = true)
    public List<Materia> todasMaterias(){

        //List<Materia> materias = new ArrayList<Materia>();

        String jpaquery = "select materia from Materia materia";

        return entityManager.createQuery(jpaquery).getResultList();

/*        Materia materia1 = new Materia();
        materia1.setIdMateria(1);
        materia1.setNomeMateria("Itil");

        materias.add(materia1);

        Materia materia2 = new Materia();
        materia2.setIdMateria(2);
        materia2.setNomeMateria("Cobit");

        materias.add(materia2);*/

        /*return materias;*/


    }

}
