package com.company;

public class Elevator extends Ladder{

    Elevator(int location)
    {
        this.location = location;
        this.point = 4;
        this.climbUpBy = 8;
    }

    @Override
    public String toString() {
        return "has reached a Elevator Floor";
    }

    @Override
    int getPoint() {
        return this.point;
    }

    @Override
    int getLocation() {
        return this.location;
    }

    @Override
    void climb(Player player, Floor[] floors) {
        int curr_position = player.getPosition();
        player.setPosition(curr_position + climbUpBy);
        player.setPoints(floors[player.getPosition()], floors);
    }

    @Override
    void jump(Player player, Floor[] floors) {
        System.out.println("Player position Floor-" + location);
        System.out.println(player.getName() + " " + this);
        System.out.println("Total Points " + player.getScore());
        climb(player, floors);
    }
}
