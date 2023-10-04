/*
 * Author: Kevin Wong
 * Course: CS3560-01
 * Assignment: Programming Assignment 1
 * Due Date: 10/5/2023
 */

import java.util.Random;

public class VotingService {
    private int numRight1;
    private int numRight2;
    private int numRight3;
    private int numRight4;
    private int numRight5;

    private int[][] studentSingleChoiceAnswers;
    private int[] studentMultChoiceAnswers;

    private Question question = new Question();

    public void printAnswers(int numOfStudents) {
        // create title
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("                               STUDENTS' ANSWERS");
        System.out.println("----------------------------------------------------------------------------------");

        // declare variables
        studentSingleChoiceAnswers = new int[numOfStudents][5];
        studentMultChoiceAnswers = new int[numOfStudents];
        Random rand = new Random();

        // print each student's ID
        for (int i = 0; i < numOfStudents; i++) {
            Student student = new Student();
            student.generateID();
            System.out.print("Student: " + student.getID());

            // print answers from each student
            for (int j = 0; j < SimulationDriver.NUM_OF_QUESTIONS; j++) {
                // for single selection questions
                student.setSingleAnswer(rand.nextInt(4) + 1); // +1 to exclude 0
                studentSingleChoiceAnswers[i][j] = student.getSingleAnswer();
                System.out.print("\nQuestion " + (j + 1) + ": " + studentSingleChoiceAnswers[i][j]);

                // for multiple selection question
                if (j == 4) {
                    student.setMultChoiceAnswer(rand.nextInt(4) + 1); // +1 to exclude 0
                    studentMultChoiceAnswers[i] = student.getMultChoiceAnswer();
                    System.out.println(", " + studentMultChoiceAnswers[i]);
                }
            }
            System.out.println();
        }
    }

    // calculate results
    public void calculateResults(int numOfStudents) {
        // initialize variables
        numRight1 = 0;
        numRight2 = 0;
        numRight3 = 0;
        numRight4 = 0;
        numRight5 = 0;

        // tally up correct answers for results
        for (int i = 0; i < numOfStudents; i++) {
            // calculate for single selection questions
            if (studentSingleChoiceAnswers[i][0] == SimulationDriver.answerArray[0][0])
                numRight1++;
            if (studentSingleChoiceAnswers[i][1] == SimulationDriver.answerArray[1][0])
                numRight2++;
            if (studentSingleChoiceAnswers[i][2] == SimulationDriver.answerArray[2][0])
                numRight3++;
            if (studentSingleChoiceAnswers[i][3] == SimulationDriver.answerArray[3][0])
                numRight4++;

            // calculate for multiple selection question
            if ((studentSingleChoiceAnswers[i][4] == SimulationDriver.answerArray[4][0])
                    && (studentMultChoiceAnswers[i] == SimulationDriver.answerArray[4][1]))
                numRight5++;
            if ((studentSingleChoiceAnswers[i][4] == SimulationDriver.answerArray[4][1]) // if answers are correct, but
                                                                                         // alternated
                    && (studentMultChoiceAnswers[i] == SimulationDriver.answerArray[4][0]))
                numRight5++;
        }
    }

    public void displayResults(int numOfStudents) {
        // create title
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("                                 CLASS RESULTS");
        System.out.println("----------------------------------------------------------------------------------");

        // print results for question 1 to console
        System.out.println("Question 1: ");
        System.out.println("Correct Answer was 3) Computer Science. ");
        question.analyzeResults(numRight1, numOfStudents);
        System.out.println();

        // print results for question 2 to console
        System.out.println("Question 2: ");
        System.out.println("Correct Answer was 2) Walnut Creek. ");
        question.analyzeResults(numRight2, numOfStudents);
        System.out.println();

        // print results for question 3 to console
        System.out.println("Question 3: ");
        System.out.println("Correct Answer was 2) Kickboxing. ");
        question.analyzeResults(numRight3, numOfStudents);
        System.out.println();

        // print results for question 4 to console
        System.out.println("Question 4: ");
        System.out.println("Correct Answer was 2) 1. ");
        question.analyzeResults(numRight4, numOfStudents);
        System.out.println();

        // print results for question 5 to console
        System.out.println("Question 5: ");
        System.out.println("Correct Answer was 1) Black and 4) Navy Blue. ");
        question.analyzeResults(numRight5, numOfStudents);
        System.out.println();
    }
}
