package view;

import builder.LabirintoMazeBuilder;
import model.Maze;
import model.MazeDirector;

public class Client {

	public static void main(String[] args) {

		MazeDirector builder = new MazeDirector(new LabirintoMazeBuilder());
		builder.buildMaze();
		Maze maze = builder.getMaze();
		System.out.println(maze);

	}

}
