import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Desenho1 {
    public static void main(String[] args) {
        List<String> desenhos = new ArrayList<>();
        desenhos.add("1Pokemon");
        desenhos.add("3Dragon ball Z");
        desenhos.add("4Super 11");
        desenhos.add("2Caverna do dragão");

        Collections.sort(desenhos);

        for (String des:desenhos)

            System.out.println(des);
    }
}
