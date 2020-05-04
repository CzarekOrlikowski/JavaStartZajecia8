package zadanie3;

public class Client {
    private String name;
    private Address address;
    private String type;
    private boolean premium;

    public static String TYPE_COMPANY = "Company";
    public static String TYPE_CONSUMER = "Consumer";

    public Client(String name, Address address, String type, boolean premium) {
        this.name = name;
        this.address = address;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public static String getTypeCompany() {
        return TYPE_COMPANY;
    }

}

