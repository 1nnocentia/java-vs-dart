import 'inheritance.dart' as inh;
import 'class.dart' as cls;

void main() {
  // Object
  inh.Student s1 = inh.Student("Inno", 2024, "IMT", "1234567890123");
  s1.introduce();

  inh.Lecturer l1 = inh.Lecturer("Discord", 2020, "IMT", "654321");
  l1.introduce();

  print("================================");

  cls.University univ = cls.University("Ciputra");
  univ.addMember(s1);
  univ.addMember(l1);
  univ.showAllMembers();
}