import java.util.ArrayList;
import java.util.List;

public class NomesEx2 {
    public static void main(String[] args) {

        Nome n1 = new Nome("Bruno");
        Nome n2 = new Nome("Joaquim");
        Nome n3 = new Nome("João");
        List<Nome> nomesEx2 = new ArrayList<>();
        nomesEx2.add(n1);
        nomesEx2.add(n2);
        nomesEx2.add(0,n3);

        for (Nome no: nomesEx2){
            System.out.println(no);
        }
        Nome n4 = new Nome("Bruno");
        System.out.println("------------------------");
        System.out.println(nomesEx2.contains(n4));
        System.out.println(n1.equals(n4));
        int indexNome4 = nomesEx2.indexOf(n4);
        System.out.println(indexNome4);

    }


}
