package Products;

import java.util.UUID;

public class Product {
    private String name;
    private String Brand;
    private String model;
    private UUID productId;
    private long price;

    public Product(String name, String brand, String model, long price) {
        this.name = name;
        Brand = brand;
        this.model = model;
        this.productId = UUID.randomUUID();
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name : " + name +
                "\nBrand : " + Brand +
                "\nModel : " + model +
                "\nPrice : " + price + "\n\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
