package br.edu.unichristus.domain.dto;

import java.util.Objects;
import java.util.Date;
import java.time.LocalDate;

public class ReservaDTO {
    private Long idReserva;
    private LocalDate dataReserva;
    private LocalDate prazo;
    private String status;

    public ReservaDTO() {
    }

    public ReservaDTO(LocalDate dataReserva, LocalDate prazo, String status) {
        this.idReserva = idReserva;
        this.dataReserva = dataReserva;
        this.prazo = prazo;
        this.status = status;
    }

    // Getters e Setters
    public Long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Long idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDate dataReserva) {
        this.dataReserva = dataReserva;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}