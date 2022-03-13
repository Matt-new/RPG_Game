package com.isep.rpg;

abstract class Enemy {
    private int lifePoints;
    private String name;

    public Enemy(int lifePoints, String name){
        this.lifePoints=lifePoints;
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

}
