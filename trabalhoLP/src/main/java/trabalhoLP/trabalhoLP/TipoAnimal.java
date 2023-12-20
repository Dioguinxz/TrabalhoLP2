package trabalhoLP.trabalhoLP;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class TipoAnimal {

    @Id
    @Column
    protected Integer id_tipoAnimal;

    @Column(length = 50)
    private String especie;

    @OneToMany
    private List<Pet> pet;

    public Integer getId_tipoAnimal() {
        return id_tipoAnimal;
    }

    public void setId_tipoAnimal(Integer id_tipoAnimal) {
        this.id_tipoAnimal = id_tipoAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public List<Pet> getPet() {
        return pet;
    }

    public void setPet(List<Pet> pet) {
        this.pet = pet;
    }
}
