package com.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by 611195959 on 19/06/2018.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Countries {
@XmlElement
    private  String name;
@XmlElement
    private int numberOfStates;
@XmlElement
    private NaturalResources naturalResources;

    public Countries() {
    }

    public Countries(String name, int numberOfStates, NaturalResources naturalResources) {
        this.name = name;
        this.numberOfStates = numberOfStates;
        this.naturalResources = naturalResources;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStates() {
        return numberOfStates;
    }

    public void setNumberOfStates(int numberOfStates) {
        this.numberOfStates = numberOfStates;
    }

    public NaturalResources getNaturalResources() {
        return naturalResources;
    }

    public void setNaturalResources(NaturalResources naturalResources) {
        this.naturalResources = naturalResources;
    }

//    public  String toString(){
//        return "Name:--"+name+"numberOfStates------->"+numberOfStates+"------->NaturalResources"+naturalResources;
//    }
}
