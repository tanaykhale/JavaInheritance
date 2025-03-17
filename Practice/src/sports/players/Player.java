package sports.players;

import office.main.Person;

public class Player extends Person {
	private int playerid;
	private double contractFees;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
		playerid=000;
		contractFees=00;
	}
	public Player(String n, int d, int m, int y, int playerid, double contractFees) {
		super(n, d, m, y);
		this.playerid = playerid;
		this.contractFees = contractFees;
	}
	public void display() {
		super.display();
		System.out.println("Player id : "+playerid);
		System.out.println("Contract fees of player: "+contractFees);
	}
	
}	
