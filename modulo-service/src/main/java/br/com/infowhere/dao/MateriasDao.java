package br.com.infowhere.dao;


import br.com.infowhere.crud.CrudService;
import br.com.infowhere.dao.interfaces.ImateriasDao;
import br.com.infowhere.model.Materia;
import org.springframework.stereotype.Repository;

@Repository
public class MateriasDao extends CrudService<Materia> implements ImateriasDao {

}
