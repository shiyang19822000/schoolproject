package br.com.infowhere.dao;


import br.com.infowhere.dao.interfaces.ImateriasDao;
import br.com.infowhere.model.Materia;

import java.util.ArrayList;
import java.util.List;

public class MateriasDao implements ImateriasDao {

    public List<Materia> todasMaterias(){

        List<Materia> materias = new ArrayList<Materia>();

        Materia materia1 = new Materia();
        materia1.setIdMateria(1);
        materia1.setNomeMateria("Itil");

        materias.add(materia1);

        Materia materia2 = new Materia();
        materia2.setIdMateria(2);
        materia2.setNomeMateria("Cobit");

        materias.add(materia2);

        return materias;


    }

}
