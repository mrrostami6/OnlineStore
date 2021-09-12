package Store;

import Customer.Customer;
import java.util.Scanner;

public class ConsoleScanner {
    private static final Scanner scan = new Scanner(System.in);

    public static Object consoleBeforeLogin(){
        Printer printer = new Printer();
        int order = scan.nextInt();

        if (order == 1)
            return printer.login();
        else if (order == 2)
            return printer.register();
        else if (order == 3)
            return 0;
        else {
            System.out.println("Please Enter A Valid Number");
            return -2;
        }
    }

    public static boolean consoleAfterLogin(Customer customer){
        int order = scan.nextInt();
        Printer printer = new Printer();

        switch (order){
            case 1:
                Menu.printProductMenu();
                int order1 = scan.nextInt();
                printer.showProducts(order1);
                return true;
            case  2:
                printer.showCart(customer);
                return true;
            case 3:
                System.out.println(customer.getCustomerInf());
                return true;
            case 4:
                printer.addProduct(customer);
                return true;
            case 5:
                printer.deleteProductFromCard(customer);
                return true;
            case 6:
                System.out.println("Total Price Of Your cart Is : " + customer.finalizeCart());
                return true;
            case 7:
                return false;
            default:
                System.out.println("Please Enter A Valid Number");
                return true;
        }
    }
}
