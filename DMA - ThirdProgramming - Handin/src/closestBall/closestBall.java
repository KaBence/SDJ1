package closestBall;
import java.util.*;

public class closestBall
{
  public int computeClosest(ArrayList<Integer> players,
      ArrayList<Integer> balls)
  {
    // TODO implement method
    Collections.sort(players);
    Collections.sort(balls);
    int result=999;
    for (int i = 0; i < players.size(); i++)
    {

      int temp=999;
      for (int j = 0; j < balls.size(); j++)
      {
        if ((Math.abs(players.get(i)-balls.get(j))>temp)){
          break;
        }
        else if ((Math.abs(players.get(i)-balls.get(j))<temp)){
          temp=Math.abs(players.get(i)-balls.get(j));
        }
      }
      if (temp<result)result=temp;
    }
    return result;
  }
}
//Because of the break, the nested loop doesn't go through everything, so it is not n squared, and the sorting takes more time than the 2 loop
// So the time complexity is O(N log N + M log M)
