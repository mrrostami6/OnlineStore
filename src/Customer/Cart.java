package Customer;
import java.util.ArrayList;

public class Cart {
    private final ArrayList<Object> products = new ArrayList<>();

    public void addProduct(Object product){
        if (products.size() < 5)
            products.add(product);
        else
            System.out.println("You can Have Maximum 5 Product In Your Card...");
    }

    public ArrayList<Object> getProducts() {
        return products;
    }

    public void deleteProduct(int index){
        try {
            products.remove(index);
            System.out.println("Successful Delete ...");
        }
        catch (Exception e){
            System.out.println("Error : The Number Of Product Is Wrong ...");
        }
    }

}