public class Piano extends Instrument implements IPlay, ISell{
    private String pianoType;
    private String keyboardType;
    private Double buyingPrice;
    private Double sellingPrice;


    public Piano(String pianoType, String keyboardType, Double buyingPrice, Double sellingPrice) {
        super("piano", "wood", "brown", "keyboard");
        this.pianoType = pianoType;
        this.keyboardType = keyboardType;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getPianoType() {
        return pianoType;
    }

    public void setPianoType(String type) {
        this.pianoType = type;
    }

    public String getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(String keyType) {
        this.keyboardType = keyType;
    }

    public String play() {
        return "PIANO!";
    }

    public double calculateMarkup() {
        return this.sellingPrice - this.buyingPrice;
    }
}
