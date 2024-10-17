import java.util.List;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();


        Person john = new Person("John", 1950);
        Person mary = new Person("Mary", 1955);
        Person susan = new Person("Susan", 1980);
        Person mike = new Person("Mike", 1985);


        susan.setMother(mary);
        susan.setFather(john);
        john.addChild(susan);
        mary.addChild(susan);

        mike.setMother(mary);
        john.addChild(mike);
        mary.addChild(mike);


        familyTree.addPerson(john);
        familyTree.addPerson(mary);
        familyTree.addPerson(susan);
        familyTree.addPerson(mike);


        List<Person> johnsChildren = familyTree.getChildren(john);
        System.out.println("John's children:");
        for (Person child : johnsChildren) {
            System.out.println(" - " + child.getName());
        }


        List<Person> marysChildren = familyTree.getChildren(mary);
        System.out.println("Mary's children:");
        for (Person child : marysChildren) {
            System.out.println(" - " + child.getName());
        }


        Person foundPerson = familyTree.findPersonByName("Susan");
        if (foundPerson != null) {
            System.out.println("Found person: " + foundPerson.getName() + ", born in " + foundPerson.getBirthYear());
        } else {
            System.out.println("Person not found.");
        }

        Person notFoundPerson = familyTree.findPersonByName("Alice");
        if (notFoundPerson == null) {
            System.out.println("Person not found as expected.");
        }
    }
}
