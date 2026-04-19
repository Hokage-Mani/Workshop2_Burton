package org.example;

public class Book {

    // The Book class definition
        private int id;
        private String isbn;
        private String title;
        private boolean isCheckedOut;
        private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    private String checkedOut;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
//    public Book(int id, int isbn, String title) {
//        this.id = id;
//        this.isbn = isbn;
//        this.title = title;
//    }


    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false; //Books start as available
    }
}

