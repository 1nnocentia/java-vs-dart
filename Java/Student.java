public class Student extends Person {
  String nim;

  public Student(String name, int year, String department, String nim) {
    this.name = name;
    this.year = year;
    this.department = department;
    this.nim = nim;
  }

  public String getNim() {
    return nim;
  }


  @Override
  public void role() {
    System.out.println("Student name : " + name + "\nNIM : " + nim + "\nDepartment : " + department + "\nSince : " + year);
    System.out.println("------------------------");
  }
}