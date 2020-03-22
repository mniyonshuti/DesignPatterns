package game.statepattern;

import game.Game;

public abstract class GameStatus {
    protected final Game game;

    protected GameStatus(Game game) {
        this.game = game;
    }

    public abstract int addPoints(int points);
    public abstract int getLevel();
}
