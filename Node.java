public class Node{
    private int mId;
    private boolean mVisited;
    private String mData;
   
    private static int sCounter = 0; 

    public Node(){
        this("");
    }
   
    public Node(String data){
        this.mId = ++sCounter;
        this.mData = data;
        this.mVisited = false;
    }

    public void setVisited(boolean visited){
        this.mVisited = visited; 
    }
   
    public void setData(String data){
        this.mData = data;
    }
   
    public int getId(){
        return mId;
    }
   
    public boolean isVisited(){
        return mVisited;
    }
    
    public String returnData(){
        return mData;
    }
}
