package org.example.oopsConcept;

import java.util.ArrayList;

//attributes for title, author, and ISBN, and methods to add and remove books from a collection.
public class Book {
    private String title;
    private String author;
    private String ISBN;
 private static   ArrayList<Book> listBook=new ArrayList<Book>();

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public static   void add(Book book){
        listBook.add(book);
    }
    public  static void remove(Book book){
        listBook.remove(book);
    }
    public  static ArrayList<Book> getListBook(){
        return listBook;
    }

}
