package com.example.sping_portfolio.controllers.navodit.Book;

public class Book {

    private String title;
    private String author;

    public Book(String t, String a) {
        title = t;
        author = a;
    }



    public String printBookInfo()
    {
       String info = title + ", written by " + author;

       return info;
    }
}
