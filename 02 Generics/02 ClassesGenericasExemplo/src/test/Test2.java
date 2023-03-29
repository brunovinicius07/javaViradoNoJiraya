package test;

import dominio.Barco;
import dominio.Carro;
import service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Carro> carroDisponivel = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponivel = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        RentalService<Carro> rentalService = new RentalService<>(carroDisponivel);
        Carro carro = rentalService.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mês");
        rentalService.retornarObjetoAlugado(carro);

        System.out.println("------------------------------------------------------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponivel);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando o barco por um mês");
        rentalServiceBarco.retornarObjetoAlugado(barco);
    }
}
