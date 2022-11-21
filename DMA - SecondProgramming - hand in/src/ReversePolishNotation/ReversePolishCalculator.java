package ReversePolishNotation;

import java.util.*;

public class ReversePolishCalculator
{
  private final Deque<Integer> stack = new ArrayDeque<>();//1

  //This push() takes an integer and pushes into a stack
  public void push(int n) {
    stack.push(n); //This takes 1
  }


  public void plus() {

    int num1 = stack.pop(); //1
    int num2 = stack.pop(); //1
    int total = num1 + num2;//1
    stack.push(total); //1
  }


  public void minus() {

    int num1 = stack.pop();//1
    int num2 = stack.pop();//1
    int total = num2 - num1;//1
    stack.push(total);//1
  }


  public void times() {
    int num1 = stack.pop();//1
    int num2 = stack.pop();//1
    int total = num1 * num2;//1
    stack.push(total);//1
  }


  public int read() {

    return stack.peek();//1
  }
}

//T(n) = 15 = O(1)
