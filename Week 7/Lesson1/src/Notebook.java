import java.util.ArrayList;

public class Notebook
{
  private int numberOfNotes;
  private ArrayList<Note> notes;

  public Notebook(int maxNumberOfNotes){
    notes=new ArrayList<Note>();
    numberOfNotes=maxNumberOfNotes;
  }

  public Notebook(){
    notes=new ArrayList<Note>(5);
    numberOfNotes=5;
  }

  public int getNumberOfNotes(){
    return notes.size();
  }

  public Note getNote(int index){
    Note temp=notes.get(index).copy();
    return temp;
  }

  public String getMessage(int index){
    Note temp=notes.get(index).copy();
    return temp.getMessage();
  }

  public void addNote(Note note){
      if (numberOfNotes>=notes.size()){
        notes.add(note.copy());
      }
      else System.out.println("Notebook full");
  }

  public void addNote(String message){
      if (numberOfNotes>=notes.size()){
        notes.add(new Note(message));
      }
      else System.out.println("Notebook full");
  }

  public void addHighPriorityNote(String message){
      if (numberOfNotes>=notes.size()){
        Note temp=new Note(message);
        temp.setToHighPriority();
        notes.add(temp);
      }
      else System.out.println("Notebook full");
  }

  public void removeNote(int index){
    notes.remove(index);
  }

  public Note[] getAllNotes(){
    Note[] temp=new Note[notes.size()];
    for (int i = 0; i < notes.size(); i++)
    {
      temp[i]=notes.get(i);
    }
    return temp;
  }

  public int getNumberOfHighPriorityNotes(){
    int counter=0;
    for(Note item : notes){
      if (item.isHighPriority())counter++;
    }
    return counter;
  }

  public Note[] getAllHighPriorityNotes()
  {
    int counter = 0;
    Note[] temp = new Note[getNumberOfHighPriorityNotes()];
    for (int i = 0; i < notes.size(); i++)
    {
      if (notes.get(i).isHighPriority())
      {
        temp[counter]=notes.get(i);
        counter++;
      }
    }
    return temp;
  }

  public String toString(){
    String temp="";
    for (int i = 0; i < notes.size(); i++)
    {
      temp+=notes.get(i).getMessage()+"\n";
    }
    return temp;
  }
}
