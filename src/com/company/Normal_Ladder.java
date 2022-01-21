package com.company;

public class Normal_Ladder extends Ladder{
    Normal_Ladder(int location){
        super(location, 2, 4);
    }

    @Override
    public String toString() {
        return "has reached a Normal Ladder Floor";
    }
}
