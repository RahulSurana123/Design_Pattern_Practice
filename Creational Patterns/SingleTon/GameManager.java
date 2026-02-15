
package SingleTon;

public final class GameManager {

    private static GameManager gameManager;

    private GameManager() {
        // Private constructor to prevent instantiation
    }

    public static GameManager getInstance() {
        if(gameManager == null) {
            synchronized (GameManager.class) {
                if(gameManager == null) {
                    gameManager = new GameManager();
                }
            }
        }
        return gameManager;
    }
    
}