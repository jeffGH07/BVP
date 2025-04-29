package java.domain.models.entity;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(length = 150, nullable = false)
    private String nome;

    @Column(nullable = false)
    private int idade;

    @Column(length = 150, nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String senha;

    public Usuario() {
    }

    public Usuario(Long idUsuario, String nome, int idade, String email, String senha) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
    }

    // Getters e Setters
    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario usuario)) return false;
        return Objects.equals(idUsuario, usuario.idUsuario) &&
                Objects.equals(email, usuario.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, email);
    }

    // toString
    @Override
    public String toString() {
        return "java.model.entity.Usuario{" +
                "idUsuario=" + idUsuario +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                '}';
    }
}