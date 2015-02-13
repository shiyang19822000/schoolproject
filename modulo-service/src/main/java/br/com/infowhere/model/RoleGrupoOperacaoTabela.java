package br.com.infowhere.model;

import javax.persistence.*;

@Entity
@Table(name = "role_grupo_operacao_tabela")
public class RoleGrupoOperacaoTabela {

    @Id
    @Column(name = "idRole",unique = true,nullable = false)
    private Long idRole;

    @ManyToOne
    @JoinColumn(name = "idGrupo", nullable = false)
    private Grupo grupo;

    @ManyToOne
    @JoinColumn(name = "idOperacao", nullable = false)
    private Operacao operacao;

    @ManyToOne
    @JoinColumn(name = "idTabela", nullable = false)
    private Tabela tabela;

    public RoleGrupoOperacaoTabela() {
    }

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Operacao getOperacao() {
        return operacao;
    }

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    public Tabela getTabela() {
        return tabela;
    }

    public void setTabela(Tabela tabela) {
        this.tabela = tabela;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoleGrupoOperacaoTabela)) return false;

        RoleGrupoOperacaoTabela that = (RoleGrupoOperacaoTabela) o;

        if (idRole != null ? !idRole.equals(that.idRole) : that.idRole != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idRole != null ? idRole.hashCode() : 0;
    }
}
