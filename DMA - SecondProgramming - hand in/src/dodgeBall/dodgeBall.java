package dodgeBall;

import java.util.TreeSet;

public class dodgeBall
{
  private TreeSet<Integer> tree=new TreeSet<>();
  private int a=0;
  // Add any private fields you might need here
  public void addPlayer(int x) {
    // Implement your code here to add a player to the line
    tree.add(x);
  }
//One of our group member did the dodgeball differently, so we include that one as well as the 2 version
  public int throwBall(int x) {
    // Implement your code here to update the line of players and return the distance
    if (!tree.isEmpty()){
      if (tree.contains(x)){
        tree.remove(x);
        return 0;
      }
      else
      {
        try
        {
          if (tree.higher(x)-x > x-tree.lower(x))
            a = tree.lower(x);
          else
            a = tree.higher(x);

          if (tree.higher(x)-x==x-tree.lower(x)){
            int temp=x-tree.lower(x);
            tree.remove(tree.lower(x));
            tree.add(x);
            return temp;
          }
        }
        catch (NullPointerException e)
        {
          if (tree.lower(x) == null)
            a = tree.higher(x);
          else
           a = tree.lower(x);
        }
        tree.remove(a);
        tree.add(x);
      }
    }
    if (x>a)return x-a;
    else return a-x;
  }
}
