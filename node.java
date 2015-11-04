import java.util.*;

public class Node{
    private int mId;
    private boolean mVisited;

    private static int sCounter = 0;

    //-----------Constructors----------//
    public Node(){
        this.mId = ++sCounter;
        this.mVisited = false;
    }

    //-----------Setters-------------//
    public void setVisited(boolean visited){
        this.mVisited = visited;
    }

    //-------------Getters----------//
    public int getId(){
        return mId;
    }
    public boolean isVisited(){
        return mVisited;
    }

}
