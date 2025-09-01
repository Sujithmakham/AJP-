package StudentMaagementSystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Student Management System ===");

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter University Name: ");
        String university = sc.nextLine();

        // Create MVC components
        Model student = new Model(id, name, university);
        View view = new View();
        Controller controller = new Controller(student, view);

        // Display student details
        controller.updateView();

        // Example: Update student info
        System.out.println("Update student info:");
        System.out.print("Enter new name: ");
        String newName = sc.nextLine();
        controller.setStudentName(newName);

        System.out.print("Enter new university: ");
        String newUniversity = sc.nextLine();
        controller.setStudentUniversity(newUniversity);

        // Display updated details
        controller.updateView();

        sc.close();
    }
}
