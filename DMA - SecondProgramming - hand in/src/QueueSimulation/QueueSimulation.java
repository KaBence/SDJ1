package QueueSimulation;

import java.util.*;

public class QueueSimulation
{
  public int simulate(ArrayList<Integer> input)
  {
    // TODO Insert your method here and update the return statement
    Queue<Integer> queue = new LinkedList<>(); // 1
    for (int item: input){//2n+2
      queue.add(item);//n
    }
    //whole for loop is 3n+2

    while(queue.size()!=1){ // we take 2 out but adding one back, so it the queue decreases by one everytime so this takes O(n) times
        int a= queue.poll();  //1
        int b= queue.poll();  //1
        queue.add(b); //1
      }
    return queue.poll();// takes 1

    // Big O : O(n)
  }
}
