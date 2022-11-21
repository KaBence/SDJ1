package squareMultiply;

import java.util.ArrayList;

public class squareMultiply
{
  public int modExpoCalculator(int base, int exponent, int modulo)
  {

    // Implement method here
    ArrayList<Integer> bits=new ArrayList<Integer>();//1 time
    int dec=exponent;//1 time
    while(dec>0){//log n times
      bits.add(dec%2);//2*log n time
      dec=dec/2;//2*log n time
    }
    int temp=base;//1time
    for (int i = bits.size()-2; i>=0; i--)//2*log n +2
    {
      if (bits.get(i)==1)temp=(int)(Math.pow(temp,2)*base)%modulo;//6*log n
      else temp=(int)Math.pow(temp,2)%modulo;//3*log n time
    }
    return temp;//1time
    //T(n)=1+1+log n+2*log n+2*log n+1+2*log n +2+6*log n+3*log n+1=O(log n)
  }
}
