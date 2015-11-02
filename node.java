//Class node of the graph
//Id -->
import java.util.*;

public class Node{
   int id;
   boolean visited = false;
   String data;
   List<Edge> edgeList = new LinkedList();

   //---------------Constructors------------//
   public Node()
   {

   }
   public Node(int i, String da)
   {
     id = i;
     data = da;
     visited = false;
   }

   //----------Functions to set variables------------//
   public void setId(int a)
   {
     id = a;
   }
   public void setVisited()
   {
     if (visited)
     {
       visited = false;
     }
     else
     {
       visited = true;
     }
   }
   public void setData(String dat)
   {
     data = dat;
   }
   public void addEdge(Edge e)
   {
     edgeList.add(e);
   }

   //---------------Functions to get variables---------------//
   public int getId()
   {
     return id;
   }
   public boolean getVisited()
   {
     return visited;
   }
   public String returnData()
   {
     return data;
   }
}
