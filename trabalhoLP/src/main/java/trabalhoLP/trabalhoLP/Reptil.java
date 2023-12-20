package trabalhoLP.trabalhoLP;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Reptil extends TipoAnimal{


    @Column
    private boolean peconhenta;


    public boolean isPeconhenta() {
        return peconhenta;
    }

    public void setPeconhenta(boolean peconhenta) {
        this.peconhenta = peconhenta;
    }
}
