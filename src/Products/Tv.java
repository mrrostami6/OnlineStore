package Products;

public class Tv extends Product {
    private double size;
    private String resolution;
    private String screenTech;

    public Tv(String name, String brand, String model, long price, double size, String resolution, String screenTech) {
        super(name, brand, model, price);
        this.size = size;
        this.resolution = resolution;
        this.screenTech = screenTech;
        ProductsList.addTv(this);
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getScreenTech() {
        return screenTech;
    }

    public void setScreenTech(String screenTech) {
        this.screenTech = screenTech;
    }
}
