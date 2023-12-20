import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mamifero extends TipoAnimal{

    @Id
    @Column
    private Integer id_mamifero;

    @Column(length = 50)
    private String raca;

    @Column
    private boolean possuiPelos;

    public Integer getId_mamifero() {
        return id_mamifero;
    }

    public void setId_mamifero(Integer id_mamifero) {
        this.id_mamifero = id_mamifero;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public boolean isPossuiPelos() {
        return possuiPelos;
    }

    public void setPossuiPelos(boolean possuiPelos) {
        this.possuiPelos = possuiPelos;
    }
}
