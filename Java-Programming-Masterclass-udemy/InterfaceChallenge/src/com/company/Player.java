package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player implements  ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        Player that = this;
        return new ArrayList<String>() { {
            add(that.getName());
            add(String.valueOf(that.getHitPoints()));
            add(Integer.toString(that.getStrength()));
            add(that.getWeapon());
        }};
    }

    @Override
    public void read(List<String> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.setName(list.get(0));
        this.setHitPoints(Integer.parseInt(list.get(1)));
        this.setStrength(Integer.parseInt(list.get(2)));
        this.setWeapon(list.get(3));
    }

    @Override
    public String toString() {
        return "Player{name='" +  this.name + "', " + "hitPoints=" + this.hitPoints +
                ", " + "strength=" + this.strength + ", " + "weapon='" + this.weapon + "'}";
    }
}
