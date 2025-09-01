package StudentMaagementSystem;


public class View {
    public void displayStudent(Model student) {
        System.out.println("\n--- Student Details ---");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("University: " + student.getUniversity());
        System.out.println("-----------------------\n");
    }
}
