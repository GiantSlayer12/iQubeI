public class DFS{

	public static void main(String[] args){
		Graph graph = new Graph();

		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');

		graph.addEdge(0,1);
		graph.addEdge(1,2);
		graph.addEdge(0,3);
		graph.addEdge(3,4);

		System.out.print("Visits: ");
		graph.dfs();

	}
}

class Stackk{

	private final int size = 20;
	private int[] st;
	private int top;

	public Stackk(){
		st = new int [size];
		top = -1;
	}

	public void push (int j){
		st[++top] = j;
	}

	public int pop(){
		return st[top--];
	}

	public int peek(){
		return st[top];
	}

	public boolean isEmpty(){
		return ( top == -1 );
	}
}

class Vertex{

	public char label;
	public boolean isVisited;

	public Vertex(char lab){
		lab = label;
		isVisited = false;
	}
}

class Graph{

	private final int MAX_VERTS = 20;
	private Vertex vertexList[];
	private int adjacencyMatrix[][];
	private int nVertices;
	private Stackk stackk;

	public Graph(){
		vertexList = new Vertex[MAX_VERTS];

		nVertices = 0;
		adjacencyMatrix = new int[MAX_VERTS][MAX_VERTS];

		for(int j = 0; j < MAX_VERTS; j++){

			for(int k = 0; k < MAX_VERTS; k++){
				adjacencyMatrix[j][k] = 0;
			}

		}
		stackk = new Stackk();
	}

	public void addVertex(char lab){
		vertexList[nVertices++] = new Vertex(lab);
	}

	public void addEdge(int start, int end){
		adjacencyMatrix[start][end] = 1;
		adjacencyMatrix[start][start] = 1;
	}

	public void displayVertex(int v){
		System.out.print(vertexList[v].label);
	}

	public void dfs(){

		vertexList[0].isVisited = true;
		displayVertex(0);
		stackk.push(0);

		while(!stackk.isEmpty()){
			int v = getUnvisitedVertex(stackk.peek());

			if( v == -1){
				stackk.pop();
			}else{
				vertexList[v].isVisited = true;
				displayVertex(v);
				stackk.push(v);
			}


		}

			for(int j = 0; j < nVertices; j++){
				vertexList[j].isVisited = false;
			}
	}

	public int getUnvisitedVertex(int v){
		for(int j = 0; j < nVertices; j++){
			if(adjacencyMatrix[v][j] == 1 && vertexList[j].isVisited == false)
				return j;
			

		}
		return -1;
	}
}

