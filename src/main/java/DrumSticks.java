public class DrumSticks implements ISell {
    private double buyingPrice;
    private double sellingPrice;
    private String name;

    public DrumSticks( String name, double buyingPrice, double sellingPrice){
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.name = name;
    }

    public double calculateMarkup() {
        return this.sellingPrice - this.buyingPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
