package br.edu.unichristus.domain.dto;

import br.edu.unichristus.domain.model.Livro;

import java.util.Date;
import java.time.LocalDate;

import java.util.Objects;

public class EmprestimoDTO {
    private Long idEmprestimo;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private Double multa;
    private String status;
    private Livro livro;

    public EmprestimoDTO() {
    }

    public EmprestimoDTO(Long idEmprestimo, Date dataEmprestimo, Date dataDevolucao, Double multa, String status, Livro livro) {
        this.idEmprestimo = idEmprestimo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.multa = multa;
        this.status = status;
        this.livro = livro;
    }

    // Getters e Setters
    public Long getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(Long idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
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

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}