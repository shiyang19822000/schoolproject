package br.com.infowhere.security;

import br.com.infowhere.dao.interfaces.IusuarioDao;
import br.com.infowhere.model.RoleGrupoOperacaoTabela;
import br.com.infowhere.model.Usuario;
import br.com.infowhere.service.interfaces.IroleGrupoOperacaoTabelaService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Component
public class CustomSecurityRealm extends AuthorizingRealm {

    @Autowired
    private IusuarioDao usuarioDao;

    @Autowired
    private IroleGrupoOperacaoTabelaService roleGrupoOperacaoTabelaService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        SimpleAuthorizationInfo auth=new SimpleAuthorizationInfo();

        Subject currentUser = SecurityUtils.getSubject();

        Usuario usuario = usuarioDao.buscaPorEmail(currentUser.getPrincipal().toString());

        Set<String> roles = new HashSet<String>();

        if(usuario != null){

            String roleCompleta;

            List<RoleGrupoOperacaoTabela> roleGrupoOperacaoTabelas = roleGrupoOperacaoTabelaService.recuperarRolesUsuario(usuario);

            for(RoleGrupoOperacaoTabela roleGrupoOperacaoTabela:roleGrupoOperacaoTabelas){
                roleCompleta = roleGrupoOperacaoTabela.getTabela().getNomeTabela() + ":" + roleGrupoOperacaoTabela.getOperacao().getNomeOperacao();
                System.out.println("role completa :::: " + roleCompleta);
                roles.add(roleCompleta);
            }

        }

        auth.setRoles(roles);
        //auth.addStringPermissions(user.getPermissionStrSet());
        return auth;
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
