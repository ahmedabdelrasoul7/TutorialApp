package com.example.TotorialApp.model;

// import javax.persistence.*; // for Spring Boot 2
import jakarta.persistence.*; // for Spring Boot 3

import java.util.Arrays;

@Entity
@Table(name = "tutorials")
public class Tutorial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean published;

    @Lob
    @Column(name = "image", columnDefinition = "LONGTEXT")
    private String imageContent;



    @Lob
    @Column(name = "pdf", columnDefinition = "LONGTEXT")
    private String pdfContent;


    public Tutorial() {

    }

    public Tutorial(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }
    public Tutorial(String title, String description, boolean published, String imageContent) {
        this.title = title;
        this.description = description;
        this.published = published;
        this.imageContent = imageContent;
    }

    public Tutorial(String title, String description, boolean published, String imageContent, String pdfContent) {
        this.title = title;
        this.description = description;
        this.published = published;
        this.imageContent = imageContent;
        this.pdfContent = pdfContent;
    }

    public String getPdfContent() {
        return pdfContent;
    }

    public void setPdfContent(String pdfContent) {
        this.pdfContent = pdfContent;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public String getImageContent() {
        return imageContent;
    }

    public void setImageContent(String imageContent) {
        this.imageContent = imageContent;
    }

    @Override
    public String toString() {
        return "Tutorial{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", published=" + published +
                ", imageContent='" + imageContent + '\'' +
                ", pdfContent='" + pdfContent + '\'' +
                '}';
    }
}