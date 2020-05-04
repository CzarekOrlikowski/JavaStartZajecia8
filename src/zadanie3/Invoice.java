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

    public Invoice documentCreator(Product product, Client client) {
        if (client.getPremium()) {
            finalPrice = 0.9 * product.getPrice();
        } else finalPrice = product.getPrice();
        return new Invoice(productName = product.getName(), productOrigin = product.getOrigin(), basePrice = product.getPrice(),
                finalPrice, clientName = client.getName(), city = client.getAddress().getCity(), street = client.getAddress().getStreet(),
                number = client.getAddress().getNumber());
    }

    @Override
    public String documentInfo() {
        return super.documentInfo() +
                "Nazwa klienta: " + clientName + "\n" +
                "Miejcowość: " + city + "\n" +
                "Ulica: " + street + "\n" +
                "Numer: " + number;
    }
}
