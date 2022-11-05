package Animals.Mammals.Herbivorous;

import Animals.Mammals.Mammals;

import java.util.Objects;

public abstract class Herbivorous extends Mammals {
    private final String food;

    public Herbivorous(String name, int age, String livingEnvironment, int speed, String food) {
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

    @Override
    public void toWalk() {

    }
    public abstract void graze();

    @Override
    public String toString() {
        return "Herbivorous{" +
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
        Herbivorous that = (Herbivorous) o;
        return Objects.equals(food, that.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), food);
    }

    public String getFood() {
        return food;
    }
}
