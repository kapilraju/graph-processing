package ds;

/**
 * Created with IntelliJ IDEA.
 * User: kapilr
 * Date: 1/31/14
 * Time: 10:20 AM
 * To change this template use File | Settings | File Templates.
 */
public interface Graph<Type> {

    void addEdge(Type v, Type w);

    Iterable<Type> adj(Type v);

    int V();

    int E();
}
