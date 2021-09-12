package Store;

import Customer.Customer;

public class Main {
    public static void main(String[] args) {
        Menu.printRegisterMenu();
        Object login = ConsoleScanner.consoleBeforeLogin();
        Store store = new Store();
        store.setProducts();

        while (!login.equals(0)) {
            if (login.equals(-1) || login.equals(-2)) {
                Menu.printRegisterMenu();
                login = ConsoleScanner.consoleBeforeLogin();
            } else
                break;
        }

        while (!login.equals(0)) {
            boolean condition = true;
            Customer customer = (Customer) login;
            while (condition) {
                Menu.printAfterLoginMenu();
                condition = ConsoleScanner.consoleAfterLogin(customer);
            }

            while (!login.equals(0)) {
                Menu.printRegisterMenu();
                login = ConsoleScanner.consoleBeforeLogin();
                if (!login.equals(-1) && !login.equals(-2))
                    break;
            }
        }

    }
}
