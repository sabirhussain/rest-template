package jp.co.rakuten.mcpd.utils.model;

import java.util.UUID;

public class Order {
    private UUID id;
    private int price;
    private String sku;

    public UUID getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getSku() {
        return sku;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    @Override
    public String toString() {
        return "[id: " + id + ", price: " + price + ", sku: " + sku + "]";
    }
}
