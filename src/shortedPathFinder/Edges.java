package shortedPathFinder;

// Created by 
public class Edges {
    int source;  // id of source vertex
    int dest;    // id of destination vertex;

    public Edges(int source, int dest) {
        this.source = source;
        this.dest = dest;
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
}

