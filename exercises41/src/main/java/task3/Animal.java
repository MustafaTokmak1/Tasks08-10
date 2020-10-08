package task3;

public class Animal implements AnimalSound {
    private int numberOfLegs;

    public Animal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public String makeSound() {
       return "\n Undefined animal makes no sound";


    }
}
