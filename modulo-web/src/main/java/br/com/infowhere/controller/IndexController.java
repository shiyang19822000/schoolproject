package br.com.infowhere.controller;

import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/teste", method = RequestMethod.GET)
    public String teste() {

        org.apache.shiro.subject.Subject user = SecurityUtils.getSubject();

        if(user.hasRole("TESTE1")){
            System.out.println("---- ESTÁ NA ROLE TESTE1");
        }

        if(user.hasRole("TESTE")){
            System.out.println(">>>> ESTÁ NA ROLE TESTE");
        }

        return "teste";
    }

    @RequestMapping(value = "/executateste", method = RequestMethod.GET)
    public void executaTeste(){
        System.out.println("[[[[[[[[[[[[[[ EXECUTEI ]]]]]]]]]]]]] ");
    }

    @RequestMapping(value = "/executateste2", method = RequestMethod.GET)
    public void executaTeste2(){
        System.out.println("[[[[[[[[[[[[[[ EXECUTEI teste 2 ]]]]]]]]]]]]] ");
    }

}
