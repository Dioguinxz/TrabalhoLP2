package trabalhoLP.trabalhoLP;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mamifero extends TipoAnimal{


    @Column(length = 50)
    private String raca;

    @Column
    private boolean possuiPelos;


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
