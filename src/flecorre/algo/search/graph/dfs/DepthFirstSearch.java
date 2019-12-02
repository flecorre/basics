package flecorre.algo.search.graph.dfs;

import flecorre.algo.search.graph.Vertex;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {

    public static void main(String[] args) {

        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);

        v1.addNeighbour(v2);
        v1.addNeighbour(v5);
        v2.addNeighbour(v4);
        v4.addNeighbour(v3);

        List<Vertex> vertexList = new ArrayList<Vertex>();
        vertexList.add(v1);
        vertexList.add(v2);
        vertexList.add(v3);
        vertexList.add(v4);
        vertexList.add(v5);

        dfs(vertexList);

    }

    private static void dfs(List<Vertex> vertexList) {
        for(Vertex v : vertexList) {
            if(!v.isVisited()) {
                v.setVisited(true);
                //dfsRecursive(v);
                dfsWithStack(v);
            }
        }
    }

    private static void dfsRecursive(Vertex v) {
        System.out.println("actual vertex (recursive): " + v);

        for(Vertex neighbour : v.getNeighbourList()) {
            if(!neighbour.isVisited()) {
                neighbour.setVisited(true);
                dfsRecursive(neighbour);
            }
        }
    }

    private static void dfsWithStack(Vertex v) {
        Stack<Vertex> stack = new Stack<Vertex>();
        stack.push(v);

        while(!stack.isEmpty()) {
            Vertex actualVertex = stack.pop();
            System.out.println("actual vertex (stack): " + actualVertex);

            for(Vertex neighbour : actualVertex.getNeighbourList()) {
                if(!neighbour.isVisited()) {
                    neighbour.setVisited(true);
                    stack.push(neighbour);
                }
            }
        }

    }
}
