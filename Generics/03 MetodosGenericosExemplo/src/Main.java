import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa Marota"));
        System.out.println(barcoList);

    }

    private static <T> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }

//    private static <T extends Comparable<T>> List <T> criarArrayComObjeto(T t){
//        return List.of(t);
//    }
}