package com.company;

public class Dice {
    int num_faces;
    Dice(int num_faces)
    {
        this.num_faces = num_faces;
    }
    int getValue()
    {
        return (int)(Math.random()*(num_faces)) + 1;
    }
}
