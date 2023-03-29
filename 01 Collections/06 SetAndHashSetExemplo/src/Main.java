import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Clube> clubes = new HashSet<>();
        clubes.add(new Clube(1L, "Santa Cruz", 1 , 22));
        clubes.add(new Clube(2L, "Nautico", 3, 15));
        clubes.add(new Clube(3L, "Sport", 2, 19));
        clubes.add(new Clube(4L, "Retro", 4, 14));

        for (Clube club : clubes){
            System.out.println(club);
        }
    }
}