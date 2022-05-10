package com.company;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Book book1=new Book("java",45,"Ali Kara",2009);
        Book book2=new Book("csharp",50,"mehmet al",2005);
        Book book3=new Book("html",75,"ahmet demir",2001);
        Book book4=new Book("javascript",25,"Ali Kara",2003);
        Book book5=new Book("python",60,"mehmet al",2007);
        Compare compare=new Compare();
      TreeSet<Book> bookList=new TreeSet<Book>(compare.reversed());
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        System.out.println("kitapların sayfa sayısını göre tersten sıralanması");
        for (Book item: bookList) {
            System.out.println(item.getBookName());
        }
    }
}
