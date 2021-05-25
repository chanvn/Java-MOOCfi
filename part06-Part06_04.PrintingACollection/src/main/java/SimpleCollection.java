
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        String numElements = String.valueOf(this.elements.size());
        String listOfElements = "";
        for (String element : elements){
            listOfElements+=element+"\n";
        }
        if (elements.isEmpty()){
            return "The collection "+name+" is empty.";
        }
        
        if (elements.size() == 1){
            return "The collection "+name+" has "+numElements+" element:\n"
                +elements.get(0);
        }
        return "The collection "+name+" has "+numElements+" elements:\n"
                +listOfElements;
    }
    
}
