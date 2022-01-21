package com.company;

public class Empty_Floor extends Floor{
    Empty_Floor(int location)
    {
        super(location, 1);
    }

    @Override
    public String toString() {
        return "has reached an Empty Floor";
    }

    @Override
    void jump(Player player, Floor[] floors) {
        System.out.println("Player position Floor-" + player.getPosition());
        System.out.println(player.getName() + " " + this);
        System.out.println("Total Points " + player.getScore());
    }
}
