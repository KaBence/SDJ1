package Lesson_2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CarModelManager
{
  private String filename;

  public CarModelManager(String filename){
    this.filename=filename;
  }

  public CarList getAllCars()
  {
    CarList temp=null;
    try
    {
      temp=(CarList) MyFileHandler.readFromBinaryFile("Cars.bin");
    }
    catch (FileNotFoundException e){
      System.out.println("File not found");
    }
    catch (ClassNotFoundException e){
      System.out.println("Class not found");
    }
    catch (IOException e){
      System.out.println("IO error");
    }
    return temp;
  }

  public void addCar(Car car){
    CarList temp=getAllCars();
    temp.addCar(car);
    try
    {
      MyFileHandler.writeToBinaryFile("Cars.bin",temp);
    }
    catch (FileNotFoundException e){
      System.out.println("File not found");
    }
    catch (IOException e){
      System.out.println("IO error");
    }
  }

  public void addCars(CarList cars){
    CarList temp=getAllCars();
    for (int i = 0; i < cars.size(); i++)
    {
      temp.addCar(cars.getCar(i));
    }
    try
    {
      MyFileHandler.writeToBinaryFile("Cars.bin",temp);
    }
    catch (FileNotFoundException e){
      System.out.println("File not found");
    }
    catch (IOException e){
      System.out.println("IO error");
    }
  }

  public void deleteCar(Car car){
    CarList temp=getAllCars();
    CarList temp2=new CarList();
    for (int i = 0; i < temp.size(); i++)
    {
      if (!temp.getCar(i).equals(car)){
        temp2.addCar(temp.getCar(i));
      }
    }
    try
    {
      MyFileHandler.writeToBinaryFile("Cars.bin",temp2);
    }
    catch (FileNotFoundException e){
      System.out.println("File not found");
    }
    catch (IOException e){
      System.out.println("IO error");
    }
  }

  public void deleteCarByRegNumber(String regNumber){
    CarList temp=getAllCars();
    CarList temp2=new CarList();
    for (int i = 0; i < temp.size(); i++)
    {
      if (temp.indexOfRegNumber(regNumber)!=i){
        temp2.addCar(temp.getCar(i));
      }
    }
    try
    {
      MyFileHandler.writeToBinaryFile("Cars.bin",temp2);
    }
    catch (FileNotFoundException e){
      System.out.println("File not found");
    }
    catch (IOException e){
      System.out.println("IO error");
    }
  }
}
