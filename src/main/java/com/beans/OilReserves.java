package com.beans;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by 611195959 on 19/06/2018.
 */
@XmlRootElement
public class OilReserves {

    String name;
    String Place;

    public OilReserves() {
    }

    public OilReserves(String name, String place) {
        this.name = name;
        Place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }

    public String toString(){

        return "Name-->"+name+"---Place----"+Place;
    }
}
