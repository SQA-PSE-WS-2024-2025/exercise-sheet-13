package de.unistuttgart.iste.sqa.pse.sheet13.presence.memory;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * Hamstergame for solving an exercise.
 */
public class MemoryHamsterGame extends SimpleHamsterGame {

	/**
	 * Creates a new MemoryHamsterGame.<br>
	 * Do not modify!
	 */
	public MemoryHamsterGame() {
		this.loadTerritoryFromResourceFile("/territories/order.ter");
		this.displayInNewGameWindow();
		game.startGame();
	}

	@Override
	protected void run() {
		// Comment any operation call out, to run the others on their own.
		this.inOrder();
		this.reverseOrder();
		this.sort();

		// TODO implement
	}

	/**
	 * TODO add documentation here.
	 */
	private void reverseOrder() {
		// TODO implement
	}

	/**
	 * TODO add documentation here.
	 */
	private void inOrder() {
		// TODO implement
	}

	/**
	 * TODO add documentation here.
	 */
	private void sort() {
		// TODO implement
	}

	// TODO Add additional Operations here
}
