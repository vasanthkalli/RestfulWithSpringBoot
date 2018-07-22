package com.beans;

/**
 * Created by 611195959 on 19/06/2018.
 */
public class Forests {

    String name;
    double area;

    public Forests() {
    }

    public Forests(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String toString(){

        return "Name-->"+name+"---area----"+area;
    }
}
