package part4.introduction;

public class main {

  public static void main(String[] args) {
    Person ada = new Person("Ada");
    Person antti = new Person("Antti");
    Person martin = new Person("Martin");
    Person pekka = new Person("Pekka");

    ada.printPerson();
    antti.printPerson();
    martin.printPerson();

    ada.growOlder();
    antti.growOlder();

    ada.printPerson();

    int combined = antti.returnAge() + ada.returnAge();

    System.out.println("Combined age of ada and antti: " + combined);


    if (antti.isOfLegalAge()) {
      System.out.println(antti.getName() + " is of legal age");
    } else {
      System.out.println(antti.getName() + " is underage");
    }

    if (pekka.isOfLegalAge()) {
      System.out.println(pekka.getName() + " is of legal age");
    } else {
      System.out.println(pekka.getName() + " is underage ");
    }

    System.out.println(antti);
    System.out.println(pekka);

    Person matti = new Person("Matti");
    Person juhana = new Person("Juhana");

    matti.setHeight(180);
    matti.setWeight(86);

    juhana.setHeight(175);
    juhana.setWeight(64);

    System.out.println(matti.getName() + ", body mass index is " + matti.bodyMassIndex());
    System.out.println(juhana.getName() + ", body mass index is " + juhana.bodyMassIndex());
  }
}
