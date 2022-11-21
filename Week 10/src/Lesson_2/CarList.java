package Lesson_2;

import java.io.Serializable;
import java.util.ArrayList;

public class CarList implements Serializable
{
  private ArrayList<Car> list;
  public CarList(){
    list=new ArrayList<>();
  }

  public int size(){
    return list.size();
  }

  public int indexOfRegNumber(String reg){
    for (int i = 0; i < size(); i++)
    {
      if (list.get(i).getRegNumber().equals(reg))return i;
    }
    return -1;
  }

  public Car getCar(int index){
    return list.get(index);
  }

  public Car getCar(String reg){
    if (indexOfRegNumber(reg)==-1) return null;
    return list.get(indexOfRegNumber(reg));
  }

  public void addCar(Car car){
    if (indexOfRegNumber(car.getRegNumber())==-1){
      list.add(car);
    }

  }

  public String toString(){
    String temp="";
    int counter=0;
    while (counter<size()){
      temp+=getCar(counter)+"\n";
      counter++;
    }
    return temp;
  }
}
