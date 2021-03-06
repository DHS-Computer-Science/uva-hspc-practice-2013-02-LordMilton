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
   public static void main(String[] args) throws Exception {
      //Scanner scan = new Scanner(new java.io.File("X:\\Git\\Git\\GitPortable\\Data\\home\\201302\\in-out\\judging.in"));
      Scanner scan = new Scanner(System.in);
      int towers = scan.nextInt();
      for(int i = 1; i <= towers; i++)
      {
         boolean fallen = false;
         int height = scan.nextInt();
         for(int j = 0; j < height; j++)
         {
            int nextRow = scan.nextInt(); scan.nextLine();
            int[] nextRowArr = new int[3];
            nextRowArr[0] = nextRow/100;
            nextRowArr[1] = (nextRow/10)%10;
            nextRowArr[2] = nextRow%10;
            if(!fallen)
               fallen = isFallen(nextRowArr);
         }
         if(fallen)
            System.out.println("Case "+ i +": Fallen");
         else
            System.out.println("Case "+ i +": Standing");
      }
      System.exit(0);
   }
}
