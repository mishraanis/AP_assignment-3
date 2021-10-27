package com.company;

public abstract class Snake extends Floor{
    protected int dragDownBy;
    abstract void dragDown(Player player, Floor[] floors);
    abstract int getLocation();
}
