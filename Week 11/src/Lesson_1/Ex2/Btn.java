package Lesson_1.Ex2;

import javafx.scene.control.Button;

public class Btn extends Button
{
  public Btn(String text){
   super(text);
   setPrefSize(10,10);

   //This can work too to set every btn size to this,
    // the most important thing is to extend from button so
    // java knows that this is a javafx class
  }
}
