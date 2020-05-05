package zadanie3;

public class Client {
    private String name;
    private Address address;
    private boolean premium;

    public Client(String name, Address address, boolean premium) {
        this.name = name;
        this.address = address;
        this.premium = premium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean getPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public Bill documentCreator(Product product) {
        Double finalPrice;
        if (getPremium()) {
            finalPrice = 0.9 * product.getPrice();
        } else finalPrice = product.getPrice();
        return new Bill(product.getName(), product.getOrigin(), product.getPrice(), finalPrice);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", premium=" + premium +
                '}';
    }
}

