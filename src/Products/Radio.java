package Products;

public class Radio extends Product{
    private String connectivity;
    private double weight;
    private String color;


    public Radio(String name, String brand, String model, long price, String connectivity, String color, double weight) {
        super(name, brand, model, price);
        this.connectivity = connectivity;
        this.color = color;
        this.weight = weight;
        ProductsList.addRadio(this);
    }


    public String getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
