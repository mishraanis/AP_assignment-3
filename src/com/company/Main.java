package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the player name and hit enter");
        String name = sc.nextLine();
        Game game = new Game(name);
        game.StartPlay(sc);
    }
}
