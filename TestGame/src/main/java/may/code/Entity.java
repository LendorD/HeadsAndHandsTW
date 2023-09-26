package may.code;

public abstract class Entity {
    Integer N = 100; //MAX_HEALTH
    Integer M = 10; //MIN_DAMAGE
    Integer damage=1;
    Integer armor=1;
    Integer health=1;
    Integer numberOfHealings = 0;
    Boolean CheckPlayer = false;

    public void checkHealth(){
        if(health<=0){
            System.out.println("Entity is die");
        }
    }

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public void hit(Entity ent2){
        int numberThrows = hitModificator(this.damage, ent2.armor); //количество бросков кубика
        int countThrows = 0;
        int success;
        do{
            success = rnd(1,6);
            if(success > 5){
                ent2.health -= rnd(1, this.damage);
                break;
            }
            countThrows++;
        }while (countThrows < numberThrows);

    }
    public Integer hitModificator(int hit, int armor){ //Модификатор атаки
        return Math.abs(hit-armor)+1;
    }
    public void healing(){
        if(!CheckPlayer) return;
        if(numberOfHealings > 3) return;
        health += (N*30)/100;
        numberOfHealings++;
        if(health > 100) health = 100;
    }
    public void printParam() {
        if(CheckPlayer) System.out.println("Player params:\n" + "Health: " + this.health + " Armor: " + this.armor + " Damage: " + this.damage);
        else System.out.println("Enemy params:\n" + "Health: " + this.health + " Armor: " + this.armor + " Damage: " + this.damage);
    }

}
