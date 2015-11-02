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
  public void addEdge(Edge e)
  {
    edges.add(e);
  }
  public void addNode(Node n)
  {
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
