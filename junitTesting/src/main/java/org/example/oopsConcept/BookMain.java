package org.example.oopsConcept;


import java.util.ArrayList;

public class BookMain {

    public static void main(String[] args) {
     //   Book book=new Book("CSK","rahul","iui");
        Book book1 = new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630");
        Book book2 = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");
         Book.add(book1);
         Book.add(book2);
          ArrayList < Book > bookCollection = Book.getListBook();
        System.out.println("List of books:");
        for (Book book: bookCollection) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
        Book.remove(book1);
        System.out.println("\nAfter removing " + book1.getTitle() + ":");
        System.out.println("List of books:");
        for (Book book: bookCollection) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }



    }
}
