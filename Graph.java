import java.util.*;

public class Graph{
    private int id;
    private List<Node> mNodes;
    private List<Edge> mEdges;

    //------------Constructors-----------//
    public Graph(){
        mNodes = new LinkedList();
        mEdges = new LinkedList();
    }

    //------------Setters---------------//
    public void addEdge(Node o, Node d, int w){
        Edge e = new Edge(o,d,w);
        mEdges.add(e);
    }
    public void addEdge(Edge e){
        mEdges.add(e);
    }
    public void addNode(Node n){
        mNodes.add(n);
    }

    //------------Getters--------------//

    // TODO: getNodes returns the amount of nodes not the nodes. Rename function
    // or change implementation.
    public int getNodes(){
        return mNodes.size();
    }
    // TODO: getEdges returns the amount of eges not the nodes. Rename function
    // or change implementation.
    public int getEdges(){
        return mEdges.size();
    }

}
