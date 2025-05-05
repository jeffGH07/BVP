package br.edu.unichristus.domain.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(length = 300)
    private String descricao;

    @Column(length = 100)
    private String areaConhecimento;

    @ManyToOne
    @JoinColumn(name = "id_livro", nullable = false)
    private Livro livro;

    public Categoria() {
    }

    public Categoria(String nome, String descricao, String areaConhecimento, Livro livro) {
        this.nome = nome;
        this.descricao = descricao;
        this.areaConhecimento = areaConhecimento;
        this.livro = livro;
    }

    // Getters e Setters
    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
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

    public String getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(String areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
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
        if (!(o instanceof Categoria)) return false;
        Categoria that = (Categoria) o;
        return Objects.equals(idCategoria, that.idCategoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCategoria);
    }

    // toString
    @Override
    public String toString() {
        return "Categoria{" +
                "idCategoria=" + idCategoria +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", areaConhecimento='" + areaConhecimento + '\'' +
                ", livro=" + (livro != null ? livro.getIdLivro() : "null") +
                '}';
    }
}