import java.util.ArrayList;
import java.util.List;

public class Wildcard01 {
    public static void main(String[] args){
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);
        List<Animal> animals = new ArrayList<>();
        printConsulta(animals);
    }

    private static void printConsulta(List<? extends Animal> animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
    private static void printConsultaAnimal(List<? super Animal> animals){
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}