package zadanie3;

public class Bill {
    protected String productName;
    protected String productOrigin;
    protected double basePrice;
    protected double finalPrice;

    public Bill(String productName, String productOrigin, double basePrice, double finalPrice) {
        this.productName = productName;
        this.productOrigin = productOrigin;
        this.basePrice = basePrice;
        this.finalPrice = finalPrice;
    }

    public Bill() {

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductOrigin() {
        return productOrigin;
    }

    public void setProductOrigin(String productOrigin) {
        this.productOrigin = productOrigin;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public Bill documentCreator(Product product, Client client) {
        if (client.getPremium()) {
            finalPrice = 0.9 * product.getPrice();
        } else finalPrice = product.getPrice();
        return new Bill(productName = product.getName(), productOrigin = product.getOrigin(), basePrice = product.getPrice(), finalPrice);

    }

    public String documentInfo() {
        return "Dokument księgowy \n" +
                "Nazwa produktu: " + productName + "\n" +
                "Pochodzenie produktu: " + productOrigin + "\n" +
                "Cena bazowa: " + basePrice + "\n" +
                "Cena końcowa: " + finalPrice + "\n";
    }

}
