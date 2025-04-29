package java.domain.models.entity;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_genero")
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGenero;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(length = 255)
    private String descricao;

    public Genero() {
    }

    public Genero(Long idGenero, String nome, String descricao) {
        this.idGenero = idGenero;
        this.nome = nome;
        this.descricao = descricao;
    }

    // Getters e Setters
    public Long getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Long idGenero) {
        this.idGenero = idGenero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Genero genero)) return false;
        return Objects.equals(idGenero, genero.idGenero) &&
                Objects.equals(nome, genero.nome) &&
                Objects.equals(descricao, genero.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGenero, nome, descricao);
    }

    // toString
    @Override
    public String toString() {
        return "java.model.entity.Genero{" +
                "idGenero=" + idGenero +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}