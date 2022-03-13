package com.isep.rpg;

public class Hunter extends Hero{
    private int arrows;


    public Hunter(int lifePoints, int armor, int weaponDamage, int arrows) {
        super(lifePoints, armor, weaponDamage);
        this.arrows=arrows;
    }

    public int getArrows(){ return this.arrows;

    }
    public static void main(String[] args)
    {

        // Creating objects of bank and Employee class
        Hero hero = new Hero(7,5,6) {
        };
        Food food = new Food("Cheese");

        Hunter hunter =new Hunter(12, 1212 ,4 ,7);

        // Print and display name and
        // corresponding bank of employee
        System.out.println(food.getFood()
                + " is good "
                + hero.getHerolifePoints()
                + " life points "
                + hunter.getArrows()
                + " arrows left ");
    }


}
