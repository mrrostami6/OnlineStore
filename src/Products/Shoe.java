package Products;

public class Shoe extends Product {
    private String color;
    private int size;
    private String gender;

    public Shoe(String name, String brand, String model, long price, ShoeType shoeType, int size, String g) {
        super(name, brand, model, price);
        ProductsList.addShoe(this);
        this.shoeType = shoeType;
        this.size = size;
        this.gender = g;
    }

    public ShoeType getShoeType() {
        return shoeType;
    }

    public void setShoeType(ShoeType shoeType) {
        this.shoeType = shoeType;
    }

    private ShoeType shoeType;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
