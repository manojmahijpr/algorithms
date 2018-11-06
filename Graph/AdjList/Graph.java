import java.util.LinkedList;

public class Graph {

    private int V;
    private LinkedList<Integer> AdjListNode[];
    
    public int getV() {
        return V;
    }
    public void setV(int V) {
        this.V = V;
    }

    public void setAdjListNode(LinkedList<Integer> AdjListNode[]) {
        this.AdjListNode = AdjListNode;
    }
    public LinkedList<Integer>[] getAdjListNode() {
        return AdjListNode;
    }
    

    public Graph() {
    }

    public Graph(int V) {
        
        this.V = V;

        AdjListNode = (LinkedList<Integer>[])new LinkedList[V];

        for(int i=0; i<V; i++) {
            AdjListNode[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int src, int dest) {
        AdjListNode[src].add(dest);
        AdjListNode[dest].add(src);
    }

    public void addEdgeDirected(int src, int dest) {
        AdjListNode[src].add(dest);
    }

    public void print() {

        for(int i=0; i<V; i++) {
            System.out.println("For Vertex: " + i);
            System.out.print("head("+i+")");
            for(Integer val: AdjListNode[i])
                System.out.print(" -> " + val);
            System.out.println("\n");
        }
    }

    public Graph createTempGraph(Graph graph) {
        
        graph.addEdge( 0, 1); 
        graph.addEdge( 0, 4); 
        graph.addEdge( 1, 2); 
        graph.addEdge( 1, 3); 
        graph.addEdge( 1, 4); 
        graph.addEdge( 2, 3); 
        graph.addEdge( 3, 4);

        return graph;
    }

    public Graph createTempGraphDir(Graph graph) {
        
        graph.addEdgeDirected( 0, 1); 
        graph.addEdgeDirected( 0, 4); 
        graph.addEdgeDirected( 1, 2); 
        graph.addEdgeDirected( 1, 3); 
        graph.addEdgeDirected( 1, 4); 
        graph.addEdgeDirected( 2, 3); 
        graph.addEdgeDirected( 3, 4);

        return graph;
    }
}