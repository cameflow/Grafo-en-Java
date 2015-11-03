class Test{

  public static void main(String[] args) {

    Graph g = new Graph();
    Node a = new Node("A");
    Node b = new Node("B");
    Node c = new Node("B");
    Edge ab = new Edge(a,b,3);
    Edge bc = new Edge(b,c,2);

    g.addNode(a);
    g.addNode(b);
    g.addNode(c);
    g.addEdge(ab);
    g.addEdge(bc);

    int nodes;
    int edges;

    nodes = g.getNodes();
    edges = g.getEdges();

    System.out.print(nodes);
    System.out.print("\n");
    System.out.print(edges);
    System.out.print("\n");


  }
}
