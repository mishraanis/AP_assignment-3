package com.company;

public abstract class Snake extends Floor{
    int dragDownBy;
    abstract void dragDown(Player player, Floor[] floors);
    abstract int getLocation();
}
