package flecorre.algo.search.bfs;


import java.util.LinkedList;
import java.util.Queue;

public class BreathFirstSearch {

    public static void main(String[] args) {

        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);

        v1.addNeighbour(v2);
        v1.addNeighbour(v5);
        v2.addNeighbour(v3);
        v3.addNeighbour(v4);
        v4.addNeighbour(v1);

        bfs(v1);

    }

    private static void bfs(Vertex root) {
        Queue<Vertex> queue = new LinkedList<Vertex>();

        root.setVisited(true);
        queue.add(root);

        while (!queue.isEmpty()) {
            Vertex actualVertex = queue.remove();
            System.out.println("actual vertex: " + actualVertex);

            for (Vertex neighbour : actualVertex.getNeighbourList()) {
                if (!neighbour.isVisited()) {
                    neighbour.setVisited(true);
                    queue.add(neighbour);
                }
            }
        }

    }

}
