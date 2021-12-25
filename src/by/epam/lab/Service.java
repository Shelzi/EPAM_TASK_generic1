package by.epam.lab;

public class Service implements Priceable {
    private String name;
    private Byn totalCost;
    private int usersCount;

    public Service(String name, Byn totalCost, int usersCount) {
        this.name = name;
        this.totalCost = totalCost;
        this.usersCount = usersCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byn getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Byn totalCost) {
        this.totalCost = totalCost;
    }

    public int getUsersCount() {
        return usersCount;
    }

    public void setUsersCount(int usersCount) {
        this.usersCount = usersCount;
    }

    @Override
    public Byn getPrice() {
        return totalCost.mul((1.0 / usersCount), RoundMethod.CEIL, 0);
    }

    @Override
    public String toString() {
        return String.format("%s;%s;%d", name, totalCost, usersCount);
    }
}