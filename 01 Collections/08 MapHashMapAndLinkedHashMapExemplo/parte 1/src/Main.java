import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc", "você2"); // Só vai adicionar, caso ele não exista
        System.out.println(map);

        System.out.println("-------------------");

        for(String key : map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }
    }
}