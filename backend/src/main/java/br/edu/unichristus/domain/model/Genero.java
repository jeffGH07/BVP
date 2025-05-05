package br.edu.unichristus.domain.model;

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

    @Column(length = 300)
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "id_livro", nullable = false)
    private Livro livro;

    public Genero() {
    }

    public Genero(String nome, String descricao, Livro livro) {
        this.nome = nome;
        this.descricao = descricao;
        this.livro = livro;
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

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    // equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Genero)) return false;
        Genero genero = (Genero) o;
        return Objects.equals(idGenero, genero.idGenero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGenero);
    }

    // toString
    @Override
    public String toString() {
        return "Genero{" +
                "idGenero=" + idGenero +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", livro=" + (livro != null ? livro.getIdLivro() : "null") +
                '}';
    }
}