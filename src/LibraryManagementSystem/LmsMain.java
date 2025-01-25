/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementSystem;

/**
 *
 * @author kanav
 */
public class LmsMain {
    

    public static void main(String[] args) {
        LibraryManagement libraryManagement = new LibraryManagement();

        // Creating users
        Librarian librarian = new Librarian(1);
        Member reader = new Member(2);
//String name, String barcode, String publication, Category category)
        // Adding books to the library by librarian
        Book book1 = new Book("java", "1234567890", "Scribner", Category.sci);
        Book book2 = new Book("1984", "0987654321", "Secker & Warburg", Category.history);

        libraryManagement.addBook(librarian, book1, 1);
        libraryManagement.addBook(librarian, book2, 2);

        // Trying to add a book by reader (should fail)
        libraryManagement.addBook(reader, book1, 1);

        // Borrowing a book by reader
        libraryManagement.borrowBook(reader, "1234567890");

        // Trying to borrow the same book again (should fail)
        libraryManagement.borrowBook(reader, "1234567890");

        // Returning a book by reader
        libraryManagement.returnBook(reader, "1234567890");

        // Trying to return a book that was not borrowed (should fail)
        libraryManagement.returnBook(reader, "0987654321");

        // Trying to borrow a book by librarian (should fail)
        libraryManagement.borrowBook(librarian, "0987654321");

        // Displaying all books
        libraryManagement.displayAllBooks();
    }
}
