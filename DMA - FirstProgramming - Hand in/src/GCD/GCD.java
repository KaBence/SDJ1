package GCD;

public class GCD
{
  // Euclidean algorithm is the most simple to implement

  public int findGCD1(int a, int b)
  {

    // Implement your method here that uses for loop

    // n=smallest of the numbers
    int c=0; //1 time
    int n=0;//1 time
    if (a<b){ //1 time
      n=a; //1 time
    }
    else{
      n=b;//1 time, we don't really have to look at it because the two states are the same complexity
    }
    for (int i = 1; i <=n; i++) //2n+2
    {
      if (a%i==0&&b%i==0){//4n
        c=i;//n time

      }
    }
    return c;  //1 time
    // T= 1+1+1+2n+2+4n+n+1=O(n)
  }

  public int findGCD2(int a, int b)
  {
    // Implement your method here that uses a while loop
    int c=0;//1 time
    while (b!=0){// log n times
      c=a%b;
      a=b;
      b=c;
    }
    return a;//1 time
    // T= O(log n)
  }

  public int findGCD3(int a, int b)
  {

    // Implement your method here that uses for loop

      if (b==0){//1 time
        return a;//1 time
      }
      else return findGCD3(b, a % b);//1 return, 1 modulus, 1 recursive call
      //T=1+1+1+1+t(log n)= O(log n)
      /*if (a > b && b > 0)
      {
        if (b % a == 0)
          return b;
        else
          return findGCD3(b, a % b);
      }
      else
      {
        if (a % b == 0)
          return a;
        else
          return findGCD3(a, b % a);

    }*/
  }
}
