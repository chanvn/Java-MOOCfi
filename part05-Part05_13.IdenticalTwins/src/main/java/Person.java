
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object comparison){
        if (this == comparison){
            return true;
        }
        
        if (!(comparison instanceof Person)){
            return false;
        }
        
        Person castedP = (Person) comparison;
        
        if (this.name.equals(castedP.name) &&
            this.height == castedP.height &&
            this.weight == castedP.weight &&
            this.birthday.equals(castedP.birthday)){
            return true;
        }
        
        return false;
    }
}
