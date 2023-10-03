/*
 * Author: Kevin Wong
 * Course: CS3560-01
 * Assignment: Programming Assignment 1
 * Due Date: 10/5/2023
 */

public class Question {

    public void analyzeResults(int numRight, int numOfStudents) {
        int numWrong = numOfStudents - numRight;
        System.out.println("Correct: " + numRight + ", Wrong: " + numWrong);
    }

    public void displayQuestions() {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("                                    TEST");
        System.out.println("----------------------------------------------------------------------------------");

        for (int i = 0; i < SimulationDriver.NUM_OF_QUESTIONS; i++) {
            System.out.println("Question " + (i + 1) + ": " + SimulationDriver.questionArray[i]);

            // loop through options array to print options
            for (int j = 0; j < SimulationDriver.NUM_OPTIONS; j++) {
                System.out.print((j + 1) + ") " + SimulationDriver.choiceArray[i][j] + "  ");
            }
            System.out.println("\n");
        }
    }
}
