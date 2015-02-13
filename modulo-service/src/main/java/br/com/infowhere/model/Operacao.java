package br.com.infowhere.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "operacao")
public class Operacao {

    @Id
    @Column(name = "idOperacao",unique = true,nullable = false)
    private Long idOperacao;

    @Column(name = "nomeOperacao")
    private String nomeOperacao;

    @OneToMany(mappedBy = "operacao",targetEntity = RoleGrupoOperacaoTabela.class,orphanRemoval = true)
    private Set<RoleGrupoOperacaoTabela> roleGrupoOperacaoTabelas;

    public Operacao() {
    }

    public Long getIdOperacao() {
        return idOperacao;
    }

    public void setIdOperacao(Long idOperacao) {
        this.idOperacao = idOperacao;
    }

    public String getNomeOperacao() {
        return nomeOperacao;
    }

    public void setNomeOperacao(String nomeOperacao) {
        this.nomeOperacao = nomeOperacao;
    }

    public Set<RoleGrupoOperacaoTabela> getRoleGrupoOperacaoTabelas() {
        return roleGrupoOperacaoTabelas;
    }

    public void setRoleGrupoOperacaoTabelas(Set<RoleGrupoOperacaoTabela> roleGrupoOperacaoTabelas) {
        this.roleGrupoOperacaoTabelas = roleGrupoOperacaoTabelas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Operacao)) return false;

        Operacao operacao = (Operacao) o;

        if (idOperacao != null ? !idOperacao.equals(operacao.idOperacao) : operacao.idOperacao != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idOperacao != null ? idOperacao.hashCode() : 0;
    }
}
