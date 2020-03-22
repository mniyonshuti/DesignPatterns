package game;

import game.statepattern.GameStatus;
import game.statepattern.Level1;

public class Application {

	public static void main(String[] args) {
		Game game = new Game();
		GameStatus gameStatus = new Level1(game);
		game.setGameStatus(gameStatus);
		game.play();
		game.play();
		game.play();
		game.play();
		game.play();
		game.play();
		game.play();
		game.play();

	}

}
