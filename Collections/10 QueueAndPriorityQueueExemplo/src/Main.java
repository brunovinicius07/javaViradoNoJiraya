import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");
        for (String s : fila) {
            System.out.println(s);
        }
        System.out.println("------");

        while (!fila.isEmpty()){
            System.out.println(fila.poll());
        }

    }
}