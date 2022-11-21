import java.util.ArrayList;

public class CircleList
{
  private int capacity;
  private ArrayList<Circle> circles;

  public CircleList(int capacity){
    this.capacity=capacity;
    circles=new ArrayList<>();
  }

  public int getNumberOfCircles(){
    return circles.size();
  }

  public void addCircle(Circle circle){
    if (capacity>circles.size()){
      circles.add(circle);
    }
  }
  public Circle getCircle(int index){
    return circles.get(index);
  }

  public double getTotalArea(){
    double areas=0;
    for (Circle item : circles){
      areas+=item.getArea();
    }
    return areas;
  }

  public double getAverageArea(){
    return getTotalArea()/circles.size();
  }
}
