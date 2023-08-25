import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Granta", 1.7, "yellow",
                2015, "Russia", "sedan", 5, "МТ",
                "AA111A98", true, null, 160);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", -5, "black",
                2020, "Germany", "crossover", 5, "AT",
                "AA222A98", true, new Car.Key(true, false), 260);
        Car car3 = new Car("BMW", "Z8", 3.0, "black",
                2021, "Germany", "cabriolet", 2, "AT",
                "AA333A98", true, new Car.Key(false, true), 300);
        Car car4 = new Car("Kia", "Sportage 4th generation", 2.4, "red",
                2018, "South Korea", "crossover", 5, "AT",
                "AA444A98", true, new Car.Key(true, true), 200);
        Car car5 = new Car("Hyundai", "Avante", 1.6, "orange",
                2016, "South Korea", "sedan", 5, "МТ",
                "AA555A98", false, new Car.Key(false, false), -5);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

        car5.changeTiresSeasonal(8);
        System.out.println(car5);

        Bus bus1 = new Bus("Автобус бренд 1", "модель1", 2020, "Россия",
                "красный", 150);
        Bus bus2 = new Bus("Автобус бренд 2", "модель2", 2021, "Китай",
                "желтый", 160);
        Bus bus3 = new Bus("Автобус бренд 3", "модель3", 2022, "Корея",
                "зеленый", -170);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
    }
}