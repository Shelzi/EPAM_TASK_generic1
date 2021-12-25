package by.epam.lab;

public class DiscountProduct extends Product {
    private final Byn discount;

    public DiscountProduct() {
        discount = new Byn();
    }

    public DiscountProduct(Byn discount) {
        this.discount = discount;
    }

    public DiscountProduct(String name, Byn price, Byn discount) {
        super(name, price);
        this.discount = discount;
    }

    @Override
    public Byn getPrice() {
        return super.getPrice().sub(discount);
    }

    @Override
    protected String fieldsToString() {
        return String.format("%s;%s", super.fieldsToString(), discount);
    }
}