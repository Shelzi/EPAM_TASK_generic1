package by.epam.lab;

public class PurchaseUtils<E extends Priceable> {
    private Purchase<E> purchase;

    public PurchaseUtils() {
        purchase = new Purchase<E>();
    }

    public PurchaseUtils(Purchase<E> purchase) {
        this.purchase = purchase;
    }

    public PurchaseUtils(E item, double number) {
        this.purchase = new Purchase<E>(item, number);
    }

    public Purchase<E> getPurchase() {
        return purchase;
    }

    public void printPurchase() {
        System.out.printf("%s%n", purchase);
    }

    public void printCost() {
        System.out.printf("cost = %s%n", purchase.getCost());
    }

    public void printCostDiff(Purchase<E> purchase) {
        Byn costDiff = new Byn(getPurchase().getCost().compareTo(purchase.getCost()));
        System.out.printf("diff = %s BYN%n", costDiff);
    }

    public void printIsSameCost(Purchase<?>... purchases) {
        boolean areEqual = false;
        for (Purchase<?> value : purchases) {
            areEqual = value.equals(this.purchase);
            if (areEqual) {
                break;
            }
        }
        if (areEqual) {
            System.out.println("There is purchase among array with the same cost like this purchase");
        } else {
            System.out.println("There are no purchases among array with the same cost like this purchase");
        }
    }
}