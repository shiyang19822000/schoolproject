package br.com.infowhere.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tabela")
public class Tabela {

    @Id
    @Column(name = "idTabela",unique = true,nullable = false)
    private Long idTabela;

    @Column(name = "nomeTabela")
    private String nomeTabela;

    @OneToMany(mappedBy = "tabela",targetEntity = RoleGrupoOperacaoTabela.class,orphanRemoval = true)
    private Set<RoleGrupoOperacaoTabela> roleGrupoOperacaoTabelas;

    public Tabela() {
    }

    public Long getIdTabela() {
        return idTabela;
    }

    public void setIdTabela(Long idTabela) {
        this.idTabela = idTabela;
    }

    public String getNomeTabela() {
        return nomeTabela;
    }

    public void setNomeTabela(String nomeTabela) {
        this.nomeTabela = nomeTabela;
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
        if (!(o instanceof Tabela)) return false;

        Tabela tabela = (Tabela) o;

        if (idTabela != null ? !idTabela.equals(tabela.idTabela) : tabela.idTabela != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idTabela != null ? idTabela.hashCode() : 0;
    }
}
