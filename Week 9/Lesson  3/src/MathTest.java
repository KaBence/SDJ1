import java.util.Scanner;

public class MathTest
{
  public static void main(String[] args)    {
    Scanner k = new Scanner(System.in);
    System.out.println("Enter x: ");
    int x = k.nextInt();
    System.out.println("Enter y: ");

    int y = k.nextInt();
    System.out.println("x + y = " + (x + y));
    System.out.println("x - y = " + (x - y));
    try
    {
      System.out.println("x / y = " + (x / y));
    }
    catch (ArithmeticException e){
      System.out.println("Can't divide by zero");
    }
    System.out.println("x * y = " + (x * y));
  }
}
