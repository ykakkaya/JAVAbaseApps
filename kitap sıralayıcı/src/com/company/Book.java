package com.company;

import java.util.Date;

public class Book {
    private String bookName;
    private int bookPage;
    private String author;
    private int publishDate;

    public Book(){

    }

    public Book(String bookName, int bookPage, String author, int publishDate) {
        this.bookName = bookName;
        this.bookPage = bookPage;
        this.author = author;
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPage() {
        return bookPage;
    }

    public void setBookPage(int bookPage) {
        this.bookPage = bookPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthour(String author) {
        this.author = author;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }


}
