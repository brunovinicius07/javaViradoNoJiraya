import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("1º- Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7D);
        notas.add(8.5D);
        notas.add(9.3D);
        notas.add(5D);
        notas.add(7D);
        notas.add(0D);
        notas.add(3.6);
        System.out.println("RESPOSTA: "+notas);

        System.out.println("----------------------------------------");

        System.out.println("2º- Exiba a posição da nota 5.0: ");
        System.out.println("RESPOSTA: "+notas.indexOf(5D));

        System.out.println("----------------------------------------");

        System.out.println("3º- Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4,8D);
        System.out.println("RESPOSTA: "+notas);

        System.out.println("----------------------------------------");

        System.out.println("4º- Substitua a nota 5.0 pela nota 6.0: "); //Não sabia, mas tentei antes de pesquisar. coloquei notas. e vi as opções que tinha.
        notas.set(3, 6D);
        System.out.println("RESPOSTA: "+notas);

        System.out.println("----------------------------------------");

        System.out.println("5º- Confira se a nota 5.0 está na lista: ");
        if (notas.contains(5D)){
            System.out.println("RESPOSTA: "+"Contem a nota 5.0 na lista");
        }else {
            System.out.println("RESPOSTA: "+"Não contem a nota 5.0 na lista");
        }

        System.out.println("----------------------------------------");

        System.out.println("6º- Exiba todas as notas na ordem em que foram informados: ");
        System.out.println("RESPOSTA: "+notas);

        System.out.println("----------------------------------------");

        System.out.println("7º- Exiba a terceira nota adicionada: ");
        System.out.println("RESPOSTA: "+notas.get(2));

        System.out.println("----------------------------------------");

        System.out.println("8º- Exiba todas as notas na ordem crescente: "); //Pesquisei no caderno.
        Collections.sort(notas);
        System.out.println("RESPOSTA: "+notas);

        System.out.println("----------------------------------------");

        System.out.println("9º- Exiba a menor nota: ");
        Double menor = Collections.min(notas);
        System.out.println("RESPOSTA: "+menor);

        System.out.println("----------------------------------------");

        System.out.println("10º- Exiba a maior nota: ");
        Double maior = Collections.max(notas);
        System.out.println("RESPOSTA: "+maior);

        System.out.println("----------------------------------------");

        System.out.println("11º- Remova a nota 0: ");
        notas.remove(0D);
        System.out.println("RESPOSTA: "+notas);

        System.out.println("----------------------------------------");

        System.out.println("12º- Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println("RESPOSTA: "+notas);

        System.out.println("----------------------------------------");

        System.out.println("13º- Remova as notas menores que 7 e exiba a lista: ");
        Predicate<Double>filter = n -> n < 7;
        notas.removeIf(filter);
        System.out.println("RESPOSTA: "+notas);

        System.out.println("----------------------------------------");

        System.out.println("14º- Apague toda a lista");
        //notas.clear();
        System.out.println("RESPOSTA: "+notas);

        System.out.println("----------------------------------------");

        List<Double> notas2 = notas;
        System.out.println(notas2.get(0));

        System.out.println("----------------------------------------");
        System.out.println(notas2.get(0));
        notas2.remove(0);
        System.out.println(notas2);
    }
}