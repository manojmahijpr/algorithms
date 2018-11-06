import java.util.Iterator;
import java.util.LinkedList;

/**
 * BFS
 */
public class BFS {

    public static void bfs(Graph graph) {

        LinkedList<Integer> queue = new LinkedList<Integer>();
        boolean[] visited = new boolean[graph.getV()];

        //randomly pick a node like I pick 2
        int nodeVal = 2;
        visited[nodeVal] = true;
        queue.add(nodeVal);

        while(queue.size() != 0) {

            nodeVal = queue.poll();
            System.out.print(nodeVal + " , ");

            Iterator<Integer> iter = graph.getAdjListNode()[nodeVal].listIterator();
            while(iter.hasNext()) {
                int n = iter.next();
                if(!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
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

        bfs(graph);
    }
}