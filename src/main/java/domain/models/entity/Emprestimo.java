package java.domain.models.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tb_emprestimo")
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmprestimo;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idLivro", nullable = false)
    private Livro livro;

    @Column(nullable = false)
    private Date dataEmprestimo;

    @Column(nullable = false)
    private Date dataDevolucao;

    @Column(nullable = true)
    private Double multa;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    public Emprestimo() {
    }

    public Emprestimo(Long idEmprestimo, Usuario usuario, Livro livro, Date dataEmprestimo, Date dataDevolucao, Double multa, Status status) {
        this.idEmprestimo = idEmprestimo;
        this.usuario = usuario;
        this.livro = livro;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    // equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emprestimo emprestimo)) return false;
        return Objects.equals(idEmprestimo, emprestimo.idEmprestimo) &&
                Objects.equals(usuario, emprestimo.usuario) &&
                Objects.equals(livro, emprestimo.livro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmprestimo, usuario, livro);
    }

    // toString
    @Override
    public String toString() {
        return "java.model.entity.Emprestimo{" +
                "idEmprestimo=" + idEmprestimo +
                ", usuario=" + usuario +
                ", livro=" + livro +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                ", multa=" + multa +
                ", status=" + status +
                '}';
    }
}