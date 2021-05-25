
public class Person {

    private String name;
    private Pet pet;

    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public Person(String name) {
        this(name, new Pet("Toothless", "dragon"));
    }

    public Person() {
        this("Lilo", new Pet("Stitch", "blue alien"));
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name+ "has pet breed "+pet.getBreed()+" named "+pet.getName();
    }

}
