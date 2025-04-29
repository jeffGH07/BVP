package java.domain.models.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tb_reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idLivro", nullable = false)
    private Livro livro;

    @Column(nullable = false)
    private Date dataReserva;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusReserva status;

    public Reserva() {
    }

    public Reserva(Long idReserva, Usuario usuario, Livro livro, Date dataReserva, StatusReserva status) {
        this.idReserva = idReserva;
        this.usuario = usuario;
        this.livro = livro;
        this.dataReserva = dataReserva;
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

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public StatusReserva getStatus() {
        return status;
    }

    public void setStatus(StatusReserva status) {
        this.status = status;
    }

    // equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reserva reserva)) return false;
        return Objects.equals(idReserva, reserva.idReserva) &&
                Objects.equals(usuario, reserva.usuario) &&
                Objects.equals(livro, reserva.livro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idReserva, usuario, livro);
    }

    // toString
    @Override
    public String toString() {
        return "java.model.entity.Reserva{" +
                "idReserva=" + idReserva +
                ", usuario=" + usuario +
                ", livro=" + livro +
                ", dataReserva=" + dataReserva +
                ", status=" + status +
                '}';
    }
}