package java.domain.models.entity;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(length = 255)
    private String descricao;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PublicoAlvo publicoAlvo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AreaConhecimento areaConhecimento;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoCategoria tipoCategoria;

    public Categoria() {
    }

    public Categoria(Long idCategoria, String nome, String descricao, PublicoAlvo publicoAlvo, AreaConhecimento areaConhecimento, TipoCategoria tipoCategoria) {
        this.idCategoria = idCategoria;
        this.nome = nome;
        this.descricao = descricao;
        this.publicoAlvo = publicoAlvo;
        this.areaConhecimento = areaConhecimento;
        this.tipoCategoria = tipoCategoria;
    }

    // Getters e Setters
    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
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

    public PublicoAlvo getPublicoAlvo() {
        return publicoAlvo;
    }

    public void setPublicoAlvo(PublicoAlvo publicoAlvo) {
        this.publicoAlvo = publicoAlvo;
    }

    public AreaConhecimento getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(AreaConhecimento areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }

    public TipoCategoria getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(TipoCategoria tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    // equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Categoria categoria)) return false;
        return Objects.equals(idCategoria, categoria.idCategoria) &&
                Objects.equals(nome, categoria.nome) &&
                Objects.equals(descricao, categoria.descricao) &&
                publicoAlvo == categoria.publicoAlvo &&
                areaConhecimento == categoria.areaConhecimento &&
                tipoCategoria == categoria.tipoCategoria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCategoria, nome, descricao, publicoAlvo, areaConhecimento, tipoCategoria);
    }

    // toString
    @Override
    public String toString() {
        return "Categoria{" +
                "idCategoria=" + idCategoria +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", publicoAlvo=" + publicoAlvo +
                ", areaConhecimento=" + areaConhecimento +
                ", tipoCategoria=" + tipoCategoria +
                '}';
    }
}