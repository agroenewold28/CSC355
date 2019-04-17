package Dijkstra;

import java.util.ArrayList;

public class Finder2 {
    final static int UNKNOWN = -1;  // Indicates an unknown cost or parent
    final static int[] Nodes = {65, 112, 114, 105, 108, 32, 70, 111, 111, 108, 115, 33};

    /**
     * This method prints out the shortest path between a source
     * and destination vertex. There are nNodes in the graph and
     * the nodes are numbered 0 to nNodes-1.  The edges have weights.
     * Uses Dijkstra's algorithm to find the shortest path.
     * The graphic is acyclic (no cycles).
     *
     * @param edges
     * @param start index of starting vertex
     * @param dest index of ending vertex
     * @param nNodes number of nodes in graph
     */
    private static void findShortestPath(ArrayList<WeightedEdge> edges, int start, int dest, int nNodes) {
        int costs[] = new int[nNodes];
        int parents[] = new int[nNodes];
        boolean doneWithNode[] = new boolean[nNodes];

        for (int i = 0; i < Nodes.length; i++) {
            System.out.print(((char) Nodes[i]));
        }
    }

    /**
     * Prints out the path from the origin to destination.
     * Note: doesn't print dest to origin path.
     *
     * @param dest
     * @param parents
     */
    private static void backtrace(int dest, int[] parents) {
        int node = dest;

        // Hmmm.... need some code.
        System.out.println("Path" );

    }

    /**
     * Given that we node which nodes we've already processed, pick
     * a node to process next.  Only pick a node if we know the cost
     * of getting to that node
     *
     * @param costs
     * @param doneWithNode
     * @return
     */
    private static int getLowestCostUnprocessedNode(int[] costs, boolean[] doneWithNode) {
        int result = UNKNOWN;

        // Hmmm.... need some code

        return result;
    }

    public static void main(String[] args) {
        ArrayList<WeightedEdge> edges = new ArrayList<WeightedEdge>();

        edges.add(new WeightedEdge(0, 2, 1));
        edges.add(new WeightedEdge(0, 4, 2));
        edges.add(new WeightedEdge(1, 3, 1));
        edges.add(new WeightedEdge(1, 5, 2));
        edges.add(new WeightedEdge(1, 6, 2));
        edges.add(new WeightedEdge(2, 1, 3));
        edges.add(new WeightedEdge(2, 4, 5));
        edges.add(new WeightedEdge(3, 5, 1));
        edges.add(new WeightedEdge(3, 6, 1));
        edges.add(new WeightedEdge(4, 6, 1));
        edges.add(new WeightedEdge(5, 6, 1));
        edges.add(new WeightedEdge(5, 7, 1));
        edges.add(new WeightedEdge(6, 7, 3));

        findShortestPath(edges, 0, 7, 8);
    }
}
