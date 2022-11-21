package BalancedParenthesisChecking;

import java.util.*;

public class parenthesis
{
  public boolean checkParentheses(ArrayList<Character> input)
  {
    // TODO Insert your method here and update the return statement
    Stack<Character> ymca = new Stack();//1
    for (int i = 0; i < input.size(); i++)//2n+2
    {
      if (ymca.empty())
        ymca.push(input.get(i));
      else if (ymca.peek() =='(')
      {
        if (input.get(i)== ')')
        {
          ymca.pop();
        }
        else
        {
          ymca.push(input.get(i));

        }
      }
      else if (ymca.peek()== '[')
      {
        if (input.get(i)== ']')
        {
          ymca.pop();
        }
        else
        {
          ymca.push(input.get(i));
        }

      }


    }
    //Big o : O(n)

    return ymca.empty();
  }
}
