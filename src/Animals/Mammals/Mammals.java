package Animals.Mammals;

import Animals.Animals;

import java.util.Objects;

public abstract class Mammals extends Animals {
    private final String livingEnvironment;
    private final int speed;

    public Mammals(String name, int age, String livingEnvironment, int speed) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
        this.speed = speed;
    }

    public abstract void toWalk();

    @Override
    public String toString() {
        return "Mammals{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", speed=" + speed +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return speed == mammals.speed && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, speed);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getSpeed() {
        return speed;
    }
}
