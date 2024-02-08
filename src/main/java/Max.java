import java.util.Scanner;

public class Max {

   
   public int findMax() {
      /* Type your code here. */    
      Scanner scnr = new Scanner(System.in);
      int max = 0;
      int num = 0;
      
      while (max <= num) {
         max = num;
         num = scnr.nextInt();
      }
      return num;
   }
   
   public static void main(String[] args) {
      Max test = new Max();
      System.out.println(test.findMax());
   }

}
