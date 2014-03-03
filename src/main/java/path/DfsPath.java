package path;

import ds.Graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Depth First Search processing of a graph from source {@code s}
 */
public class DfsPath extends Path {

    private boolean marked[];
    private int edgeTo[];

    protected DfsPath(Graph<Integer> G, int s) {
        super(G, s);
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        dfs(G, s);
    }

    private void dfs(Graph<Integer> G, int v) {
        marked[v] = true;

        for (int w: G.adj(v)) {
            if(!marked[w]) {
                edgeTo[w] = v;
                dfs(G, w);
            }
        }
    }

    @Override
    public boolean hasPathTo(int v) {
        return marked[v];
    }

    @Override
    public Iterable<Integer> pathTo(int v) {
        List<Integer> path = new ArrayList<Integer>();
        if(hasPathTo(v)) {
            path.add(v);
            int e = edgeTo[v];
            while (e != s) {
                path.add(e);
                e = edgeTo[e];
            }
            path.add(s);
        }
        return path;
    }
}
