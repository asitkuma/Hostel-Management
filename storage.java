package storage;

import java.io.Serializable;

public class inventory implements Serializable {
    private int damaged_goods;
    private int desks;

    public int getDamaged_goods() {
        return damaged_goods;
    }

    public void setDamaged_goods(int damaged_goods) {
        this.damaged_goods = damaged_goods;
    }

    public int getDesks() {
        return desks;
    }

    public void setDesks(int desks) {
        this.desks = desks;
    }

    private int beds;
    private int sport_goods;

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getSport_goods() {
        return sport_goods;
    }

    public void setSport_goods(int sport_goods) {
        this.sport_goods = sport_goods;
    }
}