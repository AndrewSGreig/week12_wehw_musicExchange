public class Guitar extends Instrument implements IPlay, ISell{
    //instance vars

    private String guitarType;
    private int strings;
    private double buyingPrice;
    private double sellingPrice;


    public Guitar(String guitarType, int strings, double buyingPrice, double sellingPrice){
        super("wood", "brown", "String");
        //constructor
        this.guitarType = guitarType;
        this.strings = strings;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    //methods
    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getGuitarType() {
        return guitarType;
    }

    public void setGuitarType(String guitarType) {
        this.guitarType = guitarType;
    }

    public int getStrings() {
        return strings;
    }

    public String play() {
        return "GUITAR!";
    }

    public double calculateMarkup() {
        return sellingPrice - buyingPrice;
    }
}
