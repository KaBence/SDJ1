package extendedEA;
import java.util.Scanner;

// This is a dependent class whose methods are used by
// extendedEA

public class GCD
{

  public static int findGCD(int a, int b)
  {
    // Copy your favorite GCD method from Program 1 here
    // n=smallest of the numbers
    int c=0; //1 time
    int n=0;//1 time
    if (a<b){ //1 time
      n=a; //1 time
    }
    else{
      n=b;//1 time, we don't really have to look at it because the two states are the same complexity
    }
    for (int i = 1; i <=n; i++) //2n+2
    {
      if (a%i==0&&b%i==0){//4n
        c=i;//n time

      }
    }
    return c;  //1 time
    // T= 1+1+1+2n+2+4n+n+1=O(n)
  }

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int x, y;
    System.out.println("Give two integers to calculate their gcd: ");
    x = input.nextInt();
    y = input.nextInt();
    System.out.println("GCD of " + x + " and " + y + " is: " + findGCD(x, y));
    input.close();
  }

}
