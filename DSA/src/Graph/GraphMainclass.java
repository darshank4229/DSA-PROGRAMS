package Graph;

import java.util.ArrayList;

class GraphNode{
	private char ch;
	private int index;
	boolean visited;
	public GraphNode(char ch,int index) {
		this.ch=ch;
		this.index=index;
		this.visited=false;
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
	public ArrayList<GraphNode> getNeigbours(GraphNode node){
		ArrayList<GraphNode> neigbours= new ArrayList<GraphNode>();
		int index= node.getIndex();
		for (int i = 0; i < arr.length; i++) {
			if(arr[index][i]==1) {
				neigbours.add(a1.get(i));
			}
		}
		return neigbours;
	}
	
	public void bfsVisited(GraphNode node) {
		ArrayList<GraphNode> queue= new ArrayList<GraphNode>();
		queue.add(node);
		while(!queue.isEmpty()) {
			GraphNode currentNode=queue.remove(0);
			currentNode.visited=true;
			System.out.println(currentNode.getch()+" ");
			
			ArrayList<GraphNode> neigbours=getNeigbours(currentNode);
			for (GraphNode nodes : neigbours) {
				if(!nodes.visited) {
					nodes.visited=true;
					queue.add(nodes);
				}
			}
			
		}
	}
	
	public void bfs() {
		
		for (GraphNode graphNode : a1) {
			if(!graphNode.visited)
			bfsVisited(graphNode);
		}
		
//		bfsVisited(a1.get(0));
	}

}



public class GraphMainclass {
public static void main(String[] args) {
	
	ArrayList<GraphNode> nodeList= new ArrayList<GraphNode>();
	nodeList.add(new GraphNode('A', 0));
	nodeList.add(new GraphNode('B', 1));
	nodeList.add(new GraphNode('C', 2));
	nodeList.add(new GraphNode('D', 3));
	nodeList.add(new GraphNode('E', 4));
	Graph g1= new Graph(nodeList);
	g1.printGraph();
	System.out.println("------------------------------------------------");
	g1.add(0, 1);
	g1.add(0, 2);
	g1.add(0, 3);
	g1.add(1, 4);
	g1.add(2, 3);
	g1.add(3, 4);
	
	g1.printGraph();
	System.out.println("------------------------------------------------");
	 g1.bfs();
}
}
