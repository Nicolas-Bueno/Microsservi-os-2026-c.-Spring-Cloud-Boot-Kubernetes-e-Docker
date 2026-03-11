package br.com.nb.model;

import java.util.Date;

public class Book {

    private Long Id;
    private String author;
    private String title;
    private Date launchDate;
    private Double price;
    private String currency;
    private String enviroment;


    public Book() {
    }

    public Book(
        Long Id, String author, String title,
        Date launchDate, Double price, String currency,
        String enviroment) {
        this.Id = Id;
        this.author = author;
        this.title = title;
        this.launchDate = launchDate;
        this.price = price;
        this.currency = currency;
        this.enviroment = enviroment;
    }

    public Long getId() {
        return this.Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getLaunchDate() {
        return this.launchDate;
    }

    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getEnviroment() {
        return this.enviroment;
    }

    public void setEnviroment(String enviroment) {
        this.enviroment = enviroment;
    }

}
