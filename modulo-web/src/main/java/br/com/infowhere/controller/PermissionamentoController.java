package br.com.infowhere.controller;

import br.com.infowhere.service.interfaces.IroleGrupoOperacaoTabelaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/permissionamento")
public class PermissionamentoController {

    @Autowired
    private IroleGrupoOperacaoTabelaService roleGrupoOperacaoTabelaService;

    @RequestMapping(value = "/todos", method = RequestMethod.GET)
    public String listaPermissionamentos(Model model) {
        model.addAttribute("roles", roleGrupoOperacaoTabelaService.todos());
        return "permissionamento";
    }

}
