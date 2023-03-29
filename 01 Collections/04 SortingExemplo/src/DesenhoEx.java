import java.util.Objects;

public class DesenhoEx implements Comparable<DesenhoEx>{
    private Long id;
    private String nome;
    private double preco;

    public DesenhoEx(Long id, String nome, double preco) {
        Objects.requireNonNull(id,"Id não pode ser null");
        Objects.requireNonNull(nome,"Nome não pode ser null");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DesenhoEx desenhoEx = (DesenhoEx) o;
        return Double.compare(desenhoEx.preco, preco) == 0 && id.equals(desenhoEx.id) && nome.equals(desenhoEx.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString() {
        return "DesenhoEx{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(DesenhoEx outroDesenho) {
        //negativo se o this < outroDesenho
        //se this == outroDesenho, return 0
        //positivo se this > outroDesenho

        return this.id.compareTo(outroDesenho.getId()); //Ordem por ID
        //return Double.compare(preco, outroDesenho.preco); Ordem por Preço
        //return this.nome.compareTo(outroDesenho.getNome()); Ordem por Nome
    }
}
