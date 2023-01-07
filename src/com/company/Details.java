package com.company;

public class Details {
    int ID;
    String Genre;
    int payRate;
    WorkDetails array[] = new WorkDetails[3];

    public int getID() {
        return ID;
    }

    public String getGenre() {
        return Genre;
    }

    public int getPayRate() {
        return payRate;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }

    public Details(int ID, String genre, int payRate, WorkDetails[] array) {
        this.ID = ID;
        Genre = genre;
        this.payRate = payRate;
        this.array = array;
    }
}
