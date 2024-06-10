package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Book {
    @Id
    private String isdn;

    @NotNull
    private String title;

    public Book() {
    }

    public Book(String title, String isdn) {
        this.title = title;
        this.isdn = isdn;
    }

    public String getIsdn() {
        return isdn;
    }

    public void setIsdn(String isdn) {
        this.isdn = isdn;
    }

    public @NotNull String getTitle() {
        return title;
    }

    public void setTitle(@NotNull String title) {
        this.title = title;
    }
}
