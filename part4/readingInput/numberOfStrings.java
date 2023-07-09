package part4.readingInput;

import java.util.Scanner;

public class numberOfStrings {

  public static void main(String[] args) {
    int count=0;

    Scanner reader=new Scanner(System.in);

    while(true) {

      String input= reader.nextLine();

      if(input.equals("end")) {
        break;
      }

      count++;
    }

    System.out.println(count);
  }
}
