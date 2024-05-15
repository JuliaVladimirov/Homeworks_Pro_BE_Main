package org.example.homework_2024_02_09.task3;

public class Book {

    private String title;
    private String author;

    private int numOfPages;

    public Book(String title, String author, int numOfPages) {
        this.title = title;
        this.author = author;
        this.numOfPages = numOfPages;
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

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", Number Of Pages=" + numOfPages +
                '}';
    }
}
