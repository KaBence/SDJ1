import java.util.Scanner;

public class Exercise04
{
  public static void main(String[] args){
    Scanner k =new Scanner(System.in);
    System.out.println("Which exercise?");
    int number=k.nextInt();
    if (number==1){
      k.nextLine();
      System.out.println("Tell me two numbers: ");
      int first=k.nextInt();
      int second=k.nextInt();
      if (first<second){
        System.out.println("Smallest number is: "+first);
      }
      else System.out.println("Smallest number is: "+second);
    }
    else if (number==2){
      k.nextLine();
      System.out.println("Tell me two numbers: ");
      int first=k.nextInt();
      int second=k.nextInt();
      if (first<second){
        System.out.println("Numbers in order"+first+" "+second);
      }
      else System.out.println("Numbers in order: "+second+" "+ first);
    }
    else if (number==3){
      k.nextLine();
      System.out.println("Tell me three numbers: ");
      int first=k.nextInt();
      int second=k.nextInt();
      int third=k.nextInt();
      if (first<second&& first<third){
        if (second<third) System.out.println("Numbers in order:"+first+" "+second+" "+third);
        else System.out.println("Numbers in order:"+first+" "+third+" "+second);
      }
      if (second<first &&second<third){
        if (first<third) System.out.println("Numbers in order:"+second+" "+first+" "+third);
        else System.out.println("Numbers in order:"+second+" "+third+" "+first);
      }
      if (third<first&&third<second){
        if (first<second) System.out.println("Numbers in order:"+third+" "+first+" "+third);
        else System.out.println("Numbers in order:"+third+" "+second+" "+first);
      }
    }
    else System.out.println("Error");



  }
}
