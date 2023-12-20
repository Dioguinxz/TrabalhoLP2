package trabalhoLP.trabalhoLP;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Vacina {

    @Id
    private Integer id_vacina;


    @Column(length = 50)
    private String nome;


    @ManyToOne
    private Mamifero mamifero;

    public Integer getId_vacina() {
        return id_vacina;
    }

    public void setId_vacina(Integer id_vacina) {
        this.id_vacina = id_vacina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Mamifero getMamifero() {
        return mamifero;
    }

    public void setMamifero(Mamifero mamifero) {
        this.mamifero = mamifero;
    }
}
