package com.personalProjects;

public class Main {

    public static void main(String[] args) {

        Game game = new Game("marsupial");

        Prompter prompter = new Prompter(game);
        prompter.displayProgress();

        while(game.getRemainingTries() > 0) {
            prompter.displayProgress();
            prompter.promptForGuess();
        }

        boolean isHit = prompter.promptForGuess();
        if (isHit) {
            System.out.println("We got a hit");
        } else {
            System.out.println("Oops missed");
        }



    }
}
