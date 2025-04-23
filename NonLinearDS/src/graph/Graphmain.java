package graph;
import java.util.*;
public class Graphmain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ch;
		GraphOperations g=new GraphOperations();
		while(true) {
			System.out.println("1.Create graph");
			System.out.println("2.Create adjacency matrix");
			System.out.println("3.DFS");
			System.out.println("4.BFS");
			System.out.println("5.Display adjacency matrix");
			System.out.println("6.Indegree");
			System.out.println("7.Outdegree");
			System.out.println("0.Exit");
			
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter number of nodes");
				int n=sc.nextInt();
				g.create(n);
				break;
			case 2:
				System.out.println("Enter the data");
				g.createAdjacencyMatrix();
				break;
			case 3:
				g.DFS();
				break;
			case 4:
				g.BFS();
				break;
			case 5:
				g.displayAdjacencyMatrix();
				break;
			case 6:
				g.indegree();
				break;
			case 7:
				g.outdegree();
				break;
			case 0:
				System.exit(0);
			}
			
		}
	}

}
