package game.statepattern;

import game.Game;

public class Level1 extends GameStatus {
    public Level1(Game game) {
        super(game);
    }

    @Override
    public int addPoints(int points) {
        int totalPoints = game.getTotalPoints() + points;
        if (totalPoints > 10) { // move to level 2
            GameStatus level = new Level2(game);
            totalPoints = totalPoints + 1;//add 1 bonus point
            game.setTotalPoints(totalPoints);
            game.setGameStatus(level);
        }
        return totalPoints;
    }

    @Override
    public int getLevel() {
        return 1;
    }
}
