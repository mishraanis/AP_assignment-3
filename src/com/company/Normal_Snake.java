package com.company;

public class Normal_Snake extends Snake{
    Normal_Snake(int location){
        super(location, -2, 4);
    }
    @Override
    public String toString() {
        return "has reached a Normal Snake Floor";
    }
}
