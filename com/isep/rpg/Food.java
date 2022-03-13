package com.isep.rpg;

public class Food implements Consumable {
    String Food;

    public Food(String Food){
        this.Food=Food;
    }
    public String getFood(){
        return this.Food;
    }
}
