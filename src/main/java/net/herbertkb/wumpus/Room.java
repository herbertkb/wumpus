package net.herbertkb.wumpus;

public class Room implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private int id;
	private java.util.List<net.herbertkb.wumpus.Room> leadsTo;

	public Room() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public java.util.List<net.herbertkb.wumpus.Room> getLeadsTo() {
		return this.leadsTo;
	}

	public void setLeadsTo(java.util.List<net.herbertkb.wumpus.Room> leadsTo) {
		this.leadsTo = leadsTo;
	}

	public Room(int id, java.util.List<net.herbertkb.wumpus.Room> leadsTo) {
		this.id = id;
		this.leadsTo = leadsTo;
	}

}