package br.com.infowhere.service.interfaces;

import br.com.infowhere.model.Materia;

import java.util.List;

public interface ImateriaService {

    List<Materia> todasMaterias();

    Materia salvar(Materia materia);

    Materia recuperarPorId(Long id);

    Materia alterar(Materia materia);

}
