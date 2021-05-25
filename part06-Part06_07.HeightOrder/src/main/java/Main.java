
public class Main {

    public static void main(String[] args) {
        // Test your class here
        Room room = new Room();
        
        room.add(new Person("Lea",193));
        room.add(new Person("Nina",154));
        
        System.out.println("");
        System.out.println("Shortest: "+room.take());
        
        for (Person p : room.getPersons()){
            System.out.println(p);
        }
    }
}
