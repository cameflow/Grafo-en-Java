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

    //Resets all nodes to visited = false
    public void resetNodes(){
        for(Node node : mNodes){
            node.setVisited(false);
        }
    }

    public void bfs(Node node){
        Queue<Node> queue = new LinkedList<Node>();
        String output = "";
        Node node2;
        node.setVisited(true);
        queue.add(node);
        output = Integer.valueOf(node.getId()).toString();
        while(queue.peek() != null){
          node2 = queue.element();
          queue.remove();
            for (Edge edge : mEdges){
                if (edge.getOrigin().getId() == node2.getId() && edge.getDestination().isVisited() == false){
                    edge.getDestination().setVisited(true);
                    queue.add(edge.getDestination());
                    output = output + Integer.valueOf(edge.getDestination().getId()).toString();
                }
            }
        }
        System.out.print("BFS: " + output + "\n");
    }

    public void dfs(Node node){
        Stack<Node> stack = new Stack<Node>();
        String output = "";
        Node node2;
        boolean found = false;
        node.setVisited(true);
        stack.push(node);
        output = Integer.valueOf(node.getId()).toString();
        while(!stack.empty()){
          node2 = stack.peek();
          found = false;
          for(Edge edge : mEdges){
            if(edge.getOrigin().getId() == node2.getId() && edge.getDestination().isVisited() == false){
                edge.getDestination().setVisited(true);
                stack.push(edge.getDestination());
                output = output + Integer.valueOf(edge.getDestination().getId()).toString();
                found = true;
                break;
            }
          }
          if(!found){
              stack.pop();
          }
        }

        System.out.print("DFS: " + output + "\n");
    }

}
