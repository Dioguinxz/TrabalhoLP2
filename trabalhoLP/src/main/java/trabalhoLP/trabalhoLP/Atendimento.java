package trabalhoLP.trabalhoLP;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import org.hibernate.Length;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Atendimento {

    @Id
    @Column
    private Integer id_atendimento;

    @Column
    private LocalDateTime datetime;

    @Column(length = 50)
    private String nome_atendimento;

    @Column
    private String nome_atendente;

    @Column
    private boolean pagamento_efetuado;

    @Column
    private Number valorConsulta;

    @Column
    private String estado;

    @Column
    private String nome_veterinário;

    @Column
    private LocalDateTime dataEncerramento;

    @ManyToMany
    private List<Produto> produto;

    public Integer getId_atendimento() {
        return id_atendimento;
    }

    public void setId_atendimento(Integer id_atendimento) {
        this.id_atendimento = id_atendimento;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public String getNome_atendimento() {
        return nome_atendimento;
    }

    public void setNome_atendimento(String nome_atendimento) {
        this.nome_atendimento = nome_atendimento;
    }

    public String getNome_atendente() {
        return nome_atendente;
    }

    public void setNome_atendente(String nome_atendente) {
        this.nome_atendente = nome_atendente;
    }

    public boolean isPagamento_efetuado() {
        return pagamento_efetuado;
    }

    public void setPagamento_efetuado(boolean pagamento_efetuado) {
        this.pagamento_efetuado = pagamento_efetuado;
    }

    public Number getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(Number valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNome_veterinário() {
        return nome_veterinário;
    }

    public void setNome_veterinário(String nome_veterinário) {
        this.nome_veterinário = nome_veterinário;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public LocalDateTime getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(LocalDateTime dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }
}
