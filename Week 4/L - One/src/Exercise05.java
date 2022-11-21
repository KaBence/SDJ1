import java.util.Scanner;

public class Exercise05 {
  public static void main(String[] args){
    Scanner k=new Scanner(System.in);
    String s;
    do
    {
      System.out.println("Tell me a string");
      s=k.nextLine();
      int counter=s.length()-1;
      do
      {
        System.out.print(s.charAt(counter));
        counter--;
      }
      while (counter!=-1);
      System.out.println();
    }
    while (!(s.equals("quit")));


  }


}