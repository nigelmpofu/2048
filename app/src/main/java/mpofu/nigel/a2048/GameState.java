package mpofu.nigel.a2048;

/**
 * This class is used to store the state of the board
 * to allow for stepping back and forth in the game. It
 * follows the Memento design pattern.
 */
public class GameState {
    private Grid saveGrid;
    private long saveScore;
    private int saveState;

    public GameState(Grid grid, long score, int state) {
        saveGrid = grid;
        saveScore = score;
        saveState = state;
    }

    public Grid getGrid() {
        return saveGrid;
    }

    public long getScore() {
        return  saveScore;
    }

    public int getState() {
        return saveState;
    }
}
