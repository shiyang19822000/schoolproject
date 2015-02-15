package br.com.infowhere.model;

import javax.persistence.*;

@Entity
@Table(name = "Materias")
public class Materia {

    @Id
    @Column(name = "idMateria",unique = true,nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMateria;

    @Column(name = "nomeMateria")
    private String nomeMateria;

    public Materia() {
    }

    public Materia(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    public Materia(Long idMateria,String nomeMateria){
        this.idMateria = idMateria;
        this.nomeMateria = nomeMateria;
    }

    public Long getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Long idMateria) {
        this.idMateria = idMateria;
    }

    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Materia)) return false;

        Materia materia = (Materia) o;

        if (idMateria != null ? !idMateria.equals(materia.idMateria) : materia.idMateria != null) return false;
        if (nomeMateria != null ? !nomeMateria.equals(materia.nomeMateria) : materia.nomeMateria != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMateria != null ? idMateria.hashCode() : 0;
        result = 31 * result + (nomeMateria != null ? nomeMateria.hashCode() : 0);
        return result;
    }
}
