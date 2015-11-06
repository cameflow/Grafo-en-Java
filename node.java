import java.util.*;

public class Node implements Comparable{
    private int mId;
    private boolean mVisited;
    private int distance;
    private int parentId;

    private static int sCounter = 0;

    //-----------Constructors----------//
    public Node(){
        this.mId = ++sCounter;
        this.mVisited = false;
        this.distance = 999999;
    }

    //-----------Setters-------------//
    public void setVisited(boolean visited){
        this.mVisited = visited;
    }
    public void setNodeDistance(int d){
        this.distance = d;
    }
    public void setParentId(int pId){
        this.parentId = pId;
    }

    //-------------Getters----------//
    public int getId(){
        return mId;
    }
    public boolean isVisited(){
        return mVisited;
    }
    public int getNodeDistance(){
        return distance;
    }
    public int getParentId(){
        return parentId;
    }

    @Override
    public int compareTo(Object compareNode) {
		    int compareDistance = ((Node)compareNode).getNodeDistance();

		//ascending order
		  return this.distance - compareDistance;

		//descending order
		//return compareDistance - this.distance;
	}

  // public static Comparator<Node> NodeDistanceComparator = new Comparator<Node>() {
  //
	//     public int compare(Node node1, Node node2) {
  //
	//       int nodeDistance1 = node1.getNodeDistance();
	//       int nodeDistance2 = node2.getNodeDistance();
  //
	//       //ascending order
	//       return nodeDistance1.compareTo(node2);
  //
	//       //descending order
	//       //return fruitName2.compareTo(fruitName1);
	//     }
  //
	// };

}
