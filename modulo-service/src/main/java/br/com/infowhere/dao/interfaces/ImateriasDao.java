package br.com.infowhere.dao.interfaces;


import br.com.infowhere.model.Materia;

import java.util.List;

public interface ImateriasDao {

    Materia salvar(Materia materia);

    Materia alterar(Materia materia);

    void excluir(Materia materia);

    public Materia buscarPorId(Long id);

    public List<Materia> buscarTodos();

}
