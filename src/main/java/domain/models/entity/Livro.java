package java.domain.models.entity;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_livro")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLivro;

    @Column(length = 150, nullable = false)
    private String autor;

    @Column(length = 150, nullable = false)
    private String titulo;

    @Column(length = 150, nullable = false)
    private String editora;

    @Column(nullable = false)
    private int anoPublicacao;

    @Column(length = 13, nullable = false, unique = true)
    private String isbn;

    @Column(nullable = false)
    private int quantidadeDisponivel;

    @Column(length = 50, nullable = false)
    private String formato;

    public Livro() {
    }

    public Livro(Long idLivro, String autor, String titulo, String editora, int anoPublicacao, String isbn, int quantidadeDisponivel, String formato) {
        this.idLivro = idLivro;
        this.autor = autor;
        this.titulo = titulo;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.formato = formato;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    // equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro livro)) return false;
        return Objects.equals(idLivro, livro.idLivro) &&
                Objects.equals(isbn, livro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLivro, isbn);
    }

    // toString
    @Override
    public String toString() {
        return "java.model.entity.Livro{" +
                "idLivro=" + idLivro +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", editora='" + editora + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", isbn='" + isbn + '\'' +
                ", quantidadeDisponivel=" + quantidadeDisponivel +
                ", formato='" + formato + '\'' +
                '}';
    }
}