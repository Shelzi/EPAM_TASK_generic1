package by.epam.lab;

public class Purchase<E extends Priceable> implements Comparable<Purchase<Product>> {
    private E product;
    private double quantity;

    public Purchase() {
    }

    public Purchase(E product, double quantity) {

        this.product = product;
        this.quantity = quantity;
    }

    public E getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setProduct(E product) {
        this.product = product;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Byn getCost() {
        return product.getPrice().mul(quantity, RoundMethod.FLOOR, 2);
    }

    @Override
    public String toString() {
        return String.format("%s;%s", product, quantity);
    }

    @Override
    public int compareTo(Purchase o) {
        return getCost().compareTo(o.getCost());
    }
}