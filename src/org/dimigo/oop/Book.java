package org.dimigo.oop;

public class Book {
    // 필드 선언
    private String title;
    private String author = "채사장";
    private int page = 350;

    //기본 생성자
    public Book() {
        System.out.println("기본 생성자 호출");
    }

    // 생성자 추가

    // 생성자 chaining

    public Book(String title) {
        this(title, "작자미상");
    }

    public Book(String title, String author) {
        this(title, author, 0);
    }

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }


    // 메소드 선언
    /*public String getTitle(){
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPage() {
        return page;
    }

    // Setter
    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPage(int page) {
        this.page = page;
    }*/

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

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }


    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", page=" + page +
                '}';
    }
}