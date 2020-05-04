package zadanie3;

public class Product {
    private String name;
    private String origin;
    private double price;

    public Product(String name, String origin, double price) {
        this.name = name;
        this.origin = origin;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
