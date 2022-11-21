public class Lesson_1
{


  public static void main(String[] args)
  {

    //sdj_exercises01.pdf

    String name="Bence Kabály";
    int age=19;
    double annualPay=100000;
    System.out.println("My name is "+name+", my age is "+age+" and I hope to earn $"+annualPay+" per year.");

    String firstName="Bence",lastName="Kabály";
    char firstInitial='B',lastInitial='K';
    System.out.println(firstName+" "+lastName);
    System.out.println(firstInitial+" "+lastInitial);
    System.out.println("");
    System.out.println(firstName+" "+lastName+""
        + "\nKamtjatka 13, Horsens 8700"
        + "\n+36305582609"
        + "\nSystem Operator "
        + "\n");

    int FN=19,SN=89;
    int total=FN+SN;
    System.out.println(total);

    double firstTax=80,secondTax=140,thirdTax=230;
    double totalCost=0;
    firstTax*=1.25;
    secondTax*=1.25;
    thirdTax*=1.25;
    System.out.println(firstTax);
    System.out.println(secondTax);
    System.out.println(thirdTax);
    System.out.println("");

    double radius=22.5;
    System.out.println(2*radius*Math.PI);
    System.out.println(Math.PI*Math.pow(radius,2));
    int x = 7 + 3 * 6 / 2 - 1;
    int y = 2 % 2 + 2 * 2 - 2 / 2;
    int z = (3 * 9 * ( 3 + ( 9 * 3 / ( 3 ) ) ) );
    System.out.println(x+"\n"+y+"\n"+z+"\n");

    System.out.println("*\n**\n***\n****\n*****\n" );

    System.out.print( "*" );
    System.out.println( "***" );
    System.out.println( "*****" );
    System.out.print( "****" );
    System.out.println( "**" );

  }
}
