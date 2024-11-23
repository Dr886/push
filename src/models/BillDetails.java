package models;

public class BillDetails {
    private int id;
    private int customerId;
    private int milkTeaId;
    private int quantity;

    public BillDetails() {
    }

    public BillDetails(int id, int customerId, int milkTeaId, int quantity) {
        this.id = id;
        this.customerId = customerId;
        this.milkTeaId = milkTeaId;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getMilkTeaId() {
        return milkTeaId;
    }

    public void setMilkTeaId(int milkTeaId) {
        this.milkTeaId = milkTeaId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "BillDetails{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", milkTeaId=" + milkTeaId +
                ", quantity=" + quantity +
                '}';
    }
}