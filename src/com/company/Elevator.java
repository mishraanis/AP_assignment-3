package com.company;

public class Elevator extends Ladder{
    Elevator(int location){
        super(location, 4, 8);
    }
    @Override
    public String toString() {
        return "has reached a Elevator Floor";
    }
}
