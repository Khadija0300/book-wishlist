package com.example.bookwishlist.model;

public class WishlistBook {
    private Long id;
    private String title;
    private String author;
    private String genre;
    private String priority;
    private boolean purchased;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public boolean isPurchased() {
        return purchased;
    }

    public void setPurchased(boolean purchased) {
        this.purchased = purchased;
    }

    public WishlistBook(Long id, String title, String author, String genre, String priority, boolean purchased) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.priority = priority;
        this.purchased = purchased;
    }
}
