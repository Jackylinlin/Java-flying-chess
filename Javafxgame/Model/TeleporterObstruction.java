package Model;

import Model.Obstruction;
import Model.Player;
import javafx.scene.control.ChoiceDialog;

/**
 * Represents a Teleporter Obstruction.
 */
public class TeleporterObstruction extends Obstruction {
	private Player thePlayerToMove;
	private int pathLength;

	/**
	 * Creates a new TeleporterObstruction.
	 *
	 * @param row    row of position
	 * @param column column of position
	 */
	public TeleporterObstruction(int row, int column, int pathLength) {
		super(row, column);
		this.pathLength = pathLength;
	}

	/**
	 * Set the thePlayerToMove.
	 *
	 * @param thePlayerToMove the thePlayerToMove to set
	 */
	public void setThePlayerToMove(Player thePlayerToMove) {
		this.thePlayerToMove = thePlayerToMove;
	}

	/**
	 * Process the pass action of a player.
	 *
	 * @param player the player to play
	 */
	@Override
	public String pass(Player player) {
		player.setPosition(getIndex());
		return "";
	}

	/**
	 * Process the land action of a player.
	 *
	 * @param player the player to play
	 */
	@Override
	public String land(Player player) {
		int randomPosition = (int) (Math.random() * pathLength);
		thePlayerToMove.setPosition(randomPosition);
		if (thePlayerToMove != player) {
			player.setPosition(getIndex());
		}
		return thePlayerToMove.toString() + " moves to a random position";
	}
}