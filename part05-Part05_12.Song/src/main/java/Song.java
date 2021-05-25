
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    public boolean equals(Object comparison){
        if (this == comparison){
            return true;
        }
        
        if (comparison instanceof Song != true){
            return false;
        }
        
        Song comparedCasted = (Song) comparison;
        
        if (this.artist.equals(comparedCasted.artist) &&
            this.name.equals(comparedCasted.name) &&
            this.durationInSeconds == comparedCasted.durationInSeconds){
        return true;
    }
        return false;
    }

}
