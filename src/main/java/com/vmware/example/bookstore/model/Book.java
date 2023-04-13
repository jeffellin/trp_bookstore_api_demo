package com.vmware.example.bookstore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {

@Id
long id;

String title;

    public Book(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
