import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Reptil extends TipoAnimal{

    @Id
    @Column
    private Integer id_reptil;

    @Column
    private boolean peconhenta;


    public Integer getId_reptil() {
        return id_reptil;
    }

    public void setId_reptil(Integer id_reptil) {
        this.id_reptil = id_reptil;
    }

    public boolean isPeconhenta() {
        return peconhenta;
    }

    public void setPeconhenta(boolean peconhenta) {
        this.peconhenta = peconhenta;
    }
}
