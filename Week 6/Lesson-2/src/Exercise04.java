import java.util.Scanner;

public class Exercise04
{
  public static void main(String[] args)
  {
    Scanner k=new Scanner(System.in);
    int[] num=new int[5];
    System.out.println("Tell me 5 numbers: ");
    for(int i=0;i<num.length;i++){
      num[i]=k.nextInt();
    }
    int sum=0;
    for(int item : num){
      sum+=item;
    }
    System.out.println("Average of numbers: "+sum/num.length);
  }
}
