import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        NavigableSet<Campeonato> campeonatoPE = new TreeSet<>();
        campeonatoPE.add(new Campeonato("Central", 12L));
        campeonatoPE.add(new Campeonato("Central", 12L)); // TreeSet não imprime duplicado
        campeonatoPE.add(new Campeonato("Salgueiro", 18L));
        campeonatoPE.add(new Campeonato("Santa Cruz", 29L));
        campeonatoPE.add(new Campeonato("Nautico", 22L));
        campeonatoPE.add(new Campeonato("Sport", 25L));

        for(Campeonato camp : campeonatoPE.descendingSet()){ //descendingSet: inverte a ordem.
            System.out.println(camp); //Só funciona com o comparable ou compareTo
        }

    }
}