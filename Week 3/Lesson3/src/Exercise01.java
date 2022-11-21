import java.util.Random;
import java.util.Scanner;

public class Exercise01
{
  public static void main(String[] args){
    Random r=new Random();
    Scanner k=new Scanner(System.in);
    int randomNumber;
    do
    {
      randomNumber = r.nextInt(10);
    }
    while (randomNumber==0);
    int number=0;
    do{
      System.out.println("What number did I think of?");
      number=k.nextInt();
      System.out.println(randomNumber==number ? "Correct" : "Incorrect");
    }
    while (randomNumber!=number);
  }
}
