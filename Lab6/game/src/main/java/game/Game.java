package game;

import game.statepattern.GameStatus;

import java.util.Random;

public class Game {
	private int totalPoints;
	private GameStatus gameStatus;

	public void play() {
		Random random = new Random();
		totalPoints = gameStatus.addPoints(random.nextInt(7));
		System.out.println("points="+ totalPoints +" level="+gameStatus.getLevel());
	}

	public GameStatus getGameStatus() {
		return gameStatus;
	}

	public void setGameStatus(GameStatus gameStatus) {
		this.gameStatus = gameStatus;
	}

	public int getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}
}
