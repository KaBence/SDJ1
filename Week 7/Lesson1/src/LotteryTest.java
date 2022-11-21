import java.util.Scanner;

public class LotteryTest
{
  public static void main(String[] args)
  {
    Scanner k=new Scanner(System.in);
    Lottery l=new Lottery();
    int[] temp=new int[5];
    System.out.println("Tell me your numbers: ");
    for (int i = 0; i < temp.length; i++)
    {
      temp[i]=k.nextInt();
      k.nextLine();
    }
    l.usersNumbers(temp);
    Integer[] matched=l.compare();
    System.out.print("Common numbers: ");
    for(Integer item : matched){
      System.out.print(item+" ");
    }
  }
}
