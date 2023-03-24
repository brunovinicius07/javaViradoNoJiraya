import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Bruno Vinícius");
        Consumidor consumidor2 = new Consumidor("DevDojo");

        SmartPhone smartPhone1 = new SmartPhone("Iphone", 1500);
        SmartPhone smartPhone2 = new SmartPhone("Samsung", 1100);
        SmartPhone smartPhone3 = new SmartPhone("Nokia", 1000);
        SmartPhone smartPhone4 = new SmartPhone("LG", 1300);

        List<SmartPhone> consumidorSmartPhone1List = List.of(smartPhone1, smartPhone2);
        List<SmartPhone> consumidorSmartPhone2List = List.of(smartPhone3, smartPhone4);
        Map<Consumidor, List<SmartPhone>> consumidorSmartPhoneMap = new HashMap<>();
        consumidorSmartPhoneMap.put(consumidor1, consumidorSmartPhone1List);
        consumidorSmartPhoneMap.put(consumidor2, consumidorSmartPhone2List);

        for (Map.Entry<Consumidor, List<SmartPhone>> entry : consumidorSmartPhoneMap.entrySet()){
            System.out.println(entry.getKey().getNome());
            for (SmartPhone smart : entry.getValue()){
                System.out.println("------ " + smart.getMarca());
            }
        }



    }
}