import java.util.ArrayList;
import java.util.Arrays;


public class Zoo {
    public static void main(String[] args) {

        Animal lion = new Lion ("Simba", 5, "Panthera leo" );
        Animal elephant = new Elephant ("Dumbo", 10, "Loxodonta");

        System.out.println("Lion named " + lion.getName() + " says: ");
        lion.makeSound();
        System.out.println("Look there Simba is eating!");
        lion.eat();


        System.out.println("\n" + "Elephant named " + elephant.getName() + " says: ");
        elephant.makeSound();
        System.out.println("Look Dumbo is eating!");
        elephant.eat();




    }


}

