import java.util.Collections;
import java.util.Objects;

public class Campeonato implements Comparable<Campeonato> {
    String clube;
    Long pontos;

    public Campeonato(String clube, Long pontos) {

        Objects.requireNonNull(clube, "O club não pode ser Null");
        this.clube = clube;
        Objects.requireNonNull(pontos, "Os pontos não podem ser Null");
        this.pontos = pontos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Campeonato that = (Campeonato) o;
        return clube.equals(that.clube) && pontos.equals(that.pontos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clube, pontos);
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public Long getPontos() {
        return pontos;
    }

    public void setPontos(Long pontos) {
        this.pontos = pontos;
    }

    @Override
    public String toString() {
        return "Campeonato{" +
                ", clube='" + clube + '\'' +
                ", pontos=" + pontos +
                '}';
    }

    @Override
    public int compareTo(Campeonato o) {
        return this.pontos.compareTo(o.getPontos());
    }
}
