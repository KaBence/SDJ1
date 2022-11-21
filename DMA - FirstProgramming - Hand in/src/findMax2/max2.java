package findMax2;
import java.io.*;
import java.util.*;

public class max2
{
  public int findMax2(int[] input)
  {
    // TODO implement method
    int max=0;
    for (int i = 0; i < input.length; i++)
    {
      if (input[i]>max)max=input[i];
    }
    return max;
  }
}
