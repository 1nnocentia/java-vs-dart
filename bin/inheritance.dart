//  Inheritance
import 'abstract.dart' as abs;

class Student extends abs.Person {
  // Encapsulation
  // _ means private
  String _nim;

  Student(String name, int since, String department, String nim) : 
    _nim = nim, super(name, since, department);

  // Getter
  String get nim => _nim; // => for function expression

  // Setter
  set nim(String nim) {
    if (nim.length == 13 && nim.isNotEmpty) {
      _nim = nim;
    }
  }

  // Polymorphism
  @override
  void role() {
    print("Student name : $name.\nNIM : $_nim\nDepartment : $department\nSince : $since");
  }
}

class Lecturer extends abs.Person {
  String _nip;

  Lecturer(String name, int since, String department, String nip) : 
    _nip = nip, super(name, since, department);

  String get nip => _nip;

  set nip(String nip) {
    if (nip.length == 6 && nip.isNotEmpty) {
      _nip = nip;
    }
  }

  @override
  void role() {
    print("Lecturer name : $name.\nNIP : $_nip\nDepartment : $department\nSince : $since");
  }
}