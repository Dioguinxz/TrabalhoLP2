package trabalhoLP.trabalhoLP;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Endereco {

    @Id
    @Column
    private Integer id_endereco;

    @Column(length = 100)
    private String logradouro;

    @Column(length = 50)
    private String bairro;

    @Column
    private Integer numero;


    public Integer getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(Integer id_endereco) {
        this.id_endereco = id_endereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }


}
