public class Cat extends Animal implements Swimmable {

    public Cat(String name) {
        super(name);
    }

    public Cat() {

    }

    @Override
    public void swim() {
        System.out.println("cat swim");
    }
}
