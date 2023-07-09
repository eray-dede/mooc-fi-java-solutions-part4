package part4.readingInput;

import java.util.Scanner;
import java.nio.file.Paths;

public class printingASpecifiedFile {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String fileName=reader.nextLine();

    try(Scanner scanner = new Scanner(Paths.get(fileName))) {
      while(scanner.hasNextLine()) {
        String row = scanner.nextLine();

        System.out.println(row);
      }
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}

