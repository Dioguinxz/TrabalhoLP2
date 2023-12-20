package trabalhoLP.trabalhoLP;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Unidade {

    @Id
    @Column
    private int id_unidade;

    @Column(length = 50)
    private String nome;

    @OneToMany
    private List<Atendimento> atendimento;

    @ManyToOne
    private Endereco endereco;

}
