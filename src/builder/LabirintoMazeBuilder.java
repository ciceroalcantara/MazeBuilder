package builder;

public class LabirintoMazeBuilder extends MazeBuilder {

	public LabirintoMazeBuilder() {
	}

	public void buildDoor() {
		maze.setDoor(2);
	}

	public void buildRoom() {
		maze.setRoom(1001);
	}

	public void buildWall() {
		maze.setWall(15);
	}

}
