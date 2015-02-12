package br.com.infowhere.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "login";
    }

    @RequestMapping(value = "/naoautorizado", method = RequestMethod.GET)
    public String naoAutorizado() {
        return "naoautorizado";
    }

    @RequestMapping(value="/materia/logar",method = RequestMethod.GET)
    public String efetuarLoginGet(){
        return "login";
    }

    @RequestMapping(value="/materia/logar",method = RequestMethod.POST)
    public String efetuarLogin(HttpServletRequest request, HttpServletResponse response){

        UsernamePasswordToken token = new UsernamePasswordToken(request.getParameter("emailUsuario"),request.getParameter("senhaUsuario"));

        org.apache.shiro.subject.Subject user = SecurityUtils.getSubject();
        try{
            user.login(token);
        }
/*        } catch ( UnknownAccountException uae ) {
            System.out.println("AuthenticationException" + uae.getMessage());
        } catch ( IncorrectCredentialsException ice ) {
            System.out.println("AuthenticationException" + ice.getMessage());
        } catch ( LockedAccountException lae ) {
            System.out.println("AuthenticationException" + lae.getMessage());
        } catch ( ExcessiveAttemptsException eae ) {
            System.out.println("AuthenticationException" + eae.getMessage());
        }*/
        catch (AuthenticationException ae ) {
            return "redirect:/";
        }

        if(user.hasRole("teste")){
            System.out.println("TA NA ROLE TESTE");
        }

        return "redirect:/index";
    }

}
