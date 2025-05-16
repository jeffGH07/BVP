package br.edu.unichristus.domain.dto;

import java.time.LocalDate;

import java.util.Objects;

public class EmprestimoDTO {
    private Long idEmprestimo;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private Double multa;
    private String status;

    public EmprestimoDTO() {
    }

    public EmprestimoDTO(Long idEmprestimo, LocalDate dataEmprestimo, LocalDate dataDevolucao, Double multa, String status) {
        this.idEmprestimo = idEmprestimo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.multa = multa;
        this.status = status;
    }

    // Getters e Setters
    public Long getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(Long idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}