package sports.players;

public class CricketPlayer extends Player {
	private int totalruns;
	private int totalwickets;
	public CricketPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CricketPlayer(String n, int d, int m, int y, int playerid, double contractFees, int totalruns,
			int totalwickets) {
		super(n, d, m, y, playerid, contractFees);
		this.totalruns = totalruns;
		this.totalwickets = totalwickets;
	}
	public void display() {
		super.display();
		System.out.println("Total Runs: "+totalruns);
		System.out.println("Total wickets: "+totalwickets);
	}
}
