
public class node{
   int id;
   boolean visited = false;
   String data;


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
