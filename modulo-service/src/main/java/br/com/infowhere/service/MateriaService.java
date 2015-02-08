package br.com.infowhere.service;

import br.com.infowhere.dao.interfaces.ImateriasDao;
import br.com.infowhere.model.Materia;
import br.com.infowhere.service.interfaces.ImateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MateriaService implements ImateriaService{

    @Autowired
    private ImateriasDao materiasDao;

    public List<Materia> todos(){
        return materiasDao.buscarTodos();
    }

    @Override
    public Materia salvar(Materia materia) {
        return materiasDao.salvar(materia);
    }

    @Override
    public Materia recuperarPorId(Long id) {
        return materiasDao.buscarPorId(id);
    }

    @Override
    public Materia alterar(Materia materia) {
        return materiasDao.alterar(materia);
    }


}
