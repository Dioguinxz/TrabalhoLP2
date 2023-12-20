import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vacina extends Mamifero {


    @Id
    @Column
    private Integer id_vacina;

    @Id
    @Column(length = 50)
    private String nome;






}
