package com.example.EmployeeManagementHibernate;



import java.util.*;

public class LibraryDAO {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public Book findBookById(int id) {
        return books.stream().filter(b -> b.getId() == id).findFirst().orElse(null);
    }
}

