package br.edu.unichristus.domain.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "tb_emprestimo")
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmprestimo;

    @Column(nullable = false)
    private LocalDate dataEmprestimo;

    @Column(nullable = false)
    private LocalDate dataDevolucao;

    @Column
    private Double multa;

    @Column(nullable = false)
    private String status;

    public Emprestimo() {
    }

    public Emprestimo(Long idEmprestimo, LocalDate dataEmprestimo, LocalDate dataDevolucao, Double multa, String status) {
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

    // equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emprestimo)) return false;
        Emprestimo that = (Emprestimo) o;
        return Objects.equals(idEmprestimo, that.idEmprestimo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmprestimo);
    }

    // toString
    @Override
    public String toString() {
        return "Emprestimo{" +
                "idEmprestimo=" + idEmprestimo +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                ", multa=" + multa +
                ", status='" + status + '\'' +
                '}';
    }
}