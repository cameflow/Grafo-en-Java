import java.util.*;

public class Node{
    private int mId;
    private boolean mVisited;
    private String mData;
    private List edgeList;

    private static int sCounter = 0;

    //-----------Constructors----------//
    public Node(){
        this("");
        edgeList = new LinkedList();
    }

    public Node(String data){
        this.mId = ++sCounter;
        this.mData = data;
        this.mVisited = false;
    }

    //-----------Setters-------------//
    public void setVisited(boolean visited){
        this.mVisited = visited;
    }
    public void setData(String data){
        this.mData = data;
    }

    //-------------Getters----------//
    public int getId(){
        return mId;
    }
    public boolean isVisited(){
        return mVisited;
    }
    public String returnData(){
        return mData;
    }


    public void addEdge(Edge e){ //Adds an edge to the edge list
        edgeList.add(e);
    }

    public int getEdges(){  //Returns how many edges does the node has
        return edgeList.size();
    }
    public void removeEdge(Edge e){
        int delPos = edgeList.lastIndexOf(e);
        edgeList.remove(delPos);
    }
}
