package main.java.tests;

public class triInsertionSansSolution {

   public static void main(String[] args) {
      int tableau[] = {1, 6, 4, 6, 2, 0, 1, 5};

      triInsertion(tableau);

      for (int i = 0; i < tableau.length; i++) {
         System.out.print(tableau[i]);
      }
   }

   static void triInsertion(int[] tablo) {


      //.....
      
      
      for (int i = 0; i < tablo.length; i++) {
            System.out.print(tablo[i]);

         System.out.print("\n");
      }
   }

}
