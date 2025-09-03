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

  public static void main(String[] args) {
    Elysian elysian1 = new Elysian("Innocentia", "Artificial Intelligence");
    elysian1.displayInfo();
  }
}
