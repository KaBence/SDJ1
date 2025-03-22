package Lesson_1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Student_test
{
  public static void main(String[] args)
  {
    Scanner k=new Scanner(System.in);
    System.out.println("What do you want to do?");
    System.out.println("1 - Write");
    System.out.println("2 - Read");
    System.out.println("3 - Write as xml");
    int choice=k.nextInt();
    ArrayList<Student> students=new ArrayList<>();
    ArrayList<Student> list = new ArrayList<Student>();
    list.add(new Student("Bob", "Bobson", "Denmark"));
    list.add(new Student("Jane", "Doe", "England"));
    list.add(new Student("John", "Doe", "USA"));
    if (choice==1){
      try
      {
        FileOutputStream fileOut=new FileOutputStream("Students.bin");
        ObjectOutputStream write=new ObjectOutputStream(fileOut);
        write.writeObject(new Student("Bence","Kabaly","Hungary"));
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
    }
    else if (choice==2){
      try
      {
        FileInputStream fileIn=new FileInputStream("Students.bin");
        ObjectInputStream read=new ObjectInputStream(fileIn);
        while (true){
          try
          {
            students.add((Student)read.readObject());
          }
          catch (EOFException eof){
            System.out.println("End of File");
            break;
          }
        }
        read.close();
      }
      catch (FileNotFoundException e){
        System.out.println("File not found");
        System.exit(1);
      }
      catch (IOException e){
        System.out.println("IO Error");
        System.exit(1);
      }
      catch (ClassNotFoundException e){
        System.out.println("Class not found");
        System.exit(1);
      }
      for (Student item : students){
        System.out.println(item);
      }
    }
    else if (choice==3)
    {
      try
      {
        FileOutputStream fileOut=new FileOutputStream("studentlist.xml");
        ObjectOutputStream write=new ObjectOutputStream(fileOut);
        write.writeUTF("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        write.writeUTF("<students>");
        for (Student item : list){
          write.writeUTF("<student>");
          write.writeUTF("<firstname>"+item.getFirstName()+"</firstname>");
          write.writeUTF("<lastname>"+item.getLastName()+"</lastname>");
          write.writeUTF("<country>"+item.getCountry()+"</country>");
          write.writeUTF("</student>");
        }
        write.writeUTF("</students>");
        write.close();
      }
      catch (FileNotFoundException e){
        System.out.println("File not found");
      }
      catch (IOException e){
        System.out.println("IO error");
      }
    }
    else{
      System.out.println("Error in selecting choice");
    }
    k.close();
  }
}
