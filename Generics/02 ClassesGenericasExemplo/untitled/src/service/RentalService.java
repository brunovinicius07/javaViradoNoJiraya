package service;

import dominio.Carro;

import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponivel;

    public RentalService(List<T> objetosDisponivel) {
        this.objetosDisponivel = objetosDisponivel;
    }

    public T buscarObjetoDisponivel(){
        System.out.println("Buscando objeto disponivel...");
        T t = objetosDisponivel.remove(0);
        System.out.println("Alugando objeto: " + t);
        System.out.println("Objetos disponiveis para alugar:");
        System.out.println(objetosDisponivel);
        return t;
    }

    public void retornarObjetoAlugado(T t){
        System.out.println("Devolvendo objeto " + t);
        objetosDisponivel.add(t);
        System.out.println("Objetos disponíveis para alugar: ");
        System.out.println(objetosDisponivel);
    }
}
