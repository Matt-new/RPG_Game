package com.isep.rpg;

abstract class Hero {
    private int lifePoints;
    private int armor;
    private int weaponDamage;


    public Hero(int lifePoints, int armor, int weaponDamage){
        this.lifePoints = lifePoints;
        this.armor=armor;
        this.weaponDamage=weaponDamage;


    }

    public int getHerolifePoints(){
        return this.lifePoints;
    }

    public int getArmor(){ return this.armor;}

    public int getWeaponDamage(){ return this.weaponDamage;}

    public void attack() {

    }
    public void defend() {

    }
    public void useConsumable(int Consumable) {

    }


}
class associationFood {

    // Main driver mmethod
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
class associationPotion {

    // Main driver mmethod
    public static void main(String[] args)
    {

        // Creating objects of bank and Employee class
        Hero hero = new Hero(7,5,6) {
        };
        Potion potion = new Potion("Healing Potion");

        // Print and display name and
        // corresponding bank of employee
        System.out.println(potion.getPotion()
                + " and "
                + hero.getHerolifePoints()
                + " life points ");
    }
}


