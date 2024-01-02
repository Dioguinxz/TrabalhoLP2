package trabalhoLP.trabalhoLP;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.Length;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Estoque {

    @Id
    @Column
    private Integer id_estoque;

    @Column
    private LocalDateTime data_operacao;

    @Column
    private int quantidade;

    @Column
    private Date validade;

    @Column(length = 20)
    private String lote;

    public Integer getId_estoque() {
        return id_estoque;
    }

    public void setId_estoque(Integer id_estoque) {
        this.id_estoque = id_estoque;
    }

    public LocalDateTime getData_operacao() {
        return data_operacao;
    }

    public void setData_operacao(LocalDateTime data_operacao) {
        this.data_operacao = data_operacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }
}
