package Dijkstra;

import java.util.ArrayList;

public class Finder {
    final static int UNKNOWN = -1;  // Indicates an unknown cost or parent

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

        // cost[i] has the cost of getting to node number i or is UNKNOWN if no cost figure out yet.
        // parent[i] contains the parent (or the way) we got to node i.
        // done[i] is true if we've already worked on all the children of node i.

        // Initialize the arrays.
        for (int i = 0; i<nNodes; i++) {
            costs[i] = UNKNOWN;
            parents[i] = UNKNOWN;
            doneWithNode[i] = false;
        }

        int node = start;  // This is the node we are working on.  Let's start with start node.
        costs[node] = 0;   // The cost of getting to the start node is 0!

        // While not done processing all the nodes...

            // Loop through all the edges (edges array list).
                   // Skip those edges whose source is doesn't match the node we're working on.

                   // For edge (that has source of current node) figure out potential to
                   // get it.  (How much does it cost to get to node we're on? Add to
                   // that the cost of the edge.  That's the new price to set to dest of edge.

                   // Is that a new low cost for that dest edge node?
                   // Or is the dest edge node cost currently UNKNOWN? That means we have no cost.
                   // If so, store the cost.  Store the parent.

            // Once done with all the edges, mark the current node as
            // done being processed.
            doneWithNode[node] = true;

            // Get next node to work on.
            node = getLowestCostUnprocessedNode(costs, doneWithNode);

        // Done with while loop

        for (int i=0; i<parents.length; i++) {
            System.out.println("Node: " + i + " Cost: " + costs[i] + " Backtrace Parent: " + parents[i]);
        }

        backtrace(dest, parents);
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
        int lowestCost = 0;

        for (int i=0; i<doneWithNode.length; i++) {
            // We can't pick the node if we've already done it or
            // we don't know how much it costs to get to the node.
            if (doneWithNode[i] || costs[i] == UNKNOWN)
                continue;

            if (result == UNKNOWN || costs[i] < lowestCost) {
                lowestCost = costs[i];
                result = i;
            }
        }

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
