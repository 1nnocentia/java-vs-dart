// Class and Object
class Elysian {
  String name;
  String specialisation;

  Elysian(this.name, this.specialisation);

  void displayInfo() {
    print("Name: $name");
    print("Specialisation: $specialisation");
  }

  void sayHello() {
    print("Hello, I am $name, specialized in $specialisation.");
  }
}

void main() {
  var elysian1 = Elysian("Innocentia", "Artificial Intelligence");
  elysian1.displayInfo();
  elysian1.sayHello();
}