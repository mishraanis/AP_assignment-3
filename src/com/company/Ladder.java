package com.company;

public abstract class Ladder extends Floor{
    int climbUpBy;
    abstract void climb(Player player, Floor[] floors);
    abstract int getLocation();
}
