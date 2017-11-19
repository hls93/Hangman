package com.personalProjects;

public class Main {

    public static void main(String[] args) {

        Game game = new Game("pig");

        Prompter prompter = new Prompter(game);
        prompter.displayProgress();

        while(game.getRemainingTries() > 0 && !game.isWon()) {
            prompter.displayProgress();
            prompter.promptForGuess();
        }
        prompter.displayOutcome();

        boolean isHit = prompter.promptForGuess();
        if (isHit) {
            System.out.println("We got a hit");
        } else {
            System.out.println("Oops missed");
        }



    }
}
