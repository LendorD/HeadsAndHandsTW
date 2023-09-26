package may.code;

public class Enemy extends Entity{
    public Enemy(int health, int armor, int damage) throws NullPointerException  {
        if(health > this.N || health < 0 ||  armor < M ||  armor > N || damage < M ||  damage > N){
            System.out.println("incorrect parameters\n"
                    + "health should be from 0 to " + this.N +
                    "\narmor and damage shoud be from " + this.N + " to " + this.N);
            return;
        }
        this.health = health;
        this.armor = armor;
        this.damage = damage;
    }


}
