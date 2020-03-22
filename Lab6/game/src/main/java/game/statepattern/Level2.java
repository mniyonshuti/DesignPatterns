package game.statepattern;

import game.Game;

public class Level2 extends GameStatus  {
    public Level2(Game game) {
        super(game);
    }

    @Override
    public int addPoints(int points) {
        int totalPoints = game.getTotalPoints() + (2 * points);
        if (totalPoints > 20) { // move to level 3
            GameStatus level = new Level3(game);
            totalPoints = totalPoints + 2; //add 2 bonus points
            game.setTotalPoints(totalPoints);
            game.setGameStatus(level);
        }
        return totalPoints;
    }

    @Override
    public int getLevel() {
        return 2;
    }
}
