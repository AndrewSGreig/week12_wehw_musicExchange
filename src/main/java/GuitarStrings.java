public class GuitarStrings implements ISell {
    private Double buyingPrice;
    private Double sellingPrice;

    public GuitarStrings (Double buyingPrice, Double sellingPrice){
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public double calculateMarkup() {
        return this.sellingPrice - this.buyingPrice;
    }
}
