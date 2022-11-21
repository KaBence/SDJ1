
import java.util.Scanner;

public class Exercise06
{
  public static void main(String[] args){
    Scanner k=new Scanner(System.in);
    System.out.print("A: ");
    int a=k.nextInt();
    System.out.print("B: ");
    int b=k.nextInt();
    System.out.print("C: ");
    int c=k.nextInt();
    double D= Math.pow((double)b,2)-4*a*c;
    if (D<0){
      System.out.println("There is no solution");
    }
    else if(D==0){
      System.out.println("There is one solution: "+ (-(b/(2*a))));
    }
    else{
      System.out.println("There are two solutions: ");
      System.out.println("First solution:"+ (-b+Math.sqrt(D))/2*a);
      System.out.println("Second solution:"+ (-b-Math.sqrt(D))/2*a);
    }
  }
}
