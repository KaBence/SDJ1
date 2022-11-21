package Lesson_3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.*;

public class Controller
{
  @FXML private Button ButtonC,Button0,Button7,Button8,Button9,Button4,Button5,Button6,Button1,Button2,Button3,ButtonMult,ButtonEq,ButtonDiv,ButtonMin,ButtonPlus;
  @FXML private TextField text;

  Deque<Integer> queue=new ArrayDeque<Integer>();
  Queue<Integer> equation=new LinkedList<>();

  public void Handle(ActionEvent e)
  {
    if (e.getSource() == Button0) text.setText(text.getText()+"0");
    else if (e.getSource() == Button1) text.setText(text.getText()+"1");
    else if (e.getSource() == Button2) text.setText(text.getText()+"2");
    else if (e.getSource() == Button3) text.setText(text.getText()+"3");
    else if (e.getSource() == Button4) text.setText(text.getText()+"4");
    else if (e.getSource() == Button5) text.setText(text.getText()+"5");
    else if (e.getSource() == Button6) text.setText(text.getText()+"6");
    else if (e.getSource() == Button7) text.setText(text.getText()+"7");
    else if (e.getSource() == Button8) text.setText(text.getText()+"8");
    else if (e.getSource() == Button9) text.setText(text.getText()+"9");
    else if (e.getSource()==ButtonPlus){
        queue.add(Integer.valueOf(text.getText()));
        equation.add(1);
        text.clear();
    }
    else if (e.getSource()==ButtonMin){
      queue.add(Integer.valueOf(text.getText()));
      equation.add(2);
      text.clear();
    }
    else if (e.getSource()==ButtonMult){
      queue.add(Integer.valueOf(text.getText()));
      equation.add(3);
      text.clear();

    }
    else if (e.getSource()==ButtonDiv){
      queue.add(Integer.valueOf(text.getText()));
      equation.add(4);
      text.clear();
    }
    else if (e.getSource()==ButtonC){
      queue.clear();
      equation.clear();
      text.clear();
    }
    else if (e.getSource()==ButtonEq){
      queue.add(Integer.valueOf(text.getText()));
      while (queue.size()>1){
        int temp=equation.poll();
        if(temp==1) queue.offerFirst(queue.poll() + queue.poll());
        else if(temp==2) queue.offerFirst(queue.poll() - queue.poll());
        else if(temp==3) queue.offerFirst(queue.poll() * queue.poll());
        else if(temp==4) queue.offerFirst(queue.poll() / queue.poll());
      }
      text.setText(String.valueOf(queue.poll()));
    }
  }
}
