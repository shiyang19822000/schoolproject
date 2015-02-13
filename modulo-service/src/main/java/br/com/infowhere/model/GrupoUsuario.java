package br.com.infowhere.model;

import javax.persistence.*;

@Entity
@Table(name = "grupo_usuarios")
public class GrupoUsuario {

    @Id
    @Column(name = "idGrupoUsuario",unique = true,nullable = false)
    private Long idGrupoUsuario;

    @JoinColumn(name = "idGrupo", nullable = false)
    @ManyToOne
    private Grupo grupo;

    @JoinColumn(name = "idUsuario", nullable = false)
    @ManyToOne
    private Usuario usuario;

    public GrupoUsuario() {
    }

    public Long getIdGrupoUsuario() {
        return idGrupoUsuario;
    }

    public void setIdGrupoUsuario(Long idGrupoUsuario) {
        this.idGrupoUsuario = idGrupoUsuario;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GrupoUsuario)) return false;

        GrupoUsuario that = (GrupoUsuario) o;

        if (grupo != null ? !grupo.equals(that.grupo) : that.grupo != null) return false;
        if (idGrupoUsuario != null ? !idGrupoUsuario.equals(that.idGrupoUsuario) : that.idGrupoUsuario != null)
            return false;
        if (usuario != null ? !usuario.equals(that.usuario) : that.usuario != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idGrupoUsuario != null ? idGrupoUsuario.hashCode() : 0;
        result = 31 * result + (grupo != null ? grupo.hashCode() : 0);
        result = 31 * result + (usuario != null ? usuario.hashCode() : 0);
        return result;
    }
}
