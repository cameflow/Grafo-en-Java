
public class node{
   int id;
   boolean visited = false;
   String data;

   //---------------Constructors------------//
   public node()
   {

   }
   public node(int i, String da)
   {
     id = i;
     data = da;
     visited = false;
   }

   //----------Functions to set variables------------//
   void setId(int a)
   {
     id = a;
   }
   void setVisited()
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
   void setData(String dat)
   {
     data = dat;
   }

   //---------------Functions to get variables---------------//
   int getId()
   {
     return id;
   }
   boolean getVisited()
   {
     return visited;
   }
   String returnData()
   {
     return data;
   }
}
