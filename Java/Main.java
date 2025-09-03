public class Main {
    public static void main(String[] args) {
        University university = new University("Ciputra");

        Person student = new Student("Inno ", 2024, "IMT", "1234567890123");
        student.introduce();
        Person lecturer = new Lecturer("Discord", 2020, "IMT", "654321");
        lecturer.introduce();

        System.out.println("===============================================");

        university.addMember(student);
        university.addMember(lecturer);

        university.displayMembers();
    }
}