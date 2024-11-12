import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ZooManagementSystem {
    public static void main(String[] args) {
        ArrayList<Animal> Zoo = new ArrayList<>();
        Animal lion = new Lion("Simba, ", 5, ", Panthera leo");
        Animal elephant = new Elephant("Dumbo, ", 10, ", Loxodonta");
        Zoo.add(lion);
        Zoo.add(elephant);

        for (Animal animal : Zoo) {
            animal.makeAllAnimalSound();
        }
        for (Animal animal : Zoo) {
            animal.displayInfo();
        }
        String file = "C:\\Chool Work\\Animals.csv";
        BufferedReader reader = null;
        String line = "";

        try{
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {

                String[] Animals = line.split(",");

                for(String index : Animals){
                    System.out.printf("%-10s", index);
                }
                System.out.println();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


