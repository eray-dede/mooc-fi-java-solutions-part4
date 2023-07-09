package part4.readingInput;

import java.util.Scanner;
import java.nio.file.Paths;

public class printingAFile {

  public static void main(String[] args) {
    try(Scanner reader = new Scanner(Paths.get("data.txt"))) {
      while(reader.hasNextLine()) {
        String row = reader.nextLine();

        System.out.println(row);
      }
    } catch(Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
