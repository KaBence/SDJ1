import java.util.Scanner;


public class Exercise02
{
  public static void main(String[] args){
    Scanner k=new Scanner(System.in);
    System.out.print("Gender: ");
    char g=k.nextLine().charAt(0);
    System.out.println("What is your age?");
    int age=k.nextInt();
    if (g!='F' && g!='M'|| age<0){
      System.out.println("Error in typed values");
    }
    else if(g=='M' && age<18){
      System.out.println("Boy");
    }
    else if (g=='M' && age>=18){
      System.out.println("Man");
    }
    else if (g=='F'&& age <18){
      System.out.println("Girl");
    }
    else if(g=='F' && age >=18){
      System.out.println("Woman");
    }
  }
}
