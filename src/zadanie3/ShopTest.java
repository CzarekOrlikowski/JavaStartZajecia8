package zadanie3;

public class ShopTest {
    public static void main(String[] args) {

        Address address1 = new Address("wrocław", "zielona", "11b");
        Address address2 = new Address("opole", "mała", "44");
        Consumer consumer = new Consumer ("jan kowalski", address1, false, "consumer");
        Company company = new Company ("bondex sp. z o.o.", address2, true, "company");
        Product product1 = new Product("biurko", "niemcy", 4500.0);
        Product product2 = new Product("szafa", "rosja", 12500.0);

        System.out.println(consumer.documentCreator(product1));
        System.out.println(company.documentCreator(product1));

    }
}
