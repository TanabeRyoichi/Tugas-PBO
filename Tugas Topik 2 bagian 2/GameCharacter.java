package com.company;

public class GameCharacter {
    private String name;
    private int lifePoint;
    private int attackHitPoint;
    private int attackKickPoint;

    public  GameCharacter(String name,int attackHitPoint,int attackKickPoint) {
        this.name = name;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }
    public String getName(){
        return  name;
    }
    public int getLifePoint(){
        return  lifePoint;
    }
    public void setLifePoint(int lifePoint){
        this.lifePoint = lifePoint;
    }

    public void hit (GameCharacter KarB){
        KarB.lifePoint -= this.attackHitPoint;
    }
    public void kick (GameCharacter KarB){
        KarB.lifePoint -= this.attackKickPoint;
    }

}