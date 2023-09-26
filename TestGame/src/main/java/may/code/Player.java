package may.code;

import java.sql.SQLOutput;

public class Player extends Entity{
    public Player(int health, int armor, int damage) {
        if(health > this.N || health < 0 ||  armor < M ||  armor > N || damage < M ||  damage > N){
            System.out.println("incorrect parameters\n"
                    + "health should be from 0 to " + this.N +
                    "\narmor and damage shoud be from " + this.N + " to " + this.N);
            return;
        }
        this.CheckPlayer = true;
        this.health = health;
        this.armor = armor;
        this.damage = damage;
    }


}
