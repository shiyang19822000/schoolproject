package br.com.infowhere.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "grupo")
public class Grupo {

    @Id
    @Column(name = "idGrupo",unique = true,nullable = false)
    private Long idGrupo;

    @Column(name = "nomeGrupo")
    private String nomeGrupo;

    @OneToMany(mappedBy = "usuario",targetEntity = GrupoUsuario.class,orphanRemoval = true)
    private Set<GrupoUsuario> grupoUsuarios;

    @OneToMany(mappedBy = "grupo",targetEntity = RoleGrupoOperacaoTabela.class,orphanRemoval = true)
    private Set<RoleGrupoOperacaoTabela> roleGrupoOperacaoTabelas;

    public Grupo() {
    }

    public Long getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Long idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNomeGrupo() {
        return nomeGrupo;
    }

    public void setNomeGrupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
    }

    public Set<RoleGrupoOperacaoTabela> getRoleGrupoOperacaoTabelas() {
        return roleGrupoOperacaoTabelas;
    }

    public void setRoleGrupoOperacaoTabelas(Set<RoleGrupoOperacaoTabela> roleGrupoOperacaoTabelas) {
        this.roleGrupoOperacaoTabelas = roleGrupoOperacaoTabelas;
    }

    public Set<GrupoUsuario> getGrupoUsuarios() {
        return grupoUsuarios;
    }

    public void setGrupoUsuarios(Set<GrupoUsuario> grupoUsuarios) {
        this.grupoUsuarios = grupoUsuarios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Grupo)) return false;

        Grupo grupo = (Grupo) o;

        if (idGrupo != null ? !idGrupo.equals(grupo.idGrupo) : grupo.idGrupo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idGrupo != null ? idGrupo.hashCode() : 0;
    }
}
