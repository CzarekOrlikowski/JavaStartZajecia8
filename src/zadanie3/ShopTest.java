package zadanie3;

public class ShopTest {
    public static void main(String[] args) {

        Address address1 = new Address("wrocław", "zielona", "11b");
        Address address2 = new Address("opole", "mała", "44");
        Client client1 = new Client("jan kowalski", address1, Client.TYPE_CONSUMER, false);
        Client client2 = new Client("bondex sp. z o.o.", address2, Client.TYPE_COMPANY, true);
        Product product1 = new Product("biurko", "niemcy", 4500.0);
        Product product2 = new Product("szafa", "rosja", 12500.0);

        Shop shop1 = new Shop();
        shop1.documentCheck(product1, client1);
        shop1.documentCheck(product2,client2);
    }
}
