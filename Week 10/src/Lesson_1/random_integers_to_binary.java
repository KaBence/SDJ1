package Lesson_1;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class random_integers_to_binary
{
  public static void main(String[] args)
  {
    Scanner k=new Scanner(System.in);
    System.out.println("How many integers do you want?");
    Random r=new Random();
    int threshold=k.nextInt();
    int counter=0;
    k.nextLine();
    try
    {
      FileOutputStream fileOut=new FileOutputStream("test.bin");
      ObjectOutputStream write=new ObjectOutputStream(fileOut);
      while (counter<threshold){
        write.writeInt(r.nextInt(100));
        counter++;
      }
      write.close();
    }
    catch (FileNotFoundException e){
      System.out.println("File not found");
      System.exit(1);
    }
    catch (IOException e){
      System.out.println("IO error");
      System.exit(1);
    }
    System.out.println("Done Writing");
    k.close();
  }
}
