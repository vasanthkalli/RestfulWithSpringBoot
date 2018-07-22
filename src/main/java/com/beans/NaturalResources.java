package com.beans;

/**
 * Created by 611195959 on 19/06/2018.
 */
public class NaturalResources {
    private Rivers rivers;
    private Forests forests;
    private OilReserves oilReserves;

    public NaturalResources() {
    }

    public NaturalResources(Rivers rivers, Forests forests, OilReserves oilReserves) {
        this.rivers = rivers;
        this.forests = forests;
        this.oilReserves = oilReserves;
    }

    public Rivers getRivers() {
        return rivers;
    }

    public void setRivers(Rivers rivers) {
        this.rivers = rivers;
    }

    public Forests getForests() {
        return forests;
    }

    public void setForests(Forests forests) {
        this.forests = forests;
    }

    public OilReserves getOilReserves() {
        return oilReserves;
    }

    public void setOilReserves(OilReserves oilReserves) {
        this.oilReserves = oilReserves;
    }

    public String toString(){
        return "--Rivers-->"+rivers+"--Forests-->"+forests.toString()+"--Oi Reserves"+oilReserves;
    }
}
