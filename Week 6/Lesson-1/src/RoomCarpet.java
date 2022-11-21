public class RoomCarpet
{
  private RoomDimension size;
  private double cost;

  public RoomCarpet(RoomDimension dim,double cost){
    size=dim;
    this.cost=cost;
  }


  public double cost(){
    return size.getArea()*cost;
  }

  public String toString(){
    return "Size: "+size+"\nCost: "+cost;
  }
}
