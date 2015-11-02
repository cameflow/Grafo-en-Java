public class Edge{
    private Node origin;
    private Node destination;
    private int weight;

    public Edge(){
        origin = new Node(); 
    }
    
    public Edge(Node origin, Node destination, int weight){
        this.origin = origin;
        this.destination = destination;
        this.weight = wweight;
    }

    public void setOrigin(Node node){
        this.origin = node;
    }
    
    public void setDestination(Node node){
        this.destination = node;
    }
    
    public void setWeight(int weight){
        this.weight = weight;
    }
  
    public Node getOrigin(){
        return origin;
    }
  
    public Node getDestination(){
        return destination;
    }
    
    public int getWeight(){
        return weight;
    }

}
