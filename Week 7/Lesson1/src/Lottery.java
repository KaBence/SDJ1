import java.util.ArrayList;
import java.util.Random;

public class Lottery
{
  private int[] lotteryNumbers;
  private int[] users;

  public Lottery(){
    Random r=new Random();
    lotteryNumbers=new int[5];
    for (int i = 0; i < lotteryNumbers.length; i++)
    {
      lotteryNumbers[i]=r.nextInt(10);
    }
  }

  public void usersNumbers(int[] numbers){
    users=new int[5];
    if (numbers.length==5){
      users=numbers;
    }
  }

  public Integer[] compare(){
    ArrayList<Integer> lista=new ArrayList<Integer>();

    for (int i = 0; i < lotteryNumbers.length; i++)
    {
      for (int j = 0; j < users.length; j++)
      {
        if (users[j]==lotteryNumbers[i]) lista.add(j);
      }
    }
    Integer[] match=lista.toArray(new Integer[lista.size()]);
    return match;
  }

  public int[] copy(){
    int[] temp=new int[4];
    for (int i = 0; i < lotteryNumbers.length; i++)
    {
      temp[i]=lotteryNumbers[i];
    }
    return temp;
  }
}
