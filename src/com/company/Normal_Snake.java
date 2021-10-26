package com.company;

public class Normal_Snake extends Snake{

    Normal_Snake(int location)
    {
        this.location = location;
        this.point = -2;
        this.dragDownBy = 4;
    }

    @Override
    public String toString() {
        return "has reached a Normal Snake Floor";
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
    void dragDown(Player player, Floor[] floors) {
        int curr_position = player.getPosition();
        player.setPosition(curr_position - dragDownBy);
        player.setPoints(floors[player.getPosition()], floors);
    }

    @Override
    void jump(Player player, Floor[] floors) {
        System.out.println("Player position Floor-" + player.getPosition());
        System.out.println(player.getName() + " " + this);
        System.out.println("Total Points " + player.getScore());
        dragDown(player, floors);
    }
}
