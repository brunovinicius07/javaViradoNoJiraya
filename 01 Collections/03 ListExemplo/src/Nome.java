import java.util.HashMap;

public class Nome {
    private String nome;

    public Nome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Nome nome1 = (Nome) obj;
        return nome!= null && nome.equals(nome1.nome);
    }

    @Override
    public String toString() {
        return  nome ;
    }
}
