package com.isep.rpg;

public class BasicEnemy extends Enemy{

    public BasicEnemy(int lifePoints, String name) {
        super(lifePoints,name);
    }
    public static void main(String[] args)
    {

        // Creating objects of bank and Employee class
        Hero hero = new Hero(7,5,6) {
        };

        Enemy enemy = new Enemy(7,"Elen"){

        };


        // Print and display name and
        // corresponding bank of employee
        System.out.println(
                enemy.getName()
                + " has "
                + hero.getHerolifePoints()
                + " life points "
        )
                ;
    }

}
