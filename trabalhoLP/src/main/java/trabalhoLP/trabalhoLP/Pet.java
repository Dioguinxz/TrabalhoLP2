package trabalhoLP.trabalhoLP;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Pet {

    @Id
    @Column
    private Integer id_pet;

    @Column(length = 50)
    private String nome;

    @Column
    private Integer idade;

    @OneToMany
    private List<Atendimento> atendimento;

    public Integer getId_pet() {
        return id_pet;
    }

    public void setId_pet(Integer id_pet) {
        this.id_pet = id_pet;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }



    public List<Atendimento> getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(List<Atendimento> atendimento) {
        this.atendimento = atendimento;
    }
}
