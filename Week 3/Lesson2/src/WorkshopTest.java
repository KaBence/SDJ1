import java.util.Scanner;

public class WorkshopTest
{
  public static void main(String[] args){
    Scanner k=new Scanner(System.in);
    System.out.print("Type an integer: ");
    int first=k.nextInt();
    System.out.print("Type the second integer: ");
    int second=k.nextInt();
    System.out.print("Type the third integer: ");
    int third=k.nextInt();
    System.out.print("Type the fourth integer: ");
    int fourth=k.nextInt();
    System.out.println("Sum of ("+first+" + "+second+") is "+(first+second));
    System.out.println("Product of ("+second+" * "+third+") is "+(second*third));
    System.out.println("Difference of ("+third+" - "+fourth+") is "+(third-fourth));
    System.out.println("Quotient of ("+fourth+" / "+first+") is "+((double)fourth/first));
  }
}
