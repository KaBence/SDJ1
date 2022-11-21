package Lesson_1.Ex1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Align extends Application
{
  private Scene scene;
  private HBox mainPane;
  private Label XLabel;
  private Label YLabel;
  private TextField XText;
  private TextField YText;
  private CheckBox Exit1;
  private CheckBox Exit2;
  private Button OK;
  private Button Cancel;
  private Button Clear;

  private VBox CBoxes;
  private GridPane Fields;
  private VBox Btns;

  public void start(Stage window){
    window.setTitle("Align");

    Exit1=new CheckBox("Exit on OK");
    Exit2=new CheckBox("Exit on Cancel");
    CBoxes=new VBox(10);
    CBoxes.getChildren().addAll(Exit1,Exit2);

    CBoxes.setAlignment(Pos.CENTER_LEFT);
    CBoxes.setPadding(new Insets(0,0,0,10));


    XLabel=new Label("X: ");
    XText=new TextField();
    XText.setPrefWidth(50);
    YLabel=new Label("Y: ");
    YText=new TextField();
    YText.setPrefWidth(50);
    Fields=new GridPane();
    Fields.addRow(0,XLabel,XText);
    Fields.addRow(1,YLabel,YText);
    Fields.setAlignment(Pos.CENTER_LEFT);

    OK=new Button("OK");
    OK.setPrefWidth(60);
    Cancel=new Button("Cancel");
    Cancel.setPrefWidth(60);
    Clear=new Button("Clear");
    Clear.setPrefWidth(60);

    Btns=new VBox(5);
    Btns.getChildren().addAll(OK,Cancel,Clear);
    Btns.setPadding(new Insets(10));

    mainPane=new HBox(20);
    mainPane.getChildren().addAll(CBoxes,Fields,Btns);

    scene=new Scene(mainPane);

    window.setScene(scene);
    window.show();
  }
}
