package com.company;

import java.util.Comparator;

class ScoreCompare implements Comparator<Object>
{
    @Override
    public int compare(Object p1, Object p2) {
        if(p1 instanceof Player_Date fp && p2 instanceof Player_Date sp){
            return sp.getPlayer().getScore() - fp.getPlayer().getScore();
        }
        else
            return -1;
    }
}
//Comparable
public class Player {
    private final String name;
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


