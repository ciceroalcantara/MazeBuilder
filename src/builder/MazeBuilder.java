package builder;

import model.Maze;

public abstract class MazeBuilder {

	protected Maze maze;

	public MazeBuilder() {
		this.maze = new Maze();
	}

	public abstract void buildDoor();

	public abstract void buildRoom();

	public abstract void buildWall();

	public void construirMazeBuilder() {
		buildDoor();
		buildRoom();
		buildWall();
	}

	public Maze getMaze() {
		return maze;
	}

}
