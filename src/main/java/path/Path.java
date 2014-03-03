package path;

import ds.Graph;

/**
 * Created with IntelliJ IDEA.
 * User: kapilr
 * Date: 1/31/14
 * Time: 12:05 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Path {

    protected Graph<Integer> G;

    protected int s;

    protected Path(Graph g, int s) {
        G = g;
        this.s = s;
    }

    public abstract boolean hasPathTo(int v);

    public abstract Iterable<Integer> pathTo(int v);

}
