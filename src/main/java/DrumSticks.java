public class DrumSticks implements ISell {
    private double buyingPrice;
    private double sellingPrice;

    public DrumSticks(double buyingPrice, double sellingPrice){
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public double calculateMarkup() {
        return this.sellingPrice - this.buyingPrice;
    }
}
