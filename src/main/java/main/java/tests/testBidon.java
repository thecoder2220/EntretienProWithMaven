package main.java.tests;

public class testBidon {



   public static void main(String[] args) {
      String nomFichier = " Un  DEUX    tRIS    QUATRE    .pdf";

      nomFichier = nomFichier.replaceAll("\\s+", " ");
      System.out.println(nomFichier);

   }



}
