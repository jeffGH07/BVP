package br.edu.unichristus.domain.dto;

import java.util.Objects;

public class LivroDTO {
    private Long idLivro;
    private String autor;
    private String nome;
    private int anoPublicacao;
    private int quantidadeDisponivel;

    public LivroDTO() {

    }

    public LivroDTO(Long idLivro, String autor, String nome, int anoPublicacao, int quantidadeDisponivel) {
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
}
