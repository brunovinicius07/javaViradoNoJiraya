package test;

import dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametro01 {
    private static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black", 1998), new Car("Red", 2019));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterRedCar(cars));
        System.out.println("--------------------------");
        System.out.println(filterCarByColor(cars, "Green"));
        System.out.println(filterCarByColor(cars, "Red"));
        System.out.println("--------------------------");
        System.out.println(filterByYear(cars, 2015));
    }

    private static List<Car> filterGreenCar(List<Car> cars){
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("Green")){
                greenCars.add(car);
            }

        }
        return greenCars;
    }
    private static List<Car> filterRedCar(List<Car> cars){
        List<Car> redCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("Red")){
                redCars.add(car);
            }

        }
        return redCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String cor){
        List<Car> filterCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(cor)){
                filterCars.add(car);
            }

        }
        return filterCars;
    }

    private static List<Car> filterByYear(List<Car> cars, int year){
        List<Car> filterCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year){
                filterCars.add(car);
            }

        }
        return filterCars;
    }
}
