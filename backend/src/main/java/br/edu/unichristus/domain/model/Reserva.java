package br.edu.unichristus.domain.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "tb_reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idUser", nullable = false)
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idLivro", nullable = false)
    private Livro livro;

    @Column(nullable = false)
    private LocalDate dataReserva;

    @Column(nullable = false)
    private LocalDate prazo;

    @Column(nullable = false, length = 50)
    private String status;

    public Reserva() {
    }

    public Reserva(Usuario usuario, Livro livro, LocalDate dataReserva, LocalDate prazo, String status) {
        this.usuario = usuario;
        this.livro = livro;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
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

    // equals e hashCode baseados apenas no ID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reserva reserva)) return false;
        return Objects.equals(idReserva, reserva.idReserva);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idReserva);
    }

    // toString
    @Override
    public String toString() {
        return "Reserva{" +
                "idReserva=" + idReserva +
                ", usuario=" + usuario +
                ", livro=" + livro +
                ", dataReserva=" + dataReserva +
                ", prazo=" + prazo +
                ", status='" + status + '\'' +
                '}';
    }
}