package Animals.Bird.Flightless;

import Animals.Animals;
import Animals.Bird.Bird;

import java.util.Objects;

public abstract class Flightless extends Bird {
    private final String typeMovement;

    public Flightless(String name, int age, String livingEnvironment, String typeMovement) {
        super(name, age, livingEnvironment);
        this.typeMovement = typeMovement;
    }


    public abstract void going();

    @Override
    public String toString() {
        return "Flightless{" +
                "typeMovement='" + typeMovement + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(typeMovement, that.typeMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeMovement);
    }
}
