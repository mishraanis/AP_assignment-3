package com.company;

public abstract class Floor{
    protected int location, point;
    abstract int getPoint();
    abstract void jump(Player player, Floor[] floors);
}
