import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Unidade {

    @Id
    @Column
    private int id_unidade;

    @Column(length = 50)
    private String nome;


}
