import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente(3L,"Jão",22));
        clientes.add(new Cliente(1L,"Maria", 16));
        clientes.add(new Cliente(2L,"Ana", 17));

        for (Cliente clie : clientes) {
            System.out.println(clie);
        }

        System.out.println("-----------------------------------");
//        Iterator<Cliente> clienteIterator = clientes.iterator(); // forma comum
//        while (clienteIterator.hasNext()){
//            if (clienteIterator.next().getIdade() <= 17){
//                clienteIterator.remove();
//            }
//        }

        clientes.removeIf(cliente -> cliente.getIdade() <= 17); //Forma mais simples: Programação funcional
        for (Cliente clie : clientes) {
            System.out.println(clie);
        }
    }
}