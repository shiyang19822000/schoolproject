package br.com.infowhere.security;

import br.com.infowhere.dao.interfaces.IusuarioDao;
import br.com.infowhere.model.Usuario;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CustomSecurityRealm extends AuthorizingRealm {

    @Autowired
    private IusuarioDao usuarioDao;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("PÓS LOGIN");
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        UsernamePasswordToken usernameToken = (UsernamePasswordToken) token;

        String email = usernameToken.getUsername();
        String senha = new String(usernameToken.getPassword());

        Usuario usuarioBusca = usuarioDao.buscaPorEmailESenha(email,senha);

        if(usuarioBusca == null){
            throw new AuthenticationException();
        }

        return new SimpleAuthenticationInfo(email, senha, getName());
    }
}
