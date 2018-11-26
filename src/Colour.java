public enum Colour {
    BLACK ("Black"),
    WHITE ("White"),
    YELLOW ("yellow");

    private String colourName;
    public String toString;

    private Colour (String colourName) {
        this.colourName = colourName;
    }
    public String GetColourName() {
        return colourName;
    }

    public String getColourName() {
        return colourName;
    }
}
