package Products;

public class ReadableProducts {
    private String author;
    private String subject;
    private String name;
    private int pagesNumber;
    private long price;

    public ReadableProducts(String author, String subject, String name, int pagesNumber, long price) {
        this.author = author;
        this.subject = subject;
        this.name = name;
        this.pagesNumber = pagesNumber;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Author : " + author +
                "\nSubject : " + subject +
                "\nName : " + name +
                "\nPagesNumber : " + pagesNumber +
                "\nPrice : " + price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
