import java.util.Objects;

public class SmartPhone {
    private String marca;
    private double preco;

    public SmartPhone(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartPhone that = (SmartPhone) o;
        return Double.compare(that.preco, preco) == 0 && marca.equals(that.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, preco);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "marca='" + marca + '\'' +
                ", preco=" + preco +
                '}';
    }
}
