package Dijkstra;

// Created by 
public class WeightedEdge {
    private int source;  // id of source vertex
    private int dest;    // id of destination vertex;
    private int cost;

    public WeightedEdge(int source, int dest, int cost) {
        this.source = source;
        this.dest = dest;
        this.cost = cost;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getDest() {
        return dest;
    }

    public void setDest(int dest) {
        this.dest = dest;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
