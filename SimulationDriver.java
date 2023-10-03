/*
 * Author: Kevin Wong
 * Course: CS3560-01
 * Assignment: Programming Assignment 1
 * Due Date: 10/5/2023
 */

import java.util.Random;

public class SimulationDriver {

    public static final int NUM_OF_QUESTIONS = 5;
    public static final int NUM_OPTIONS = 4; // a, b, c, d
    // public static final int NUM_STUDENTS = 10;

    public static String[] questionArray = { "What is my major?",
            "Where was I born?",
            "What is my favorite thing to do?",
            "How many pets do I have?",
            "What are my favorite colors? (Mark all that apply)" };

    public static String[][] choiceArray = { { "Business", "Biology", "Computer Science", "Finance" },
            { "Taipei", "Walnut Creek", "Miami", "Sacramento" },
            { "Watching Movies", "Kickboxing", "Dancing", "Jump Roping" },
            { "0", "1", "2", "3" },
            { "Black", "White", "Gray", "Navy Blue" } };

    public static int[][] answerArray = { { 3 },
            { 2 },
            { 2 },
            { 2 },
            { 1, 4 } };

    public static int generateRandNumOfStudents() {
        Random rand = new Random();
        int numStudents = (rand.nextInt(15) + 1);

        return numStudents;
    }

    public static void main(String[] args) {
        VotingService vote = new VotingService();
        Question que = new Question();
        int numOfStudents;

        que.displayQuestions();
        numOfStudents = generateRandNumOfStudents();
        vote.printAnswers(numOfStudents);
        vote.calculateResults(numOfStudents);
        vote.displayResults(numOfStudents);
    }
}
