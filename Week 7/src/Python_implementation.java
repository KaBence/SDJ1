import javax.imageio.metadata.IIOMetadataFormatImpl;

public class Python_implementation
{
  public static void main(String[] args)
  {
    int A[][]={{1,1,1},{2,2,2},{3,3,3}};
    int B[][]={{1,1,1},{2,2,2},{3,3,3}};
    int[][] C=new int[A.length][B[0].length];
    for (int i = 0; i < A.length; i++)
    {
      for (int j = 0; j < B[0].length; j++)
      {
        for (int k = 0; k < B.length; k++)
        {
          C[i][j]+=A[i][k]*B[k][j];
        }
      }
    }
    for (int i = 0; i < A.length; i++)
    {
      for (int j = 0; j < B[0].length; j++)
      {
        System.out.println(C[i][j]);
      }
    }
  }
}
