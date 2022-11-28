package inversions;

import java.io.*;
import java.util.*;

public class Inversions
{
  public int countInversions(ArrayList<Integer> input) {
        // Implement your code here to return the number of inversions in input!
    int counter=0;
    for (int i = 0; i < input.size()-1; i++)
    {
      for (int j = i+1; j < input.size(); j++)
      {
        if (input.get(i)>input.get(j)) counter++;
      }
    }
        return counter;// Time complexity is O(N to the power of 2) because we use two for loops to go through the list
    }
}

