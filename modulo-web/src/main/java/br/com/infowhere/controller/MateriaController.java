package br.com.infowhere.controller;

import br.com.infowhere.model.Materia;
import br.com.infowhere.service.interfaces.ImateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/materia")
public class MateriaController {

    @Autowired
    private ImateriaService materiaService;

    @RequestMapping(value = "/novamateria", method = RequestMethod.GET)
    public String novaMateria(Model model) {
        model.addAttribute("materia", new Materia());
        return "materia";
    }

    @RequestMapping(value = "/alterarmateria/{idMateria}", method = RequestMethod.GET)
    public String alterarMateria(@PathVariable("idMateria") Long idMateria, Model model) {

        System.out.println("VOU ALTERAR");
        model.addAttribute("materia", materiaService.recuperarPorId(idMateria));

        return "materia";
    }

    @RequestMapping(value = "/salvarmateria", method = RequestMethod.POST)
    public String salvarMateria(@Valid @ModelAttribute("materia") Materia materia,Model model) {

        System.out.println("----------------- > > > ID - - - > > " + materia.getIdMateria());
        System.out.println("----------------- > > > nomeeee - - - > > " + materia.getNomeMateria());

        if(materia.getIdMateria()==null){
            materiaService.salvar(materia);
        }else{
            materiaService.alterar(materia);
        }

        model.addAttribute("materia", null);
        model.addAttribute("materias", materiaService.todasMaterias());
        return "redirect:/materia/todas";
    }

    @RequestMapping(value = "/todas", method = RequestMethod.GET)
    public String todasMateria(Model model) {
        model.addAttribute("materias", materiaService.todasMaterias());
        return "materia";
    }

}
