package br.edu.unichristus.domain.dto;

import java.util.Objects;

public class GeneroDTO {
    private Long idGenero;
    private String nome;
    private String descricao;
    private String areaConhecimento;

    public GeneroDTO() {
    }

    public GeneroDTO(Long idGenero, String nome, String descricao, String areaConhecimento) {
        this.idGenero = idGenero;
        this.nome = nome;
        this.descricao = descricao;
        this.areaConhecimento = areaConhecimento;
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

    public String getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(String areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }
}