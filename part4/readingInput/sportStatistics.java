package part4.readingInput;

import java.util.Scanner;
import java.nio.file.Paths;

public class sportStatistics {
  public static void main(String[] args) {

    int gamesPlayed=0;
    int gamesWon=0;
    int gamesLost=0;

    Scanner reader = new Scanner(System.in);

    System.out.println("File: ");
    String fileName = reader.nextLine();

    System.out.println("Team: ");
    String teamName = reader.nextLine();

    try (Scanner scanner = new Scanner(Paths.get(fileName))) {
      while(scanner.hasNextLine()) {
        String row = scanner.nextLine();

        String[] parts= row.split(",");
        String homeTeam = parts[0];
        String awayTeam = parts[1];
        int homeTeamScore = Integer.valueOf(parts[2]);
        int awayTeamScore = Integer.valueOf(parts[3]);

        if(homeTeam.equals(teamName)) {
          gamesPlayed++;
          if(homeTeamScore>awayTeamScore) {
            gamesWon++;
          } else {
            gamesLost++;
          }
        }
        if(awayTeam.equals(teamName)) {
          gamesPlayed++;
          if(homeTeamScore>awayTeamScore) {
            gamesLost++;
          } else {
            gamesWon++;
          }
        }
      }
    } catch(Exception e) {
      System.out.println("Error: " + e.getMessage());
    }

    System.out.println("The games played for your team: " + gamesPlayed);
    System.out.println("Games won:" + gamesWon);
    System.out.println("Games lost:" + gamesLost);
  }
}
