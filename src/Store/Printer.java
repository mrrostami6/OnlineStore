package Store;

import Customer.*;
import Products.*;

import java.util.Scanner;

public class Printer {
    Scanner scan = new Scanner(System.in);

    public Object login(){
        System.out.println("Please Enter Your User Name : ");
        String userName = scan.next();
        System.out.println("Please enter your password : ");
        String passWord = scan.next();
        Login userLog = new Login(userName, passWord);

        for (Customer customer : Customer.getCustomers()) {
            if (customer.getLoginInf().equals(userLog))
                return customer;
        }
        System.out.println("Password or username is Wrong...");
        return -1;
    }

    public Customer register(){
        System.out.println("Please Enter Your First Name : ");
        String firstName = scan.next();
        System.out.println("Please Enter your Last Name : ");
        String lastname = scan.next();
        System.out.println("Please Enter Your Phone number : ");
        String phoneNumber = scan.next();
        System.out.println("Please Enter Your Email : ");
        String email = scan.next();
        System.out.println("Please Enter User Name : ");
        String userName = scan.next();
        System.out.println("Please Enter Password : ");
        String passWord = scan.next();
        Customer customer = new Customer(firstName, lastname, email, phoneNumber,userName, passWord);
        System.out.println("Do You Want to set You Home Address ? y/n");
        String home = scan.next();
        if (home.equals("y")){
            customer.getCustomerInf().setHomeAddress(getHomeInf());
        }
        System.out.println("Your Account Created ...");
        return customer;
    }

    public HomeAddress getHomeInf(){
        System.out.println("Please Enter Your Country Name : ");
        String country = scan.next();
        System.out.println("Please Enter Your State Name : ");
        String state = scan.next();
        System.out.println("Please Enter your Street Name : ");
        String street = scan.next();
        System.out.println("Please Enter Your Zip Code : ");
        String zip = scan.next();
        return new HomeAddress(country, state, street, zip);
    }

    public void showProducts(int order){
        int counter = 1;
        if (order == 1){
            for (Shoe shoe : ProductsList.getShoeList()) {
                System.out.println(counter + " --> " + shoe);
                counter++;
            }
        }
        else if (order == 2){
            for (Tv tv: ProductsList.getTvList()) {
                System.out.println(counter + " --> " + tv);
                counter++;
            }
        }
        else if (order == 3) {
            for (Radio radio : ProductsList.getRadioList()) {
                System.out.println(counter + " --> " + radio);
                counter++;
            }
        }
        else if (order == 4){
            for (Books book: ProductsList.getBookList()) {
                System.out.println(counter + " --> " + book);
            }
        }
        else if (order == 5){
            for (Paper paper:ProductsList.getPaperList()) {
                System.out.println(counter + " --> " + paper);
            }
        }
        else
            System.out.println("Please Enter a Valid Number...");
    }

    public void showCart(Customer customer){
        int counter = 1;
        for (Object product : customer.getCart().getProducts()) {
            System.out.println(counter + " --> " + product);
            counter++;
        }
    }

    public void addProduct(Customer customer){
        Menu.printProductMenu();
        int order = scan.nextInt();
        showProducts(order);
        System.out.println("Please Enter Product number : ");
        int productNumber = scan.nextInt();
        boolean isAdd = true;

        try {
            switch (order) {
                case 1:
                    customer.getCart().addProduct(ProductsList.getShoeList().get(productNumber - 1));
                    break;
                case 2:
                    customer.getCart().addProduct(ProductsList.getTvList().get(productNumber - 1));
                    break;
                case 3:
                    customer.getCart().addProduct(ProductsList.getRadioList().get(productNumber - 1));
                    break;
                case 4:
                    customer.getCart().addProduct(ProductsList.getBookList().get(productNumber - 1));
                    break;
                case 5:
                    customer.getCart().addProduct(ProductsList.getPaperList().get(productNumber - 1));
                    break;
                default:
                    isAdd = false;
                    System.out.println("Please Enter A Valid Number");
            }
            if (isAdd)
                System.out.println("Successful Add ...");
        }
        catch (Exception e){
            System.out.println("Error : The Number Of Product Is Wrong Try Again...");
        }

    }

    public void deleteProductFromCard(Customer customer) {
        System.out.println("Products Of your Cart : \n\n");
        showCart(customer);
        System.out.println("Please Enter The Product Number You Want To Delete : ");
        int productNumber = scan.nextInt();
        customer.getCart().deleteProduct(productNumber - 1);
    }

}
