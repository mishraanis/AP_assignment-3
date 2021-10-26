package com.company;

import java.io.*;
import java.util.LinkedList;
import java.awt.Desktop;

class Player_Date{
    private final Player player;
    private final String date;
    Player_Date(Player player, String date)
    {
        this.player = player;
        this.date = date;
    }

    public Player getPlayer() {
        return player;
    }

    public String getDate() {
        return date;
    }
}

public class Main {

    public static void showScores() throws IOException
    {
        try{
            BufferedReader br = new BufferedReader(new FileReader("Game_Records.txt"));

            LinkedList<Player_Date> playerRecords = new LinkedList<>();
            String curr_player = br.readLine();

            while (curr_player != null)
            {
                    String[] playerDetail = curr_player.split("\t");
                    String name = playerDetail[0];
                    int score = Integer.parseInt(playerDetail[1]);
                    String date = playerDetail[2];
                    playerRecords.add(new Player_Date(new Player(name, score), date));
                    curr_player = br.readLine();
            }
            playerRecords.sort(new ScoreCompare());
            BufferedWriter gameDataWriter = new BufferedWriter(new FileWriter("Game_Records.txt"));
            for (Player_Date player : playerRecords)
            {
                gameDataWriter.write(player.getPlayer().getName());
                gameDataWriter.write("\t" + player.getPlayer().getScore());
                gameDataWriter.write("\t" + player.getDate());
                gameDataWriter.newLine();
            }

            br.close();
            gameDataWriter.close();
            File file = new File("Game_Records.txt");
            if(!Desktop.isDesktopSupported())
            {
                System.out.println("not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if(file.exists())
                desktop.open(file);
        }
        catch (FileNotFoundException exception) {
            System.out.println("File Not Found!");
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("""
                1. Play Game\s
                2. See Scores\s
                3. Exit""");
        System.out.print("Enter your choice: ");
        String input = br.readLine();
        while(!input.equals("3"))
        {
            switch(input)
            {
                case "1":
                    System.out.println("Enter the player name and hit enter");
                    String name = br.readLine();
                    while(name.equals(""))
                    {
                        System.out.println("Enter a Proper Name");
                        name = br.readLine();
                    }
                    Game game = new Game(name);
                    File gameFile = new File("Game_Records.txt");
                    game.StartPlay(br);
                    break;

                case "2":
                    showScores();
                    break;

                default:
                    System.out.println("Wrong Input. Please Try Again");
                    break;
            }
            System.out.println("""
                    1. Play Game\s
                    2. See Scores\s
                    3. Exit""");
            System.out.print("Enter your choice: ");
            input = br.readLine();
        }
    }
}
