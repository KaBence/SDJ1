import java.util.Locale;
import java.util.Scanner;

public class Lesson_2
{
  public static void  main(String[] args)
  {
    //sdj_exercises02.pdf
    Scanner keyboard=new Scanner(System.in);
    /*
    System.out.println("What is your name?");
    String name=keyboard.nextLine();
    System.out.println("What is your favourite city");
    String city=keyboard.nextLine();
    System.out.println("number or character in the city name: "+city.length());
    System.out.println("name of the city in all uppercase letters: "+city.toUpperCase());
    System.out.println("name of the city in all lowercase letters: "+city.toLowerCase());
    System.out.println("First character in the name of the city: "+city.charAt(0));

    System.out.println("Can you give me three numbers?");
    int firstNumber=keyboard.nextInt();
    int secondNumber=keyboard.nextInt();
    int thirdNumber=keyboard.nextInt();
    System.out.println("Sum of three numbers: "+ (firstNumber+secondNumber+thirdNumber));
    System.out.println("Product of three numbers: "+ (firstNumber*secondNumber*thirdNumber));

    System.out.println("What is the sales tax?");
    double tax=keyboard.nextDouble();
    tax/=100;
    tax+=1;
    System.out.println("Give me three items prices");
    double firstItem=keyboard.nextDouble();
    double secondItem=keyboard.nextDouble();
    double thirdItem=keyboard.nextDouble();
    System.out.println("Total price of the first item: "+firstItem*tax);
    System.out.println("Total price of the second item: "+secondItem*tax);
    System.out.println("Total price of the third item: "+thirdItem*tax);

    System.out.println("What is your name?");
    String name=keyboard.nextLine();
    System.out.println("What is your age?");
    int age=keyboard.nextInt();
    System.out.println("what is your address?");
    keyboard.nextLine();
    String address=keyboard.nextLine();
    System.out.println("\tYour name: "+name+"\n\tYour age:"+age+"\n\tYour address"+address);

    System.out.println("Give me three scores:");
    double firstScore=keyboard.nextDouble(),secondScore=keyboard.nextDouble(),thirdScore=keyboard.nextDouble();
    System.out.println("Test Scores:"+"\n\t"+firstScore+"\n\t"+secondScore+"\n\t"+thirdScore);
    System.out.println("Average of the test scores: "+ ((firstScore+secondScore+thirdScore)/3));

    System.out.println("What is your name?");
    String NAME=keyboard.nextLine();
    System.out.println("What is your age?");
    int AGE=keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("What is the name of the city?");
    String CITY=keyboard.nextLine();
    System.out.println("What is the name of the college?");
    String COLLEGE=keyboard.nextLine();
    System.out.println("What is the name of the profession?");
    String PROFESSION=keyboard.nextLine();
    System.out.println("tell me a pet type");
    String ANIMAL=keyboard.nextLine();
    System.out.println("Tell me the pet's name");
    String PETNAME=keyboard.nextLine();
    System.out.println("There once was a person named "+NAME+" who lived in "+CITY+". At the age of "+AGE+","
        + " "+NAME+" went to college at "+COLLEGE+". "+NAME+" graduated and went to work as a "+PROFESSION+"."
        + " Then, "+NAME+" adopted a(n) "+ANIMAL+" named "+PETNAME+". They both lived happily ever after!");

    int shares=1000;
    double firstPrice=32.87;
    final double comission=0.02;
    double secondPrice=33.92;
    System.out.println("Joe paid for the stocks: $"+(shares*firstPrice));
    System.out.println("Joe paid to his broker for the shares: $"+((shares*firstPrice)*comission));
    System.out.println("Joe Sold his stocks for: $"+(shares*secondPrice));
    System.out.println("Joe paid to his broker after he sold the stocks: $"+((shares*secondPrice)*comission));
    System.out.println("Joe's profit was: "+(((shares*secondPrice)*(1-comission))-(shares*firstPrice)*(1-comission)));
    */
    System.out.println("Amount of bought shares");
    int boughtShares=keyboard.nextInt();
    System.out.println("Price of one bought share");
    double firstPrice= keyboard.nextDouble();
    System.out.println("Amount of sold shares");
    int soldShares=keyboard.nextInt();
    System.out.println("Commission of the broker");
    final double comission=(keyboard.nextDouble()/100);
    System.out.println("Price of one sold share");
    double secondPrice=keyboard.nextDouble();
    System.out.println("You paid for the stocks: $"+(boughtShares*firstPrice));
    System.out.println("You paid to his broker for the shares: $"+((boughtShares*firstPrice)*comission));
    System.out.println("You Sold his stocks for: $"+(soldShares*secondPrice));
    System.out.println("You paid to his broker after he sold the stocks: $"+((soldShares*secondPrice)*comission));
    System.out.println("Your profit was: "+(((soldShares*secondPrice)-(soldShares*secondPrice*comission)-(boughtShares*firstPrice*comission)-(boughtShares*firstPrice))));

    System.out.println("   *   ");
    System.out.println("  ***  ");
    System.out.println(" ***** ");
    System.out.println("*******");
    System.out.println(" ***** ");
    System.out.println("  ***  ");
    System.out.println("   *   ");
  }
}
