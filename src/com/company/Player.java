package com.company;

public class Player {
    private String name;
    private int position;
    private int score;

    Player(String name)
    {
        this.name = name;
        this.position = -1;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getScore() {
        return score;
    }

    public void setPoints(Floor floor, Floor[] floors) {
        this.score += floor.getPoint();
        floor.jump(this, floors);
    }
}
