package com.company;

public abstract class Ladder extends Floor{
    protected int climbUpBy;
    abstract void climb(Player player, Floor[] floors);
    abstract int getLocation();
}
