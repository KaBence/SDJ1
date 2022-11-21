import java.util.Random;
import java.util.Scanner;

public class Exercise06
{
  public static void main(String[] args){
    Random r=new Random();
    Scanner k=new Scanner(System.in);
    int number=r.nextInt(1000);
    int guess;
    int counter=0;
    do
    {
      System.out.print("Guess a number: ");
      guess=k.nextInt();
      k.nextLine();
      if (guess>number) System.out.println("lower");
      if (guess<number) System.out.println("Higher");
      counter++;
    }
    while (number!=guess);
    System.out.println("You found it! the number was: "+ guess+" Attempts: "+counter);
  }
}
