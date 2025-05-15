package br.edu.unichristus.domain.dto;

import java.util.Objects;

public class CategoriaDTO {
    private Long idCategoria;
    private String nome;
    private String descricao;
    private String areaConhecimento;

    public CategoriaDTO() {

    }

    public CategoriaDTO(Long idCategoria, String nome, String descricao, String areaConhecimento) {
        this.idCategoria = idCategoria;
        this.nome = nome;
        this.descricao = descricao;
        this.areaConhecimento = areaConhecimento;
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
}