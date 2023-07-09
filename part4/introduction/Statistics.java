package part4.introduction;

public class Statistics {
  private int count;
  private int sum;

  public Statistics() {
    this.count=0;
    this.sum=0;
  }

  public void addNumber(int number) {

    this.sum=this.sum+number;
    this.count=this.count + 1;
  }

  public int getCount() {
    return this.count;
  }

  public int sum() {
    return this.sum;
  }

  public double average() {
    return this.sum*1.0/this.count;
  }
}
