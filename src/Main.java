import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Swimmable dog = new Dog();
        dog.swim();

        Animal[] zoo = new Animal[3];
        zoo[0] = new Dog();
        zoo[1] = new Jiraf();
        zoo[2] = new Cat();

        for (Animal animal : zoo) {
            if (animal instanceof Swimmable) {
                Swimmable sw = (Swimmable) animal;
                sw.swim();
            }
        }
        Animal dog1 = new Dog("Rex", Colour.BLACK);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter colour");
        String colour = sc.next();
        Colour[] allColours = Colour.values();
        Colour userColour = null;
        for (Colour colourFromArray : allColours) {
            if (colourFromArray.toString().equals(colour)) {
                userColour = colourFromArray;
                break;
            }
            if (colourFromArray.getColourName().equals(colour)) {
                userColour = colourFromArray;
                break;
            }
        }

        Colour d = getColourFromUser();
        switch (d) {
           case BLACK:
            System.out.println("вы выбрали черный");
            break;
            case WHITE:
            System.out.println("вы выбрали белый");
            break;
        }
    }

    public static Colour getColourFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose colour");
        Colour [] allColours = Colour.values();
        for (int i = 0; i<allColours.length; i++) {
            System.out.println(i + " - " + allColours[i].getColourName());
        }
        int userColour = sc.nextInt();
        Colour colour = allColours [userColour];
        return colour;
    }

    public static Swimmable createSwimmable (String className) {
        if ("dog".equals(className)) {
            return new Dog();
        }
        return new Cat();
    }

}
