import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TipoAnimal {

    @Id
    @Column
    private Integer id_tipoAnimal;

    @Column(length = 50)
    private String especie;

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


}
