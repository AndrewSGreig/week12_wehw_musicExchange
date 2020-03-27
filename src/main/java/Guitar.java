public class Guitar extends Instrument implements IPlay{
    //instance vars

    private String guitarType;
    private int strings;

    public Guitar(String guitarType, int strings){
        super("wood", "brown", "String");
        //constructor
        this.guitarType = guitarType;
        this.strings = strings;
    }

    //methods

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


}
