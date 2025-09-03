public class Lecturer extends Person {
  String nip;

  public Lecturer(String name, int year, String department, String nip) {
    this.name = name;
    this.year = year;
    this.department = department;
    this.nip = nip;
  }

  public String getNip() {
    return nip;
  }

  @Override
  public void role() {
    System.out.println("Lecturer name : " + name + ".\nNIP : " + nip + "\nDepartment : " + department + "\nSince : " + year);
  }
}