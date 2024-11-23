package models;

public class Bill {
    private int id;
    private int totalAmount;

    public Bill() {
    }

    public Bill(int id, int totalAmount) {
        this.id = id;
        this.totalAmount = totalAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", totalAmount=" + totalAmount +
                '}';
    }
}