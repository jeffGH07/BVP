package br.edu.unichristus.domain.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_livro")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLivro;

    @Column(length = 150, nullable = false)
    private String autor;

    @Column(length = 150, nullable = false)
    private String nome;

    @Column(nullable = false)
    private int anoPublicacao;

    @Column(nullable = false)
    private int quantidadeDisponivel;

    public Livro() {
    }

    public Livro(Long idLivro, String autor, String nome, int anoPublicacao, int quantidadeDisponivel) {
        this.idLivro = idLivro;
        this.autor = autor;
        this.nome = nome;
        this.anoPublicacao = anoPublicacao;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    // Getters e Setters
    public Long getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Long idLivro) {
        this.idLivro = idLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    // equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro livro)) return false;
        return Objects.equals(idLivro, livro.idLivro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLivro);
    }

    // toString
    @Override
    public String toString() {
        return "Livro{" +
                "idLivro=" + idLivro +
                ", autor='" + autor + '\'' +
                ", nome='" + nome + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", quantidadeDisponivel=" + quantidadeDisponivel +
                '}';
    }
}