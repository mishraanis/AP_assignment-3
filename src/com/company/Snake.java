package com.company;

public abstract class Snake extends Floor{
    private final int dragDownBy;
    public Snake(int location, int point, int dragDownBy) {
        super(location, point);
        this.dragDownBy = dragDownBy;
    }
    protected void dragDown(Player player, Floor[] floors){
        int curr_position = player.getPosition();
        player.setPosition(curr_position - this.dragDownBy);
        player.setPoints(floors[player.getPosition()], floors);
    }
    @Override
    protected void jump(Player player, Floor[] floors) {
        System.out.println("Player position Floor-" + player.getPosition());
        System.out.println(player.getName() + " " + this);
        System.out.println("Total Points " + player.getScore());
        this.dragDown(player, floors);
    }
}