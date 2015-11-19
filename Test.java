import java.util.*;

class Test{

  public static void main(String[] args) {
      Graph grafo = new Graph();
      Node a = new Node();
      Node b = new Node();
      Node c = new Node();
      Node d = new Node();
      Node e = new Node();
      Node f = new Node();
      Node g = new Node();
      Node h = new Node();
      Node s = new Node();
      Edge ab = new Edge(a,b,3);
      Edge as = new Edge(a,s,6);
      Edge sc = new Edge(s,c,2);
      Edge sg = new Edge(s,g,4);
      Edge cd = new Edge(c,d,2);
      Edge ce = new Edge(c,e,6);
      Edge cf = new Edge(c,f,2);
      Edge gf = new Edge(g,f,8);
      Edge gh = new Edge(g,h,2);
      Edge eh = new Edge(e,h,4);

      grafo.addNode(a);
      grafo.addNode(b);
      grafo.addNode(c);
      grafo.addNode(d);
      grafo.addNode(e);
      grafo.addNode(f);
      grafo.addNode(g);
      grafo.addNode(h);
      grafo.addNode(s);
      grafo.addEdge(ab);
      grafo.addEdge(as);
      grafo.addEdge(sc);
      grafo.addEdge(sg);
      grafo.addEdge(cd);
      grafo.addEdge(ce);
      grafo.addEdge(cf);
      grafo.addEdge(gf);
      grafo.addEdge(gh);
      grafo.addEdge(eh);

      int nodes;
      int edges;

      nodes = grafo.getNodes();
      edges = grafo.getEdges();

      System.out.print("Number of nodes in graph: " + nodes + "\n");
      System.out.print("Number of edges in graph: " + edges + "\n");

      System.out.print("FLOYD-WARSHALL \n");
      long startTime = System.nanoTime();
      grafo.floydWarshall();
      long stopTime = System.nanoTime();
      long elapsedTime = stopTime - startTime;
      System.out.println(elapsedTime + "\n");
      grafo.resetNodes();
      System.out.print("DIJKSTRA \n");
      startTime = System.nanoTime();
      grafo.dijkstra(a);
      stopTime = System.nanoTime();
      elapsedTime = stopTime - startTime;
      System.out.println(elapsedTime + "\n");
      grafo.resetNodes();
      System.out.print("BELLMAN-FORD \n");
      startTime = System.nanoTime();
      grafo.bellmanFord(a);
      stopTime = System.nanoTime();
      elapsedTime = stopTime - startTime;
      System.out.println(elapsedTime + "\n");
      grafo.resetNodes();
      System.out.print("BFS \n");
      startTime = System.nanoTime();
      grafo.bfs(a);
      stopTime = System.nanoTime();
      elapsedTime = stopTime - startTime;
      System.out.println(elapsedTime + "\n");
      grafo.resetNodes();
      System.out.print("DFS \n");
      startTime = System.nanoTime();
      grafo.dfs(a);
      stopTime = System.nanoTime();
      elapsedTime = stopTime - startTime;
      System.out.println(elapsedTime + "\n");
      grafo.resetNodes();
  }
}
