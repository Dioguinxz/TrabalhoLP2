package trabalhoLP.trabalhoLP;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Produto {

    @Id
    @Column
    private Integer id_produto;

    @Column
    private Number valor;

    @Column(length = 100)
    private String descricao;

    @ManyToOne
    private TipoAnimal tipoAnimal;

    public Integer getId_produto() {
        return id_produto;
    }

    public void setId_produto(Integer id_produto) {
        this.id_produto = id_produto;
    }

    public Number getValor() {
        return valor;
    }

    public void setValor(Number valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    @OneToMany
    private List<Estoque> estoque;

}
