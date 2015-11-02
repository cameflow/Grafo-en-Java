import java.util.*;

public class Graph{
    private int id;
    private List<Node> mNodes;
    private List<Edge> mEdges;


    public Graph(){
        mNodes = new LinkedList();
        mEdges = new LinkedList();
    }

  
    public void addEdge(Edge edge){
        edges.add(edge);
    }
    
    public void addNode(Node node){
    nodes.add(node);
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
