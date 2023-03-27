package service;

import dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponivel = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando barco disponivel...");
        Barco barco = barcosDisponivel.remove(0);
        System.out.println("Alugando barco: " + barco);
        System.out.println("Barcos disponiveis para alugar:");
        System.out.println(barcosDisponivel);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco){
        System.out.println("Devolvendo barco " + barco);
        barcosDisponivel.add(barco);
        System.out.println("Barcos disponíveis para alugar: ");
        System.out.println(barcosDisponivel);
    }
}
