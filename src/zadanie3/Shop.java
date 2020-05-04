package zadanie3;

public class Shop {

        public void documentCheck (Product product, Client client){

            if (client.getType() == Client.TYPE_COMPANY) {
                Invoice invoice = new Invoice();
                invoice.documentCreator(product, client);
                System.out.println(invoice.documentInfo());
            } else {
                Bill bill = new Bill();
                bill.documentCreator(product, client);
                System.out.println(bill.documentInfo());
            }
        }
    }