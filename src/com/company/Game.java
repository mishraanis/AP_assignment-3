package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Game {
    private final Floor []floors;
    private final Player player;
    private final Dice dice;
    Game(String player_name)
    {
        floors = new Floor[14];
        for(int i=0; i<14; i++)
        {
            if(i==2)
                floors[i] = new Elevator(i);
            else if(i==5)
                floors[i] = new Normal_Snake(i);
            else if(i==8)
                floors[i] = new Normal_Ladder(i);
            else if(i==11)
                floors[i] = new King_Cobra(i);
            else
                floors[i] = new Empty_Floor(i);
        }
        player = new Player(player_name);
        dice = new Dice(2);
    }
    void StartPlay(BufferedReader br) throws IOException {
        System.out.println("The game setup is ready");
        while(player.getPosition() != 13)
        {
            System.out.println("Hit enter to roll the dice");
            br.readLine();
            int die_val = dice.getValue();
            System.out.println("Dice gave " + die_val);
            if(die_val == 1)
            {
                if(player.getPosition()==-1)
                {
                    player.setPosition(0);
                }
                else
                {
                    int curr_position = player.getPosition();
                    player.setPosition(curr_position+1);
                }
                player.setPoints(floors[player.getPosition()], floors);

            }
            else if(die_val==2)
            {
                if(player.getPosition()==-1)
                {
                    System.out.println("Game cannot start until you get 1");
                }
                else if(player.getPosition() == 12)
                {
                    System.out.println("Player cannot move");
                }
                else
                {
                    int curr_position = player.getPosition();
                    player.setPosition(curr_position+2);
                    player.setPoints(floors[player.getPosition()], floors);
                }
            }
        }
        System.out.println("Game Over");
        System.out.println(player.getName() + " accumulated " + player.getScore() + " points");
        BufferedWriter gameData = new BufferedWriter(new FileWriter("Game_Records.txt", true));
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date date = new Date();
        gameData.write(player.getName() + "\t" + player.getScore() + "\t" + formatter.format(date));
        gameData.newLine();
        gameData.close();
    }
}
