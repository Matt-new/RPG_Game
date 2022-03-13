package com.isep.rpg;

import com.isep.utils.InputParser;

public class Game {
    private int playerTurn;
    private int InputParser;

    public Game(int playerTurn, int InputParser){
        this.playerTurn=playerTurn;
        this.InputParser=InputParser;

    }

    public int getGameplayerTurn(){
        return this.playerTurn;
    }

    public void playGame(){

    }

    public void generateCombat() {

    }
}
class associationHero {

    // Main driver mmethod
    public static void main(String[] args)
    {

        // Creating objects of bank and Employee class
        Hero hero = new Hero(12, 2, 7) {
        };
        Game game = new Game(1, 2);

        // Print and display name and
        // corresponding bank of employee
        System.out.println(game.getGameplayerTurn()
                + " player turn "
                + hero.getHerolifePoints()
                + " life points ");
    }
}
