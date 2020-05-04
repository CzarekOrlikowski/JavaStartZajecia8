package zadanie1;

import java.util.Objects;
import java.util.Scanner;

public class Fruit {
    private String name;
    private double price;

    public Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static Fruit fruitCreator() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nazwę owocu: ");
        String name = scan.nextLine();
        System.out.println("Podaj cenę owocu: ");
        double price = scan.nextDouble();
        return new Fruit(name, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fruit)) return false;
        Fruit fruit = (Fruit) o;
        return Double.compare(fruit.getPrice(), getPrice()) == 0 &&
                Objects.equals(getName(), fruit.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice());
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
