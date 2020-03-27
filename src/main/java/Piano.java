public class Piano extends Instrument implements IPlay{
    private String pianoType;
    private String keyboardType;


    public Piano(String pianoType, String keyboardType) {
        super("wood", "brown", "keyboard");

        this.pianoType = pianoType;
        this.keyboardType = keyboardType;
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
}
