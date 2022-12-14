package decToBinary;

import java.util.ArrayList;
import java.util.Scanner;

public class dec2Bin
{
  public static String convertDec2Bin(int n)
  {
    // We initialise an output as a string
    String binaryNum = "";

    // We throw an exception if there is an illegal input
    if (n < 0)
      throw new IllegalArgumentException();

    // TODO implement method
    ArrayList<Integer> bits=new ArrayList<Integer>();
    while(n>0){
      bits.add(n%2);
      n=n/2;
    }
    for (int i = bits.size()-1; i >=0; i--)
    {
      binaryNum+=bits.get(i);
    }
    return binaryNum;
  }

  public static void main(String[] args)
  {
    while (true)
    {
      System.out.println("Type input:");
      Scanner in = new Scanner(System.in);
      int read = in.nextInt();
      System.out.println(convertDec2Bin(read));
      System.out.println();
    }
  }
}
