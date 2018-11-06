/**
 * DFS
 */
public class DFS {

    Graph graph;

    public DFS(Graph graph) {
        this.graph = graph;
    }

    void dfs(int v, boolean visited[]) {

        visited[v] = true;
        System.out.print(v + " -> ");

        for(Integer val : graph.getAdjListNode()[v]) {
            if(!visited[val]) {
                dfs(val, visited);
            }
        }

    }


    public static void main(String[] args) {
        
        Graph graph = new Graph(4); 
  
        graph.addEdge(0, 1); 
        graph.addEdge(0, 2); 
        graph.addEdge(1, 2); 
        graph.addEdge(2, 0); 
        graph.addEdge(2, 3); 
        graph.addEdge(3, 3);
        

        DFS dfs = new DFS(graph);
        boolean visited[] = new boolean[graph.getV()]; 
        dfs.dfs(2, visited);
    }
}