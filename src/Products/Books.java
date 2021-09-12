package Products;

public class Books extends ReadableProducts{

    public Books(String author, String subject, String name, int pagesNumber, long price) {
        super(author, subject, name, pagesNumber, price);
        ProductsList.addBook(this);
    }
}
