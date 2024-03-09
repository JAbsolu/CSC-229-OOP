import java.util.Scanner;

public class Hailstone {
   /* Type your code here. */ 
   public void hailstone(int num) {
    int counter = 0;
    
    while (num > 1) {
       counter++;
       
       if (num % 2 == 0) {
          System.out.print(num + "\t");
          num = num / 2;
       } else {
          System.out.print(num + "\t");
          num = (num * 3) + 1;
       }
       
       if (counter == 10) {
         System.out.println();
         counter = 0;
       }
    }
    System.out.println(num);
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Hailstone labObject = new Hailstone();
      int num;
      
      num = scnr.nextInt();
      labObject.hailstone(num); // Call hailstone() to print out the hailstone sequence.
   }
}
