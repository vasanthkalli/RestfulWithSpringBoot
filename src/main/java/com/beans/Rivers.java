package com.beans;

/**
 * Created by 611195959 on 19/06/2018.
 */
public class Rivers {
    String name;
    String startsAt;
    String endsAt;

    public Rivers() {
    }

    public Rivers(String name, String startsAt, String endsAt) {
        this.name = name;
        this.startsAt = startsAt;
        this.endsAt = endsAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartsAt() {
        return startsAt;
    }

    public void setStartsAt(String startsAt) {
        this.startsAt = startsAt;
    }

    public String getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(String endsAt) {
        this.endsAt = endsAt;
    }

    public String toString(){

        return "Name-->"+name+"---startsAt----"+startsAt+"---endsAt"+endsAt;
    }
}
