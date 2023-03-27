import java.util.Objects;

public class Clube implements Comparable<Clube>{

    Long id;
    String nome;
    int posicao;
    int pontos;

    public Clube(Long id, String nome, int posicao, int pontos) {
        Objects.requireNonNull(id, "Id não pode ser null");
        this.id = id;
        Objects.requireNonNull(nome,"Nome não pode ser null");
        this.nome = nome;
        Objects.requireNonNull(posicao, "Posição não pode ser null");
        this.posicao = posicao;
        Objects.requireNonNull(pontos, "Pontos não pode ser null");
        this.pontos = pontos;
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

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    @Override
    public String toString() {
        return "Clube{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", posicao=" + posicao +
                ", pontos=" + pontos +
                '}';
    }


    @Override
    public int compareTo(Clube o) {
        //return this.id.compareTo(o.getId());
        return Integer.valueOf(posicao).compareTo(o.getPosicao());
    }
}
