package com.company;

import java.util.Comparator;

public class Compare implements Comparator<Book> {
    public Compare() {
    }

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getBookPage()- o2.getBookPage();
    }

}
