package Lesson_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Friend_name_From_File
{
  public static void main(String[] args)
  {
    Scanner read=null;
    Scanner k=new Scanner(System.in);
    System.out.print("Type filename: ");
    try
    {
      FileInputStream fileIn=new FileInputStream(k.nextLine());
      read=new Scanner(fileIn);
    }
    catch (FileNotFoundException e){
      System.out.println("File not found");
      System.exit(1);
    }
    System.out.println("Contents of the file:");
    while (read.hasNext()){
      System.out.println(read.nextLine());
    }
    read.close();
    k.close();
  }
}
