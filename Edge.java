public class Edge{
    private Node origin;
    private Node destination;
    private int weight;

    //------------Constructors----------//
    public Edge(){
        origin = new Node();
    }
    public Edge(Node origin, Node destination, int weight){
        this.origin = origin;
        this.destination = destination;
        this.weight = weight;
    }

    //----------Setters--------------//
    public void setOrigin(Node node){
        this.origin = node;
    }
    public void setDestination(Node node){
        this.destination = node;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }


    //------------Getters-------------//
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
