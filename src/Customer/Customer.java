package Customer;
import Products.*;

import java.util.ArrayList;
import java.util.Objects;

public class Customer {
    private final CustomerInf customerInf;
    private Login loginInf;
    private static final ArrayList<Customer> customers = new ArrayList<>();
    private Cart cart;

    public Customer(String firstName, String lastName, String email, String phoneNumber, String userName, String password) {
        this.customerInf = new CustomerInf(firstName, lastName, email, phoneNumber );
        loginInf = new Login(userName, password);
        customers.add(this);
        cart = new Cart();
    }

    public long finalizeCart(){
        long finalPrice = 0;
        for (Object product : cart.getProducts()) {
            if (product.getClass().equals(Shoe.class)) {
                ProductsList.getShoeList().removeIf(product::equals);
                finalPrice += ((Shoe) product).getPrice();
            }
            else if (product.getClass().equals(Tv.class)) {
                ProductsList.getTvList().removeIf(product::equals);
                finalPrice += ((Tv) product).getPrice();
            }
            else if (product.getClass().equals(Books.class)) {
                ProductsList.getBookList().removeIf(product::equals);
                finalPrice += ((Books) product).getPrice();
            }
            else if (product.getClass().equals(Paper.class)) {
                ProductsList.getPaperList().removeIf(product::equals);
                finalPrice += ((Paper) product).getPrice();
            }
            else {
                ProductsList.getRadioList().removeIf(product::equals);
                finalPrice += ((Radio) product).getPrice();
            }
        }
        cart = new Cart();
        return finalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(loginInf, customer.loginInf);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerInf=" + customerInf +
                ", loginInf=" + loginInf +
                ", cart=" + cart +
                '}';
    }


    public static ArrayList<Customer> getCustomers(){
        return customers;
    }

    public Login getLoginInf() {
        return loginInf;
    }

    public void setLoginInf(Login loginInf) {
        this.loginInf = loginInf;
    }

    public CustomerInf getCustomerInf() {
        return customerInf;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
