package Graph;

import java.util.ArrayList;

class GraphNode{
	private char ch;
	private int index;
	public GraphNode(char ch,int index) {
		this.ch=ch;
		this.index=index;
	}
	public char getch() {
		return ch;
	}
	public int getIndex()
	{
		return index;
	}
}
class Graph{
	int [][] arr;
	ArrayList<GraphNode> a1= new ArrayList<GraphNode>();
	public Graph(ArrayList<GraphNode> a1) {
		this.a1= a1;
		this.arr=new int[a1.size()][a1.size()];
	}
	public void add(int row,int col) {
		if(row==col) {
			arr[row][col]=0;
			arr[col][row]=0;
		}
		else {
			arr[row][col]=1;
			arr[col][row]=1;
		}
	}
	public void printGraph() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}



public class GraphMainclass {
public static void main(String[] args) {
	
	ArrayList<GraphNode> a1= new ArrayList<GraphNode>();
	a1.add(new GraphNode('A', 0));
	a1.add(new GraphNode('B', 1));
	a1.add(new GraphNode('C', 2));
	a1.add(new GraphNode('D', 3));
	a1.add(new GraphNode('E', 4));
	Graph g1= new Graph(a1);
	g1.add(0, 1);
	g1.add(0, 2);
	g1.add(0, 3);
	g1.add(1, 4);
	g1.add(2, 3);
	g1.add(3, 4);
	
	g1.printGraph();
}
}
