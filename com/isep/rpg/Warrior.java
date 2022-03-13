package com.isep.rpg;

public class Warrior extends Hero{
    public Warrior(int lifePoints, int armor, int weaponDamage) {
        super(lifePoints, armor, weaponDamage);
    }

    public static void main(String[] args)
    {

        // Creating objects of bank and Employee class
        Hero hero = new Hero(7,5,6) {
        };
        Food food = new Food("Cheese");


        // Print and display name and
        // corresponding bank of employee
        System.out.println(food.getFood()
                + " is good "
                + hero.getHerolifePoints()
                + " life points ");
    }
}
