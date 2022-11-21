package Lesson_3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorGUI extends Application
{
  public void start(Stage window) throws IOException
  {
    window.setTitle("CalculatorGUI");
    FXMLLoader loader=new FXMLLoader();
    loader.setLocation(getClass().getResource("CalculatorGUI.fxml"));
    Scene scene=new Scene(loader.load());
    window.setScene(scene);
    window.show();
  }
}
