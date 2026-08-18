package Aprendizado.UseTheHeadJAVA.StartUp;
import java.util.Scanner;

public  class SimpleStartup {

        Scanner sc = new Scanner(System.in);

        int locationCells[];
        int numOfHits = 0;

        public void setLocationCells(int[] locs) {
            locationCells = locs;
        }

        String checkYourSelf(int userGuess){
       String result = "Errou";
       for (int cell : locationCells) {
           if (userGuess == cell) {
               result = "Acertou";
               numOfHits++;
               break;
           }
       }
       if (numOfHits == locationCells.length) {
           result = "Afundou";
       }

       System.out.println(result);
       return result;
   }
   }




