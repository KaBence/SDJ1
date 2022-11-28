package maxSubSum;

import java.util.*;

public class maxSubSum
{

  private ArrayList<Integer> list;
  public int findMaxSubSum(ArrayList<Integer> input)
  {
    int size = input.size(); // O(1)
    int previous =0; // variable to store the last biggest sum
    int sum = 0; // variable to store the current sum
    for(int i=0; i<size;i++){
      int a = input.get(i);
      if(a>=0){ // if the input is bigger or equal to 0, we store add it to the sum
        sum+=a;
        if(sum>previous)previous=sum; // if the current sum is bigger than the previous one, we change it to the current one
      }
      else if ((sum+a)<=0){ // if the sum + the input are negative we check if the sum is bigger than the previous one and reset it to 0
        if(sum>previous)previous=sum;
        sum=0;
      }
      else if ((sum+a)>0){ // if the sum + input is bigger than 0  we check either the sub is bigger than the previous and add the input to it
        if(sum>previous)previous=sum;
        sum+=a;
      }
    }
    //this algorithm requires 0(n) time because its checks every input one by one using only one for loop that works checking some conditions
    return previous;
  }
}

