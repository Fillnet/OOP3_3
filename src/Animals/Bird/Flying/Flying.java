package Animals.Bird.Flying;

import Animals.Bird.Bird;

import java.util.Objects;

public abstract class Flying extends Bird {
    private final String typeMovement;
    public Flying(String name, int age, String livingEnvironment, String typeMovement) {
        super(name, age, livingEnvironment);
        this.typeMovement = typeMovement;
    }

    public abstract void flying();

    @Override
    public String toString() {
        return "Flying{" +
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
        Flying flying = (Flying) o;
        return Objects.equals(typeMovement, flying.typeMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeMovement);
    }

    public String getTypeMovement() {
        return typeMovement;
    }
}
