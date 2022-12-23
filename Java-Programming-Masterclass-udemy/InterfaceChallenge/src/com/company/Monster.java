package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        Monster that = this;
        return new ArrayList<String>(){{
            add(that.getName());
            add(Integer.toString(that.getHitPoints()));
            add(Integer.toString(that.getStrength()));
        }};
    }

    @Override
    public void read(List<String> list) {
        if(list == null || list.size() <= 0) {
            return;
        }
        this.name = list.get(0);
        this.hitPoints = Integer.parseInt(list.get(1));
        this.strength = Integer.parseInt(list.get(2));

    }

    @Override
    public String toString() {
        return "Monster{name='" + this.name + "', " + "hitPoints=" + this.hitPoints +
                ", " + "strength=" + this.strength;
    }
}
