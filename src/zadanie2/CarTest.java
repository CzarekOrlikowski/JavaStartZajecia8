package zadanie2;

public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car("opel", 50, 5);
        System.out.println("Pojazd: " + car1.printInfo());
        System.out.printf("Zasieg bazowy, km: %.2f \n", car1.rangeCalculator());
        car1.setAirConditioning(true);
        System.out.printf("Zasieg z klimatyzacją, km: %.2f \n", car1.rangeCalculator());

        Truck  truck1 = new Truck ("man", 100, 10);
        System.out.println("Pojazd: " + truck1.printInfo());
        System.out.printf("Zasieg bazowy, km: %.2f \n", truck1.rangeCalculator());
        truck1.setAirConditioning(true);
        System.out.printf("Zasieg z klimatyzacją, km: %.2f \n", truck1.rangeCalculator());
        truck1.setTruckLoad(200);
        System.out.printf("Zasieg z ładunkiem %.2f kg, km: %.2f", truck1.getTruckLoad(), truck1.rangeCalculator());

    }
}
