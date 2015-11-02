import java.util.*;

public class Graph{
    private int id;
    private List<Node> mNodes;
    private List<Edge> mEdges;


    public Graph(){
        mNodes = new LinkedList();
        mEdges = new LinkedList();
    }


    public void addEdge(Node o, Node d, int w){
        Edge e = new Edge(o,d,w);
        edges.add(e);
    }

    public void addNode(Node n){
        nodes.add(n);
    }

    // TODO: getNodes returns the amount of nodes not the nodes. Rename function
    // or change implementation.
    public int getNodes(){
        return nodes.size();
    }

    // TODO: getEdges returns the amount of eges not the nodes. Rename function
    // or change implementation.
    public int getEdges(){
        return edges.size();
    }

}
