package Animals.Mammals.Predators;

import Animals.Mammals.Mammals;

import java.util.Objects;

public abstract class Predator extends Mammals {
    private final String food;

    public Predator(String name, int age, String livingEnvironment, int speed, String food) {
        super(name, age, livingEnvironment, speed);
        this.food = food;
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void going() {

    }
    public abstract void hunting();


    @Override
    public void toWalk() {

    }

    @Override
    public String toString() {
        return "Predator{" +
                "food='" + food + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return Objects.equals(food, predator.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), food);
    }

    public String getFood() {
        return food;
    }
}
