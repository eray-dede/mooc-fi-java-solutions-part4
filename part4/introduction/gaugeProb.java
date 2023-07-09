package part4.introduction;

public class gaugeProb {

  public static void main(String[] args) {
    Gauge g = new Gauge();

    while(!g.full()) {
      System.out.println("Not full! Value: " + g.value());
      g.increase();
    }

    System.out.println("Full! Value: " + g.value());
    g.decrease();
    System.out.println("Not full! Value: " + g.value());
  }

}
