package com.example.sping_portfolio.controllers.navodit.Book;

public class Picture extends Book{
    private String illustrator;

    public Picture(String t, String a, String i){
        super(t,a);
        illustrator = i;
    }


  /*  public String printBookInfo(){
        String info = title + ", written by " + author;
    } */
}
