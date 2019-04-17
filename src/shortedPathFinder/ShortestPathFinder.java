package shortedPathFinder;

import java.util.ArrayList;

// Created by
public class ShortestPathFinder {

    /**
     * This method prints out the shortest path between a source
     * and destination vertex.  The edges have weights.  Uses
     * Dijkstra's algorithm.  The graphic is acyclic (no cycles).
     *
     * @param edges
     * @param start index of starting vertex
     * @param dest index of ending vertex
     * @param nNodes number of nodes in graph
     */
    private static void findShortestWeightedPath(ArrayList<WeightedEdges> edges, int start, int dest, int nNodes) {
    }

    /**
     * This method prints out the shortest path between a source
     * and destination vertex in an unweighted graph using a
     * breadth first search algorithm
     *
     * @param edges
     * @param start index of starting vertex
     * @param dest index of ending vertex
     * @param nNodes number of nodes in graph
     */
    private static void findShortestPath(ArrayList<Edges> edges, int start, int dest, int nNodes) {
    }

    public static void main(String[] args) {
        ArrayList<Edges> edges = new ArrayList<Edges>();

        edges.add(new Edges(0, 2));
        edges.add(new Edges(0, 4));
        edges.add(new Edges(1, 3));
        edges.add(new Edges(1, 5));
        edges.add(new Edges(1, 6));
        edges.add(new Edges(2, 1));
        edges.add(new Edges(2, 4));
        edges.add(new Edges(3, 5));
        edges.add(new Edges(3, 6));
        edges.add(new Edges(4, 6));
        edges.add(new Edges(5, 6));
        edges.add(new Edges(5, 7));
        edges.add(new Edges(6, 7));

        findShortestPath(edges, 0, 7, 7);
    }
}
