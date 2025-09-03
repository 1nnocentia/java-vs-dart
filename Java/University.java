import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Person> members = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addMember(Person member) {
        members.add(member);
    }

    public void displayMembers() {
        System.out.println("Members of " + name + ":");
        for (Person member : members) {
            member.role();
        }
    }
}