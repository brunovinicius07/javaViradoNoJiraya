package test;

import dominio.Car;

import java.util.List;

public class ComportamentoPorParametro01 {
    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("Green", 2011),
                new Car("Black", 1998),
                new Car("Red", 2019)
        );
    }
}
