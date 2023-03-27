import java.util.Objects;

public class Cliente {
    private Long id;
    private String nome;
    private int idade;

    public Cliente(Long id, String nome, int idade) {
        Objects.requireNonNull(id, "Id não pode ser null");
        this.id = id;
        Objects.requireNonNull(nome, "Nome não pode ser null");
        this.nome = nome;
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
