public class Edge{
  Node origin;
  Node destiny;
  int weight;

  //---------------Constructors------------//
  public Edge()
  {

  }
  public Edge(Node o, Node d, int w)
  {
    origin = o;
    destiny = d;
    weight = w;
  }

  //----------Functions to set variables------------//
  public void setOrigin(Node o)
  {
    origin = o;
  }
  public void setDestiny(Node d)
  {
    destiny = d;
  }
  public void setWeight(int w)
  {
    weight = w;
  }

  //---------------Functions to get variables---------------//
  public Node getOrigin()
  {
    return origin;
  }
  public Node getDestiny()
  {
    return destiny;
  }
  public Node getWeight()
  {
    return weight;
  }

}
