package Store;

public class Menu {
    public static void printRegisterMenu(){
        System.out.println("Welcome To Our Store : \n" +
                "1 --> Login\n" +
                "2 --> Register\n" +
                "3 --> Exit From Site\n");
        System.out.println("Enter a Number to Continue : ");
    }

    public static void printAfterLoginMenu(){
        System.out.println("Store Guide : \n" +
                "1 --> Show Products\n" +
                "2 --> Show Cart\n" +
                "3 --> Show Personal Information\n" +
                "4 --> Add Product To Cart\n" +
                "5 --> Delete A Product From card\n" +
                "6 --> Finalize Your Cart\n" +
                "7 --> Exit");
        System.out.println("Enter a Number to Continue : ");
    }

    public static void printProductMenu(){
        System.out.println("1 --> Shoes\n" +
                "2 --> Tvs\n" +
                "3 --> Radios\n" +
                "4 --> Books\n" +
                "5 --> Paper\n");
        System.out.println("Please Enter A Number to Continue : ");
    }

}
