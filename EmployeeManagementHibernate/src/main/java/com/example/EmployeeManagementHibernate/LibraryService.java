package com.example.EmployeeManagementHibernate;




import java.util.List;

public class LibraryService {
    private LibraryDAO dao = new LibraryDAO();

    public void addBook(int id, String title, String author) {
        Book book = new Book(id, title, author, true);
        dao.addBook(book);
    }

    public List<Book> viewBooks() {
        return dao.getAllBooks();
    }

    public void issueBook(int id) {
        Book book = dao.findBookById(id);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Book issued: " + book);
        } else {
            System.out.println("Book not available or not found!");
        }
    }

    public void returnBook(int id) {
        Book book = dao.findBookById(id);
        if (book != null && !book.isAvailable()) {
            book.setAvailable(true);
            System.out.println("Book returned: " + book);
        } else {
            System.out.println("Invalid return operation!");
        }
    }
}
