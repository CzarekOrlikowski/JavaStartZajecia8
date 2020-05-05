package zadanie3;

public class Company extends Client{
    private String type = "company";

    public Company(String name, Address address, boolean premium, String type) {
        super(name, address, premium);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Bill documentCreator(Product product) {
        Bill bill = super.documentCreator(product);
        return new Invoice(bill.getProductName(), bill.getProductName(), bill.getBasePrice(), bill.getFinalPrice(), getName(), getAddress().getCity(),
                getAddress().getStreet(), getAddress().getNumber());
    }

    @Override
    public String toString() {
        return "Company{" +
                "type='" + type + '\'' +
                '}';
    }
}

