import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Peixe extends TipoAnimal {

    @Id
    @Column
    private Integer id_peixe;

    @Column(length = 50)
    private String tipoAgua;

    public Integer getId_peixe() {
        return id_peixe;
    }

    public void setId_peixe(Integer id_peixe) {
        this.id_peixe = id_peixe;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }
}
