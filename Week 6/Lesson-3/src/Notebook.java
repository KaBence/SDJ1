public class Notebook
{
  private int numberOfNotes;
  private Note[] notes;

  public Notebook(int maxNumberOfNotes){
    notes=new Note[maxNumberOfNotes];
    numberOfNotes=0;
  }

  public int getNumberOfNotes(){
    return numberOfNotes;
  }

  public Note getNote(int index){
    Note temp=notes[index].copy();
    return temp;
  }

  public String getMessage(int index){
    Note temp=notes[index].copy();
    return temp.getMessage();
  }

  public void addNote(Note note){
    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i]==null){
        notes[i]=note.copy();
        numberOfNotes++;
        break;
      }
    }
  }

  public void addNote(String message){
    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i]==null){
        notes[i]=new Note(message);
        numberOfNotes++;
        break;
      }
    }
  }

  public void addHighPriorityNote(String message){
    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i]==null){
        notes[i]=new Note(message);
        numberOfNotes++;
        notes[i].setToHighPriority();
        break;
      }
    }
  }

  public void removeNote(int index){
    notes[index]=null;
    numberOfNotes--;
  }

  public Note[] getAllNotes(){
    int counter=0;
    Note[] temp=new Note[numberOfNotes];
    for (int i = 0; i < numberOfNotes; i++)
    {
      if (notes[i]!=null){
        temp[counter]=notes[i];
        counter++;
      }
    }
    return temp;
  }

  public int getNumberOfHighPriorityNotes(){
    int counter=0;
    for(Note item : notes){
      if (item!=null &&item.isHighPriority())counter++;
    }
    return counter;
  }

  public Note[] getAllHighPriorityNotes()
  {
    int counter = 0;
    Note[] temp = new Note[getNumberOfHighPriorityNotes()];
    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i]!=null&&notes[i].isHighPriority())
      {
        temp[counter]=notes[i];
        counter++;
      }
    }
    return temp;
  }

  public String toString(){
    String temp="";
    for (Note item : notes){
      temp+=item.getMessage()+"\n";
    }
    return temp;
  }
}
