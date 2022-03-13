package com.isep.rpg;

abstract class SpellCaster extends Hero{
    private int manaPoints;

    public SpellCaster(int lifePoints, int armor, int weaponDamage, int manaPoints) {
        super(lifePoints, armor, weaponDamage);
        this.manaPoints= manaPoints;
    }

    public int getManaPoints(){
        return this.manaPoints;}

}
