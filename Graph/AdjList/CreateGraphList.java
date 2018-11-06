
public class CreateGraphList {

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph = graph.createTempGraph(graph);
        graph.print();
    }
}