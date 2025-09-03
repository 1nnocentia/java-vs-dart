// Class and Object
public class Elysian {
  private String name;
  private String specialisation;

  public Elysian(String name, String specialisation) {
    this.name = name;
    this.specialisation = specialisation;
  }

  public void displayInfo() {
    System.out.println("Name: " + name);
    System.out.println("Specialisation: " + specialisation);
  }

  public void sayHello() {
    System.out.println("Hello, my name is " + name + " and I specialise in " + specialisation + ".");
  }


  public static void main(String[] args) {
    Elysian elysian1 = new Elysian("Innocentia", "Artificial Intelligence");
    elysian1.displayInfo();
    elysian1.sayHello();
  }
}
