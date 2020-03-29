public class GuitarStrings implements ISell {
    private String name;
    private Double buyingPrice;
    private Double sellingPrice;

    public GuitarStrings (String name, Double buyingPrice, Double sellingPrice){
        this.name = name;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public double calculateMarkup() {
        return this.sellingPrice - this.buyingPrice;
    }

    public String getName() {
        return name;
    }
}
