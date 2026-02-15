
package SingleTon;

import SingleTon.GameManager;

public class GameDemo {

    public static void main(String[] args) {
        GameManager gameManager1 = GameManager.getInstance();
        GameManager gameManager2 = GameManager.getInstance();

        System.out.println("Game Manager 1: " + gameManager1);
        System.out.println("Game Manager 2: " + gameManager2);

        if (gameManager1 == gameManager2) {
            System.out.println("Both instances are the same. Singleton pattern is working.");
        } else {
            System.out.println("Instances are different. Singleton pattern is not working.");
        }
    }
}
