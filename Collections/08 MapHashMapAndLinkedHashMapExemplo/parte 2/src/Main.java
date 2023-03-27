import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Bruno Vinícius");
        Consumidor consumidor2 = new Consumidor("DevDojo");

        SmartPhone smartPhone1 = new SmartPhone("Iphone", 1500);
        SmartPhone smartPhone2 = new SmartPhone("Samsung", 1100);
        SmartPhone smartPhone3 = new SmartPhone("Nokia", 1000);
        SmartPhone smartPhone4 = new SmartPhone("LG", 1300);

        Map<Consumidor, SmartPhone> consumidorSmartPhone = new HashMap<>();
        consumidorSmartPhone.put(consumidor1, smartPhone3);
        consumidorSmartPhone.put(consumidor2, smartPhone1);
        for (Map.Entry<Consumidor, SmartPhone> entry : consumidorSmartPhone.entrySet()){
            System.out.println(entry.getKey().getNome() + ": " + entry.getValue().getMarca());
        }


    }
}