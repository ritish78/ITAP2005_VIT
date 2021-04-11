package com.company.tutorial.tutorial7;

import java.util.Date;

public class GeometricObject {
    private String color = "no color";
    private boolean filled;
    private Date createdDate;

    //No arg constructor
    public GeometricObject() {
        createdDate = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.createdDate = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public String toString() {
        if (filled) {
            return "Object created at: " + createdDate + " filled \n of Color: " + color;
        } else {
            return "Object created at: " + createdDate + "\n of Color: " + color;
        }
    }
}
