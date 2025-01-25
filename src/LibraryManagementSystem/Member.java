/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementSystem;

import java.util.ArrayList;

/**
 *
 * @author kanav
 */
public class Member extends User {

    private ArrayList<Book>borrowedBooks;
    public Member(int id) {
        super(Role.reader, id);
        this.borrowedBooks= new ArrayList<>();
    }

//    public ArrayList<Book> getBorrowedBooks() {
//        return borrowedBooks;
//    }
//    public void returnBook(Book book){
//    borrowedBooks.remove(book);
//    
//    }
//    public void  borrowsBook(Book book){
//    borrowedBooks.add(book);}

    
    @Override
    String userDetails() {
        return"Member"+getId()+"";
        
    
}
}