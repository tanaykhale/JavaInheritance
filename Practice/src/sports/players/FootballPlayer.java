package sports.players;

public class FootballPlayer extends Player{
	private int totalGoals;

	public FootballPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FootballPlayer(String n, int d, int m, int y, int playerid, double contractFees, int totalGoals) {
		super(n, d, m, y, playerid, contractFees);
		this.totalGoals = totalGoals;
	}
	public void display() {
		super.display();
		System.out.println("Total Goals: "+totalGoals);
	}
}
