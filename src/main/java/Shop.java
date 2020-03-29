import java.util.ArrayList;

public class Shop {
    ArrayList<String> stock;

    public Shop(ArrayList<String> stock){
        this.stock = stock;
    }

    public void addToStock(String product, int count){
        for (int i = 0; i < count; i++){
            stock.add(product);
        }
    }

    public ArrayList<String> getStock() {
        return stock;
    }

    public void removeFromStock(String product) {
        stock.remove(product);
    }
}
