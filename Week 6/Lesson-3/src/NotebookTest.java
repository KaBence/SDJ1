public class NotebookTest
{
  public static void main(String[] args)
  {
    Notebook n=new Notebook(3);
    n.addNote("Elso");
    n.addHighPriorityNote("MasodikFontos");
    n.addHighPriorityNote("HarmadikFontos");
    System.out.println(n);

    System.out.println(n.getNumberOfHighPriorityNotes());
    Note[] n1=n.getAllHighPriorityNotes();
    for (Note item : n1){
      System.out.println(item.getMessage());
    }
  }
}
