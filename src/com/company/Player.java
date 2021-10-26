package com.company;

import java.util.Comparator;

class ScoreCompare implements Comparator<Player_Date>
{
    @Override
    public int compare(Player_Date p1, Player_Date p2) {
        return p2.getPlayer().getScore() - p1.getPlayer().getScore();
    }
}

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
    Player(String name, int score)
    {
        this.name = name;
        this.score = score;
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


