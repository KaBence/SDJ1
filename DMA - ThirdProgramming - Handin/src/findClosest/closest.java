package findClosest;

import java.util.*;

public class closest
{

  public int findClosest(ArrayList<Integer> input)
  {
    // TODO implement method
    Collections.sort(input);
    int temp=Math.abs(input.get(0)-input.get(1));
    for (int i = 0; i < input.size()-1; i++)
    {
      if (Math.abs(input.get(i)-input.get(i+1))<temp){
        temp=Math.abs(input.get(i)-input.get(i+1));
      }
    }
    return temp;
  }
  // 1 for loop takes O(n) but because of the sort this will still take  O(n log n)
}