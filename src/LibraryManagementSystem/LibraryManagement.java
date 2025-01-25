/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementSystem;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kanav
 */public class LibraryManagement {
    private BookManagement bookManagement;
    private RackManagement rackManagement;
    private Map<String, Integer> borrowedBooks; // Map to track borrowed books (barcode -> userId)

    public LibraryManagement() {
        this.bookManagement = new BookManagement();
        this.rackManagement = new RackManagement();
        this.borrowedBooks = new HashMap<>();
    }

    public void addBook(User user, Book book, int rackNumber) {
        if (user.getRole() == Role.Librarian) {
            bookManagement.addBook(book);
            rackManagement.addBookToRack(book, rackNumber);
            System.out.println("Book added by Librarian: " + user.getId());
        } else {
            System.out.println("Only librarians can add books.");
        }
    }

    public void removeBook(User user, String barcode) {
        if (user.getRole() == Role.Librarian) {
            Book book = bookManagement.getBook(barcode);
            if (book != null) {
                bookManagement.removeBook(barcode);
                rackManagement.removeBookFromRack(book);
                System.out.println("Book removed by Librarian: " + user.getId());
            } else {
                System.out.println("Book not found.");
            }
        } else {
            System.out.println("Only librarians can remove books.");
        }
    }

    public void borrowBook(User user, String barcode) {
        if (user.getRole() == Role.reader) {
            Book book = bookManagement.getBook(barcode);
            if (book != null && !borrowedBooks.containsKey(barcode)) {
                borrowedBooks.put(barcode, user.getId());
                System.out.println("Book borrowed by Reader: " + user.getId());
            } else if (borrowedBooks.containsKey(barcode)) {
                System.out.println("Book is already borrowed.");
            } else {
                System.out.println("Book not found.");
            }
        } else {
            System.out.println("Only readers can borrow books.");
        }
    }

    public void returnBook(User user, String barcode) {
        if (user.getRole() == Role.reader) {
            if (borrowedBooks.containsKey(barcode) &&
                    borrowedBooks.get(barcode) == user.getId()) {
                borrowedBooks.remove(barcode);
                System.out.println("Book returned by Reader: " + user.getId());
            } else if (!borrowedBooks.containsKey(barcode)) {
                System.out.println("Book was not borrowed.");
            } else {
                System.out.println("This book was borrowed by another reader.");
            }
        } else {
            System.out.println("Only readers can return books.");
        }
    }

    public void displayAllBooks() {
        for (Book book : bookManagement.getAllBooks().values()) {
            System.out.println(book);
        }
    }
}