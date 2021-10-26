package com.company;

public class King_Cobra extends Snake{

    King_Cobra(int location)
    {
        this.location = location;
        this.point = -4;
        this.dragDownBy = 8;
    }

    @Override
    int getPoint() {
        return this.point;
    }

    @Override
    public String toString() {
        return "has reached an King Cobra Floor";
    }

    @Override
    int getLocation() {
        return location;
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
