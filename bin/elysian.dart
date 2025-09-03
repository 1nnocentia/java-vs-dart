// Class and Object
class Elysian {
  String name;
  String specialisation;

  Elysian(this.name, this.specialisation);

  void displayInfo() {
    print("Name: $name");
    print("Specialisation: $specialisation");
  }
}

void main() {
  var elysian1 = Elysian("Innocentia", "Artificial Intelligence");
  elysian1.displayInfo();
}