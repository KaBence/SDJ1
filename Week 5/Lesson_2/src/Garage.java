public class Garage
{
  private Car first,second;

  public Garage(){
    first=null;
    second=null;
  }

  public boolean isParkingAreaTaken(int position){
    if (position==1) return first!=null;
    else if (position==2) return second!=null;
    else return false;
  }

  public void park(Car car,int position){
    if (!(isParkingAreaTaken(position))){
      if (position==1) first=car;
      else if (position==2) second=car;
    }
  }

  public Car leaveGarage(int position){
    if (isParkingAreaTaken(position)){
      if (position==1) return first;
      else if (position==2) return second;
      else return null;
    }
    else return null;
  }

  public String toString(){
    return "1.Space: "+first+"\n2.Space: "+second;
  }

  public boolean equals(Object obj){
    if (obj==null || getClass()!=obj.getClass()) return false;
    Garage temp=(Garage)obj;
    if (temp.first==null){
      return first == null;
    }
    else if (temp.second==null){
      return second == null;
    }
    else if (first==null){
      return temp.first == null;
    }
    else if (second==null)
    {
      return temp.second == null;
    }
    else return toString().equals(temp.toString());
  }
}
