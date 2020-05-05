package zadanie3;

public class Consumer extends Client {
    private String type = "consumer";

    public Consumer(String name, Address address, boolean premium, String type) {
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
        return super.documentCreator(product);
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "type='" + type + '\'' +
                '}';
    }
}