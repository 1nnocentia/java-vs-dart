import 'abstract.dart' as abs;

class University {
  String name;
  List<abs.Person> members = [];

  University(this.name);

  void addMember(abs.Person person) {
    members.add(person);
  }

  void showAllMembers(){
    print("Members of $name Univerisity: ");
    for (var member in members) {
      member.role();
      print("--------------");
    }
  }
}