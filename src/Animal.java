public abstract class Animal {

    private Colour colour;
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {

    }

    public Animal (String name, Colour colour) {
        this.name = name;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}