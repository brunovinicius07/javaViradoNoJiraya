import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Bruno");
        nomes.add("Vinícius");

        for (String nom:nomes){
            System.out.println(nom);
        }
        nomes.remove(1);
        nomes.remove("Bruno");
        nomes.add("Roberta");
        System.out.println("-----------");
        for (int i=0; i< nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
    }
}