package com.example.newsapp;

import java.util.ArrayList;

public class Findarrayarticalfromapinews {
    //create list

    private String status;
    private String totalresult;
    private ArrayList<ModelClass> articles;

    public Findarrayarticalfromapinews(String status, String totalresult, ArrayList<ModelClass> articles) {
        this.status = status;
        this.totalresult = totalresult;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalresult() {
        return totalresult;
    }

    public void setTotalresult(String totalresult) {
        this.totalresult = totalresult;
    }

    public ArrayList<ModelClass> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<ModelClass> articles) {
        this.articles = articles;
    }
}
