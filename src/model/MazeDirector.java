package model;

import builder.MazeBuilder;

public class MazeDirector {
	protected MazeBuilder builder;

	public MazeDirector(MazeBuilder builder) {
		this.builder = builder;
	}

	public void buildMaze() {
		builder.buildDoor();
		builder.buildRoom();
		builder.buildWall();
	}

	public Maze getMaze() {
		return builder.getMaze();
	}

}
