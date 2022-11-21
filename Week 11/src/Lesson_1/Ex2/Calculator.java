package Lesson_1.Ex2;

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

import java.security.PrivateKey;

public class Calculator extends Application
{
  private Scene scene;
  private BorderPane mainPane;
  private FlowPane flowPane;
  private GridPane gridPane;

  private TextField input;
  private Btn Button0,ButtonDot,ButtonEq;
  private Button ButtonPlus,ButtonMin,ButtonMult,ButtonDiv,Button7,Button8,Button9,Button4,Button5,Button6,Button1,Button2,Button3;

  public void start(Stage window){
    window.setTitle("Calculator");

    input=new TextField();
    flowPane=new FlowPane();
    flowPane.getChildren().add(input);

    gridPane=new GridPane();

    Button0=new Btn("0");
    ButtonDot=new Btn(".");
    ButtonEq=new Btn("=");
    ButtonPlus=new Button("+");
    ButtonMin=new Button("-");
    ButtonMult=new Button("*");
    ButtonDiv=new Button("/");
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
    gridPane.addRow(3,Button0,ButtonDot,ButtonEq,ButtonPlus);

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


}
