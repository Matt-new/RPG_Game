package com.isep.rpg;

public class Mage extends SpellCaster{
    public Mage(int lifePoints, int armor, int weaponDamage, int manaPoints) {
        super(lifePoints, armor, weaponDamage, manaPoints);
    }

    public static void main(String[] args)
    {

        // Creating objects of bank and Employee class
        Hero hero = new Hero(7,5,6) {
        };
        Food food = new Food("Cheese");

        Mage mage =new Mage(12, 1212 ,4,7);

        // Print and display name and
        // corresponding bank of employee
        System.out.println(food.getFood()
                + " is good "
                + hero.getHerolifePoints()
                + " life points "
                + mage.getManaPoints()
                + " mana points ");
    }
}
