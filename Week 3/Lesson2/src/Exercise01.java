import java.util.Scanner;

public class Exercise01
{
  public static void main(String[] args){
    Scanner k=new Scanner(System.in);
    int number=0;
    while (number<=0||number>11){
      System.out.println("Tell me a number");
      number=k.nextInt();
      if (number<=0||number>11){
        System.out.println("Wrong number");
      }

    }
    if (number==1){
      System.out.println("I");
    }
    if (number==2){
      System.out.println("II");
    }
    if (number==3){
      System.out.println("III");
    }
    if (number==4){
      System.out.println("IV");
    }
    if (number==5){
      System.out.println("V");
    }
    if (number==6){
      System.out.println("VI");
    }
    if (number==7){
      System.out.println("VII");
    }
    if (number==8){
      System.out.println("VIII");
    }
    if (number==9){
      System.out.println("IX");
    }
    if (number==10){
      System.out.println("X");
    }
  }


}
