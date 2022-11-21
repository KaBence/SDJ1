package Lesson_2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class LoadInitialData
{
  public static void main(String[] args)
  {
    CarList cars=new CarList();
    String[] read=null;
    try
    {
      read=MyFileHandler.readArrayFromTextFile("Cars.txt");
      for (String item : read){
        String[] split=item.split(",");
        cars.addCar(new Car(split[0],split[1],split[2],Integer.parseInt(split[3]),new Owner(split[4],split[5])));
      }
    }
    catch (FileNotFoundException e){
      System.out.println("File not found");
    }
    try
    {
      MyFileHandler.writeToBinaryFile("Cars.bin",cars);
    }
    catch (FileNotFoundException e){
      System.out.println("Error opening file");
    }
    catch (IOException e){
      System.out.println("IO Error");
    }
    System.out.println("Done");
  }
}
