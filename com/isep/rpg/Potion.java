package com.isep.rpg;

public class Potion implements Consumable{
    private String potion;

    public Potion(String potion){
        this.potion=potion;

    }
    public String getPotion(){
        return this.potion;
    }
}
