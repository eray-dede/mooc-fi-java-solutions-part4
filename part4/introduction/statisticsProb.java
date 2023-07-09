package part4.introduction;

import java.util.Scanner;

public class statisticsProb {

  public static void main(String[] args) {

    Statistics statistics = new Statistics();
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter numbers:");

    int oddNumbers=0;
    int evenNumbers=0;

    while(true) {
      int integer = Integer.valueOf(reader.nextLine());

      if(integer==-1) {
        break;
      }

      statistics.addNumber(integer);

      if(integer%2==1) {
        oddNumbers=oddNumbers+integer;
      } else {
        evenNumbers=evenNumbers+integer;
      }

    }
    System.out.println("Count: " + statistics.getCount());
    System.out.println("Sum: " + statistics.sum());
    System.out.println("Sum of even numbers: " + evenNumbers);
    System.out.println("Sum of odd numbers: " + oddNumbers);
    System.out.println("Average: " + statistics.average());
  }
}
