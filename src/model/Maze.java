package model;

public class Maze {
	private int door;
	private int room;
	private int wall;

	public Maze() {
	}

	public Maze(int door, int room, int wall) {
		this.door = door;
		this.room = room;
		this.wall = wall;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public int getWall() {
		return wall;
	}

	public void setWall(int wall) {
		this.wall = wall;
	}

	@Override
	public String toString() {
		return "Maze [door= " + door + ", room= " + room + ", wall= " + wall + "]";
	}

}
