package com.company;

public abstract class Ladder extends Floor{
    private final int climbUpBy;
    public Ladder(int location, int point, int climbUpBy) {
        super(location, point);
        this.climbUpBy = climbUpBy;
    }
    protected void climb(Player player, Floor[] floors){
        int curr_position = player.getPosition();
        player.setPosition(curr_position + this.climbUpBy);
        player.setPoints(floors[player.getPosition()], floors);
    }
    @Override
    protected void jump(Player player, Floor[] floors){
        System.out.println("Player position Floor-" + this.getLocation());
        System.out.println(player.getName() + " " + this);
        System.out.println("Total Points " + player.getScore());
        climb(player, floors);
    }
}
