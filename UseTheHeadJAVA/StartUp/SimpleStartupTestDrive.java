package Aprendizado.UseTheHeadJAVA.StartUp;


import Aprendizado.UseTheHeadJAVA.Avulses.GameHelper;

public class SimpleStartupTestDrive {
    public static void main(String[] args) {

        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();


        SimpleStartup aspas = new SimpleStartup();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        aspas.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive) {
            int guess = helper.getUserInput("Insira um número");
            String result = aspas.checkYourSelf(guess);
            numOfGuesses++;

            if (result.equals("Afundou")){
                isAlive = false;
                System.out.println("Você obteve " + numOfGuesses + " tentativas");
            }


        }
    }
}
