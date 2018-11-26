public class Dog extends Animal implements Swimmable, Runnable {

    public Dog(String name, Colour black) {
        super(name);
    }

    public Dog() {
        super();
    }

    @Override
    public void swim() {
        System.out.println("dog swim");
    }

    @Override
    public void run() {
        System.out.println("Dog runs");
    }

    @Override
    public void runfast() {

    }

}
