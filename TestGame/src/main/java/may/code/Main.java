package may.code;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player(75, 30, 23);
        Enemy enemy1 = new Enemy(100, 16, 10);

        enemy1.hit(player1);
        enemy1.hit(player1);
        player1.hit(enemy1);

        player1.printParam();
        enemy1.printParam();

        player1.healing();
        player1.printParam();



    }
}