import java.util.Scanner;

public class GeometryTest
{
  public static void main(String[] args){
    Scanner k=new Scanner(System.in);
    System.out.println("Geometry Calculator");
    System.out.println("1. Calculate the Area of a Circle");
    System.out.println("2. Calculate the Area of a Rectangle");
    System.out.println("3. Calculate the Area of a Triangle");
    System.out.println("4. Quit");
    int choice=0;
    do
    {
      System.out.print("Enter your choice: ");
      choice=k.nextInt();
    }
    while (choice>0&&choice<5);
  }
}
