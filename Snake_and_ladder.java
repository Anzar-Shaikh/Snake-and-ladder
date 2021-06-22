package com.bl.basic;
import java.util.Random;

class gamePlayer {
    int currentPosition = 0;
    Random rand = new Random();
    int dieRoll = rand.nextInt(6)+1;
}
public class Snake_and_ladder {
    public static void main(String[] args) {
        System.out.println("welcome to snake & ladder game");
    }
}
