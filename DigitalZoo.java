

abstract class Animal {
    private String name;
    private int age;
    private final String species;


    public Animal (String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;

    }

    public abstract void makeSound();
    public abstract void eat();
    public abstract void makeAllAnimalSound();
    public abstract void displayInfo();


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getSpecies() {
        return species;
    }

}

class Lion extends Animal {
    public Lion(String name, int age, String species) {
        super(name, age, species);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }

    @Override
    public void eat() {
        System.out.println("Simba eats meat!");
    }

    @Override
    public void makeAllAnimalSound() {
        System.out.println("Roar!");
    }
    public void displayInfo() {
        System.out.println("Lion Info: " + getName() + getAge() + getSpecies());
    }
}

class Elephant extends Animal {
    public Elephant(String name, int age, String species) {
        super(name, age, species);
    }

    @Override
    public void makeSound() {
        System.out.println("Trumpet!");
    }

    @Override
    public void eat() {
        System.out.println("Dumbo eats fruit!");
    }
    @Override
    public void makeAllAnimalSound() {
        System.out.println("Trumpet!");
    }
    public void displayInfo() {
        System.out.println("Elephant Info: " + getName() + getAge() + getSpecies());
    }
}

