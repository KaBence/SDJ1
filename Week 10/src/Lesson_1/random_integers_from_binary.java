package Lesson_1;

import java.io.*;

public class random_integers_from_binary
{
  public static void main(String[] args)
  {
    try
    {
      FileInputStream fileIn=new FileInputStream("test.bin");
      ObjectInputStream read=new ObjectInputStream(fileIn);
      while (true){
        try
        {
          System.out.println(read.readInt());
        }
        catch (EOFException eof){
          System.out.println("End of File");
          break;
        }
      }
    }
    catch (FileNotFoundException e){
      System.out.println("File not found");
      System.exit(1);
    }
    catch (IOException e){
      System.out.println("IO error");
      System.exit(1);
    }
  }
}
