package part4.introduction;

public class Debt {

  private double balance;
  private double interestRate;

  public Debt(double initialBalance, double initialInterestRate) {
    this.balance=initialBalance;
    this.interestRate=initialInterestRate;
  }

  public void printBalance() {
    System.out.println(this.balance + " is your balance");
  }

  public void waitOneYear() {
    this.balance=this.balance*this.interestRate;
    System.out.println("If you wait one year " + this.balance);
  }
}
