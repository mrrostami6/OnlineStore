package Products;

import java.util.ArrayList;

public class ProductsList {

    private static final ArrayList<Shoe> shoeList = new ArrayList<>();
    private static final ArrayList<Books> bookList = new ArrayList<>();
    private static final ArrayList<Paper> paperList = new ArrayList<>();
    private static final ArrayList<Tv> tvList = new ArrayList<>();
    private static final ArrayList<Radio> radioList = new ArrayList<>();

    public static void addShoe(Shoe shoe){
        shoeList.add(shoe);
    }

    public static void addBook(Books book){
        bookList.add(book);
    }

    public static void addPaper(Paper paper){
        paperList.add(paper);
    }

    public static ArrayList<Books> getBookList() {
        return bookList;
    }

    public static ArrayList<Paper> getPaperList() {
        return paperList;
    }

    public static ArrayList<Shoe> getShoeList() {
        return shoeList;
    }

    public static void addTv(Tv tv){
        tvList.add(tv);
    }

    public static void addRadio(Radio radio){
        radioList.add(radio);
    }

    public static ArrayList<Tv> getTvList() {
        return tvList;
    }

    public static ArrayList<Radio> getRadioList() {
        return radioList;
    }
}
