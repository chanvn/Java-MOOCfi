
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        
        if (!(o instanceof Book)){
            return false;
        }
        
        Book castedO = (Book)o;
        
        return this.publicationYear == castedO.publicationYear &&
               this.name.equals(castedO.name);
    }

}
