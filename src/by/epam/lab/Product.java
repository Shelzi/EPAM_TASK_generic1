package by.epam.lab;

public class Product implements Priceable {
    private final String name;
    private final Byn price;

    public Product() {
        name = "";
        price = new Byn();
    }

    public Product(String name, Byn price) {
        this.name = name;
        this.price = price;
    }

    public Byn getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    protected String fieldsToString() {
        return String.format("%s;%s", name, price);
    }

    @Override
    public String toString() {
        return String.format("%s;%s",fieldsToString(), getPrice());
    }
}