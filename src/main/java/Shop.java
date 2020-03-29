import java.util.ArrayList;

public class Shop {
    DrumSticks drumSticks;
    Guitar leadGuitar;
    Guitar bassGuitar;
    GuitarStrings guitarStrings;
    Piano piano;
    ArrayList<String> stock;

//    public Shop(DrumSticks drumSticks, Guitar leadGuitar, Guitar bassGuitar, GuitarStrings guitarStrings, Piano piano, String stock){
    public Shop(ArrayList<String> stock){
//        this.drumSticks = drumSticks;
//        this.leadGuitar = leadGuitar;
//        this.bassGuitar = bassGuitar;
//        this.guitarStrings = guitarStrings;
//        this.piano = piano;
        this.stock = stock;

    }

    public void addToStock(String product, int count){
        for (int i = 0; i < count; i++){
           stock.add(product);
        }

    }

    public ArrayList<String> getStock() {
        System.out.println(stock);
        return stock;
    }
}
