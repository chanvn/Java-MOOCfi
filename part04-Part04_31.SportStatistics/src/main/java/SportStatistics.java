
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int gamesPlayed=0;
        int wins = 0;
        int losses = 0;
        try (Scanner s = new Scanner(Paths.get(file))){
            while (s.hasNextLine()){
                String line = s.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homePts = Integer.valueOf(parts[2]);
                int awayPts = Integer.valueOf(parts[3]);
                if (team.equals(homeTeam)){
                    gamesPlayed++;
                }
                if (team.equals(awayTeam)){
                    gamesPlayed++;
                }
                if (homePts<awayPts && team.equals(homeTeam)){
                    losses++;
                }
                if (awayPts<homePts && team.equals(awayTeam)){
                    losses++;
                }
            }
        }catch (Exception e){
                    
                    }
        System.out.println("Games: "+gamesPlayed);
        System.out.println("Wins: "+(gamesPlayed-losses));
        System.out.println("Losses: "+losses);
    }
   

}
