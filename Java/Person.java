abstract class Person {
  String name;
  int year;
  String department;

  public void introduce() {
    System.out.println("Hello, my name is " + name + " from " + department + " and I joined since " + year + ".");
  }

  public abstract void role();
}