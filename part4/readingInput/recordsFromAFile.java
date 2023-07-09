package part4.readingInput;

import java.util.Scanner;
import java.nio.file.Paths;

public class recordsFromAFile {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter the name of the file: ");

    String fileName = reader.nextLine();

    try(Scanner scanner = new Scanner(Paths.get(fileName))) {

      while(scanner.hasNextLine()) {
        String line = scanner.nextLine();

        String[] parts = line.split(",");
        String name = parts[0];
        int age = Integer.valueOf(parts[1]);

        System.out.println(name + ", age :" + age + " years.");
      }
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
