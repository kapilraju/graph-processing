package path;

import ds.Graph;
import ds.UnDigraph;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: kapilr
 * Date: 1/31/14
 * Time: 12:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class DFSTest {

    @Test
    public final void testDFS() {
        Graph<Integer> G = new UnDigraph(10);
        G.addEdge(0, 6);
        G.addEdge(0, 2);
        G.addEdge(0, 1);
        G.addEdge(0, 5);
        G.addEdge(6, 4);
        G.addEdge(4, 3);
        G.addEdge(4, 5);
        G.addEdge(7, 8);


        Path path = new DfsPath(G, 7);

        System.out.println(path.hasPathTo(8));

        System.out.println(path.pathTo(8));




    }
}
