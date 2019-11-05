package flecorre.algo.search.graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private int data;
    private List<Vertex> neighbourList;
    private boolean visited;

    public Vertex(int data) {
        this.data = data;
        this. neighbourList = new ArrayList<Vertex>();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public List<Vertex> getNeighbourList() {
        return neighbourList;
    }

    public void addNeighbour(Vertex v) {
        this.neighbourList.add(v);
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return "" + this.data;
    }

}
