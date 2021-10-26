package com.company;

public class Normal_Ladder extends Ladder{
    Normal_Ladder(int location)
    {
        this.location = location;
        this.point = 2;
        this.climbUpBy = 4;
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
    public String toString() {
        return "has reached a Normal Ladder Floor";
    }

    @Override
    void climb(Player player, Floor[] floors) {
        int curr_position = player.getPosition();
        player.setPosition(curr_position + climbUpBy);
        player.setPoints(floors[player.getPosition()], floors);
    }

    @Override
    void jump(Player player, Floor[] floors) {
        System.out.println("Player position Floor-" + player.getPosition());
        System.out.println(player.getName() + " " + this);
        climb(player, floors);
    }
}
