package Lesson_2.Ex1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.*;

public class Calculator extends Application
{
  private Scene scene;
  private BorderPane mainPane;
  private FlowPane flowPane;
  private GridPane gridPane;

  private TextField input;
  private Btn ButtonMult,ButtonEq,ButtonDiv,ButtonMin,ButtonPlus;
  private Button ButtonC, Button0,Button7,Button8,Button9,Button4,Button5,Button6,Button1,Button2,Button3;

  private MyListener listener;

  Deque<Integer> queue=new ArrayDeque<Integer>();
  Queue<Integer> equation=new LinkedList<>();

  public void start(Stage window){
    window.setTitle("Calculator");

    listener=new MyListener();

    input=new TextField();
    flowPane=new FlowPane();
    flowPane.getChildren().add(input);
    flowPane.setPrefWidth(160);

    gridPane=new GridPane();

    Button0=new Button("0");
    ButtonC=new Button("C");
    ButtonEq=new Btn("=");
    ButtonPlus=new Btn("+");
    ButtonMin=new Btn("-");
    ButtonMult=new Btn("*");
    ButtonDiv=new Btn("/");
    Button7=new Button("7");
    Button8=new Button("8");
    Button9=new Button("9");
    Button4=new Button("4");
    Button5=new Button("5");
    Button6=new Button("6");
    Button1=new Button("1");
    Button2=new Button("2");
    Button3=new Button("3");

    gridPane.addRow(0,Button7,Button8,Button9,ButtonDiv);
    gridPane.addRow(1,Button4,Button5,Button6,ButtonMult);
    gridPane.addRow(2,Button1,Button2,Button3,ButtonMin);
    gridPane.addRow(3,Button0,ButtonC,ButtonEq,ButtonPlus);

    for (Node item:gridPane.getChildren()){
      ((Button)item).setOnAction(listener);
    }

    for (int i = 3; i < gridPane.getChildren().size(); i++)
    {
      ((Button)gridPane.getChildren().get(i)).setPrefSize(60,50);
    }

    mainPane=new BorderPane();

    mainPane.setTop(flowPane);
    mainPane.setCenter(gridPane);

    scene=new Scene(mainPane);
    window.setScene(scene);
    window.show();
  }
  private class MyListener implements EventHandler<ActionEvent>{
    public void handle(ActionEvent e){
      if (e.getSource()==ButtonPlus){
        queue.add(Integer.valueOf(input.getText()));
        equation.add(1);
        input.clear();
      }
      else if (e.getSource()==ButtonMin){
        queue.add(Integer.valueOf(input.getText()));
        equation.add(2);
        input.clear();
      }
      else if (e.getSource()==ButtonMult){
        queue.add(Integer.valueOf(input.getText()));
        equation.add(3);
        input.clear();

      }
      else if (e.getSource()==ButtonDiv){
        queue.add(Integer.valueOf(input.getText()));
        equation.add(4);
        input.clear();
      }
      else if (e.getSource()==ButtonC){
        queue.clear();
        equation.clear();
        input.clear();
      }
      else if (e.getSource()==ButtonEq)
      {
        queue.add(Integer.valueOf(input.getText()));
        while (queue.size() > 1)
        {
          int temp = equation.poll();
          if (temp == 1) queue.offerFirst(queue.poll() + queue.poll());
          else if (temp == 2) queue.offerFirst(queue.poll() - queue.poll());
          else if (temp == 3) queue.offerFirst(queue.poll() * queue.poll());
          else if (temp == 4) queue.offerFirst(queue.poll() / queue.poll());
        }
        input.setText(String.valueOf(queue.poll()));
      }
      else{
        for (Node item : gridPane.getChildren())
        {
          if (e.getSource() == (Button) item)
            input.setText(input.getText() + ((Button) item).getText());
        }
      }
      }
    }
  }

