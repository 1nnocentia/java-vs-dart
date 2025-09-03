// abtract class
abstract class Person {
  String name;
  int since;
  String department;

  Person(this.name, this.since, this.department);

  // abstract method
  void role();

  void introduce() {
    print("Hello, my name is $name from $department and I joined since $since.");
  }
}