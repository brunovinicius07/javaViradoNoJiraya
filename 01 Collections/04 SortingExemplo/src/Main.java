import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DesenhoExByComparator implements Comparator<DesenhoEx>{

    @Override
    public int compare(DesenhoEx desenho1, DesenhoEx desenho2) {
        return desenho1.getNome().compareTo(desenho2.getNome());
    }
}

public class Main {
    public static void main(String[] args) {
        List<DesenhoEx> desenhosEx = new ArrayList<>();
        DesenhoEx D1 = new DesenhoEx(3L,"Pokemon",19.9);
        DesenhoEx D2 = new DesenhoEx(1L,"Dragon ball Z",29.5);
        DesenhoEx D3 = new DesenhoEx(4L,"Super 11",10.0);
        DesenhoEx D4 = new DesenhoEx(2L,"Caverna do dragão",19.0);
        DesenhoEx D5 = new DesenhoEx(2L,"Caverna do dragão",19.0);
        desenhosEx.add(D1);
        desenhosEx.add(D2);
        desenhosEx.add(0,D3);
        desenhosEx.add(D4);
        for (DesenhoEx ex : desenhosEx) {
            System.out.println(ex);
        }

        Collections.sort(desenhosEx);
        System.out.println("--------------------------------------------------");
        for (DesenhoEx ex : desenhosEx){
            System.out.println(ex);
        }

        Collections.sort(desenhosEx, new DesenhoExByComparator());
        System.out.println("--------------------------------------------------");
        for (DesenhoEx ex : desenhosEx){
            System.out.println(ex);
        }

        System.out.println("--------------------------------------------------");
        int i = desenhosEx.indexOf(D2);
        System.out.println(i);

        System.out.println("--------------------------------------------------");
        System.out.println(desenhosEx.contains(D3));

        System.out.println("--------------------------------------------------");
        System.out.println(D5.equals(D4));

    }
}