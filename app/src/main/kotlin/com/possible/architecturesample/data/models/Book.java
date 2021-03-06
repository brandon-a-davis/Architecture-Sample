package com.possible.architecturesample.data.models;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class Book {
    @Id(autoincrement = true)
    private Long id;

    private String title;
    private String imageUrl;
    private String author;

    @Generated(hash = 931745658)
    public Book(Long id, String title, String imageUrl, String author) {
        this.id = id;
        this.title = title;
        this.imageUrl = imageUrl;
        this.author = author;
    }

    @Generated(hash = 1839243756)
    public Book() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
