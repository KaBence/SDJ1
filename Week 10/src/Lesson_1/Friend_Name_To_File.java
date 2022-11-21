package Lesson_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Friend_Name_To_File
{
  public static void main(String[] args)
  {
    Scanner k=new Scanner(System.in);
    PrintWriter write=null;
    System.out.print("Type filename: ");
    try
    {
      FileOutputStream fileOut=new FileOutputStream(k.nextLine());
      write=new PrintWriter(fileOut);
    }
    catch (FileNotFoundException e){
      System.out.println("File not found");
      System.exit(1);
    }
    String temp="";
    while (true){
      System.out.print("Type name of friend: ");
      temp=k.nextLine();
      if ((temp.equals("DONE"))){
        break;
      }
      write.println(temp);
    }
    write.close();
    System.out.println("Done writing");
  }
}
