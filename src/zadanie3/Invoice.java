package zadanie3;

public class Invoice extends Bill {
    String clientName;
    String city;
    String street;
    String number;

    public Invoice(String productName, String productOrigin, double basePrice, double finalPrice, String clientName, String city, String street, String number) {
        super(productName, productOrigin, basePrice, finalPrice);
        this.clientName = clientName;
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public Invoice(){

    }

    @Override
    public String documentInfo() {
        return super.documentInfo() +
                "Nazwa klienta: " + clientName + "\n" +
                "Miejcowość: " + city + "\n" +
                "Ulica: " + street + "\n" +
                "Numer: " + number;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "clientName='" + clientName + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", productName='" + productName + '\'' +
                ", productOrigin='" + productOrigin + '\'' +
                ", basePrice=" + basePrice +
                ", finalPrice=" + finalPrice +
                '}';
    }
}
