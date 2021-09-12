package Store;
import Products.*;

public class Store {
    public void setProducts(){
        Shoe shoe1 = new Shoe("shoe1", "Adidas", "Khafan", 125000, ShoeType.SPORT, 41, "m");
        Shoe shoe2 = new Shoe("shoe2", "Nike", "pahn", 100000, ShoeType.OFFICIAL, 48, "m");
        Shoe shoe3 = new Shoe("shoe3", "Tabriz", "deraz", 2450000, ShoeType.SPORT, 37, "f");

        Radio radio1 = new Radio("Radio1", "MaTech", "ZX12", 140000, "USB", "Red", 2);
        Radio radio2 = new Radio("Radio2", "HP", "MLK1245", 100555, "USB", "Yellow", 4);
        Radio radio3 = new Radio("Radio3", "DELL", "LOP4866", 154000, "USB", "Black", 3);

        Books book1 = new Books("Ali Mohammadi", "Tarikh", "Sasaniyan", 150, 74000);
        Books book2 = new Books("Daren Hardy", "Angizeshi", "Asar Morakab", 143, 45000);
        Books book3 = new Books("Reza Basiri", "Riyazi", "Adad Aval", 248, 145800);

        Tv tv1 = new Tv("tv1", "Samsung", "KM12", 125400000, 43, "3500*4200", "LCD");
        Tv tv2 = new Tv("tv2", "LG", "LS2364", 234560000, 52, "4100*3800", "LCD");
        Tv tv3 = new Tv("tv3", "Snowa", "MX15498", 213550000, 32, "3900*5000", "LED");

        Paper paper1 = new Paper("Kohan", "Tarikhi", "1399/08/11", 5, 15000);
        Paper paper2 = new Paper("Nasim", "Ruzane", "1400/06/19", 12, 14000);
        Paper paper3 = new Paper("Navad", "Varzeshi", "1400/06/10", 19, 12000);
    }
}
