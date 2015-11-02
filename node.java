//Class node of the graph
//Id -->

public class Node{
   int id;
   boolean visited = false;
   String data;

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
