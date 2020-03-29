public abstract class Instrument {
    protected String name;
    protected String material;
    protected String colour;
    protected String type;

    public Instrument(String name, String material, String colour, String type) {
        this.name = name;
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
