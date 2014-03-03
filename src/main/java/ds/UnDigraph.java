package ds;

import java.util.LinkedList;
import java.util.List;

/**
 * An undirected graph represented using Adjacency list.
 */
public class UnDigraph implements Graph<Integer>{

    private final List<Integer>[] adj;

    private int V;

    private int E;

    public UnDigraph(int numberOfVertices) {
        V = numberOfVertices;
        adj = new LinkedList[V];

        for (int i=0; i<adj.length; i++)
            adj[i] = new LinkedList<Integer>();
    }

    @Override
    public void addEdge(Integer v, Integer w) {
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }

    @Override
    public Iterable<Integer> adj(Integer v) {
        return adj[v];
    }

    @Override
    public int V() {
        return V;
    }

    @Override
    public int E() {
        return E;
    }
}
