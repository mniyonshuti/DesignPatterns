package game.statepattern;

import game.Game;

public class Level3 extends GameStatus  {
    public Level3(Game game) {
        super(game);
    }

    @Override
    public int addPoints(int points) {
        int totalPoints = game.getTotalPoints() + (3 * points);
        return totalPoints;
    }

    @Override
    public int getLevel() {
        return 3;
    }
}
