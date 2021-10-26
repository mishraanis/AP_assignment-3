package com.company;

public class Empty_Floor extends Floor{
    Empty_Floor(int location)
    {
        this.location = location;
        this.point = 1;
    }

    @Override
    public String toString() {
        return "has reached an Empty Floor";
    }

    @Override
    int getPoint() {
        return this.point;
    }

    @Override
    void jump(Player player, Floor[] floors) {
        System.out.println("Player position Floor-" + player.getPosition());
        System.out.println(player.getName() + " " + this);
        System.out.println("Total Points " + player.getScore());
    }
}
