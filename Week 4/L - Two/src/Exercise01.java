import java.util.Scanner;

public class Exercise01
{
  public static void main(String[] args){
    Scanner k=new Scanner(System.in);
    String user;
    String pass;
    String passC;
    do
    {
      System.out.print("Username: ");
      user=k.nextLine();
      System.out.print("Password: ");
      pass=k.nextLine();
      System.out.print("Password confirmation: ");
      passC=k.nextLine();
    }
    while (!(pass.equals(passC)));
    System.out.println("user: "+user);
    System.out.println("pass: "+pass);
  }
}
