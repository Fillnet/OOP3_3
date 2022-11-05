package Animals.Bird;

import Animals.Animals;

import java.util.Objects;

public abstract class Bird extends Animals {
    private final String livingEnvironment;
    public abstract void hunting();

    public Bird(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(livingEnvironment, bird.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }
}
