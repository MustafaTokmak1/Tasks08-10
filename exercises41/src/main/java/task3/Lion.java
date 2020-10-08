package task3;

public class Lion extends Animal {
    public Lion(int numberOfLegs) {
        super(numberOfLegs);
    }

    @Override
    public String makeSound() {
        return "Lion goes RAAAWRR";
    }

}
