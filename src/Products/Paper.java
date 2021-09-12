package Products;

public class Paper extends ReadableProducts {
    public Paper(String author, String subject, String name, int pagesNumber, long price) {
        super(author, subject, name, pagesNumber, price);
        ProductsList.addPaper(this);
    }
}
