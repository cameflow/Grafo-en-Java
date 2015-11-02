import java.util.*;

public class Graph{
  int id;
  List<Node> nodes = new LinkedList();
  List<Edge> edges = new LinkedList();

  //---------------Constructors------------//
  public Graph()
  {

  }

  //----------Functions to set data------------//
  public void addEdge(Node o, Node d, int w)
  {
    Edge e = new Edge(o,d,w);
    edges.add(e);
  }
  public void addNode(int i, String s)
  {
    Node n = new Node(i,s);
    nodes.add(n);
  }

  //---------------Functions to get data---------------//
  int getNodes()
  {
    return nodes.size();
  }
  int getEdges()
  {
    return edges.size();
  }

}
