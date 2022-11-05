package Animals.Amphibious;

import Animals.Animals;

import java.util.Objects;

public abstract class Amphibious extends Animals {
    private final String livingEnvironment;

    public Amphibious(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
    }

    @Override
    public String toString() {
        return "Amphibious{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibious that = (Amphibious) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }
}
