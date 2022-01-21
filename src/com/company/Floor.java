package com.company;

public abstract class Floor{
    private final int location;
    private final int point;
    public Floor(int location, int point){
        this.location = location;
        this.point = point;
    }
    protected int getPoint(){
        return this.point;
    }
    protected int getLocation(){
        return this.location;
    }
    abstract void jump(Player player, Floor[] floors);
}