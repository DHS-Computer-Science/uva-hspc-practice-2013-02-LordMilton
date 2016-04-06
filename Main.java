//Bradley Dufour
//2016-04-06
//Practice 2013 - 02: Jenga
import java.util.Scanner;
import java.lang.Character;

public class Main{
   public static boolean isFallen(int[] row)
   {
      if((row[0] == 0 && row[1] == 0) || (row[1] == 0 && row[2] == 0))
      {
         return true;
      }
      return false;
   }
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int towers = scan.nextInt();
      for(int i = 1; i <= towers; i++)
      {
         boolean fallen = false;
         int height = scan.nextInt();
         for(int j = 0; j < height; j++)
         {
            int[] nextRow = new int[3];
            for(int k = 0; k < 3; k++)
            {
               nextRow[k] = Character.getNumericValue(scan.nextChar());
            }
            if(!fallen)
               fallen = isFallen(nextRow);
         }
         if(fallen)
            System.out.println("Case "+ i +": Fallen");
         else
            System.out.println("Case "+ i +": Standing");
      }
      System.exit(0);
   }
}
