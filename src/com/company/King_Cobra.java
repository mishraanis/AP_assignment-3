package com.company;

public class King_Cobra extends Snake{
    King_Cobra(int location){
        super(location, -4, 8);
    }

    @Override
    public String toString() {
        return "has reached an King Cobra Floor";
    }
}
