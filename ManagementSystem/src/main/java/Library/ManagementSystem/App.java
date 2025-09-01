package Library.ManagementSystem;



public class App {
    public static void main(String[] args) {
        LibraryDAO dao = new LibraryDAO();

        // Sample inserts
        Book b1 = new Book(14, "dedeep ", "vtghnjklbghjk", "Programminglang");
        dao.addBook(b1);
      

        Student s1 = new Student(45, "nani", "navi@gmail.com.com");
        
        dao.addStudent(s1);

        System.out.println("✅ Records inserted successfully!");
    }
}
