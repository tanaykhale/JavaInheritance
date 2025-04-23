package graph;
import java.util.*;
public class GraphOperations {
	Scanner sc=new Scanner(System.in);
	private int arr[][];
	private int nodes;
	public void create(int numberOfNodes) {
		arr=new int[numberOfNodes][numberOfNodes];
		nodes=numberOfNodes;
	}
	public void createAdjacencyMatrix() {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println(i+"->"+j);
				arr[i][j]=sc.nextInt();
			}
		}
	}
	
	public void displayAdjacencyMatrix() {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void BFS() {
		int i,j,k=0;
		
		int visited[]=new int[nodes];
		System.out.println();
		for(i=0;i<nodes;i++) {
			visited[i]=0;
			for(j=0;j<nodes;) {
				if(arr[i][j]!=-1) {
					if(visited[j]==0) {
						System.out.println(" "+(j));
						visited[j]=1;
					}
					else
						j++;
				}
				else
					j++;
			}
		}
	}
	public void DFS() {
		int i,j,k=0;
		int visited[]=new int[nodes];
		for(i=0;i<nodes;i++) {
			visited[i]=0;
		}
		for(i=0;i<nodes;i++) {
			if(visited[i]==0)
				System.out.println(" "+(i));
			visited[i]=1;
			k=i;
			for(j=0;j<nodes;) {
				if(arr[k][j]!=0) {
					if(visited[j]==0) {
						System.out.println(" "+(j));
						visited[j]=1;
						k=j;
						j=0;
					}
					else
						j++;
				}
				else
					j++;
			}
		}
		for(;i<nodes;i++) {
			System.out.println(" "+(i));
		}
		
	}
	public void indegree() {
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j][i]!=0)
				count++;
			}
			System.out.println("Indegree of node: "+count);
		}
	}
	public void outdegree() {
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]!=0)
					count++;
			}
			System.out.println("Outdegree of node: "+count);
		}
	}
}
