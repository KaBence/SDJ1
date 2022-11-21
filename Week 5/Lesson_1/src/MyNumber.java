public class MyNumber
{
  private int number;

  public MyNumber(int num){
    number=num;
  }

  public int getNumber(){
    return number;
  }

  public int getLastDigit(){
    return Math.abs(number)%10;
  }

  public int getFirstDigit(){
    int temp=11;
    while (temp>10||temp<0) temp=number/10;
    return temp;
  }

  public boolean isDivisibleBy(int div){
    return number%div==0;
  }

  public int numberOfProperDivisors(){
    int counter=0;
    for (int i=1;i<number;i++){
      if (isDivisibleBy(i)) counter++;
    }
    return counter;
  }

  public boolean isPrime(){
    return numberOfProperDivisors()==1;
  }

  public String toString(){
    if (isPrime())return number+" - (Prime)";
    else return number+"";
  }

  public MyNumber plus(MyNumber anotherNumber){
    if (anotherNumber==null) return new MyNumber(number);
    else return new MyNumber(number+anotherNumber.number);
  }

  public boolean isPerfectNumber(){
    int num=0;
    for (int i=1;i<number;i++){
      if (isDivisibleBy(i))num+=i;
    }
    return num==number;
  }
}
