package task3;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> animals = new ArrayList<Animal>();

    public String makeAllSounds(){
        String allSounds = "";
        for(Animal currentAnimal: animals){
            allSounds += currentAnimal.makeSound();
        }
        return allSounds;

    }
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public String printNumberOfLegs(){
        int numberOfLegs = 0;
        for(Animal currentAnimal: animals){
            numberOfLegs += currentAnimal.getNumberOfLegs();

        }
        return ("Total numbers of legs in my zoo: " + numberOfLegs);
    }

}
