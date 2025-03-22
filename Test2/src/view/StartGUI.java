package view;

import javafx.application.Application;
import javafx.stage.Stage;
import model.StudentModelManager;

public class StartGUI extends Application
{
  public void start(Stage window)
  {
    StudentModelManager modelManager = new StudentModelManager("Test2/students.bin");
    ViewHandler viewHandler = new ViewHandler(window, modelManager);
    viewHandler.start();
  }
}
