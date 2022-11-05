import Animals.Mammals.Herbivorous.Herbivorous;

public class Main {
    public static void main(String[] args) {
        Herbivorous gazel = new Herbivorous("Gazel",15,"Savanna",142,"Tree") {
            @Override
            public void graze() {

            }
        };
        System.out.println(gazel);
    }

}