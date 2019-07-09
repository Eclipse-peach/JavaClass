package org.dimigo.oop;

public class BookTest {
    public static void main(String[] args) {
        Book book =  new Book();
        Book book2;
        book2 = new Book("마닳");

        System.out.println(book);
        System.out.println(book2);


        book.setTitle("인생이란 무엇인가");
        book.setAuthor("이호성");
        book.setPage(10000);

        System.out.println(book.getTitle());
        System.out.println(book.getPage());
        System.out.println(book.getAuthor());

        System.out.println(book2.getTitle());
        System.out.println(book2.getPage());
        System.out.println(book2.getAuthor());


    }
}
