package br.com.infowhere.model;

import javax.persistence.*;

@Entity
@Table(name = "Usuarios")
public class Usuario {

    @Id
    @Column(name = "idUsuario",unique = true,nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(name = "nomeUsuario")
    private String nomeUsuario;

    @Column(name = "senhaUsuario")
    private String senhaUsuario;

    @Column(name = "emailUsuario")
    private String emailUsuario;

    public Usuario() {
    }

    public Usuario(String nomeUsuario, String senhaUsuario, String emailUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.senhaUsuario = senhaUsuario;
        this.emailUsuario = emailUsuario;
    }

    public Usuario(String senhaUsuario, String emailUsuario) {
        this.senhaUsuario = senhaUsuario;
        this.emailUsuario = emailUsuario;
    }

    public Usuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;

        Usuario usuario = (Usuario) o;

        if (idUsuario != null ? !idUsuario.equals(usuario.idUsuario) : usuario.idUsuario != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idUsuario != null ? idUsuario.hashCode() : 0;
    }
}
