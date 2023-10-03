/*
 * Author: Kevin Wong
 * Course: CS3560-01
 * Assignment: Programming Assignment 1
 * Due Date: 10/5/2023
 */

import java.util.Random;

public class Student {
    private String id;
    private int answer;

    public String generateID() {
        Random rand = new Random();
        id = "#" + (rand.nextInt(50) + 1);
        return id;
    }

    public String getID() {
        return id;
    }

    public void setSingleAnswer(int answer) {
        this.answer = answer;
    }

    public int getSingleAnswer() {
        return answer;
    }

    public void setMultChoiceAnswer(int answer) {
        this.answer = answer;
    }

    public int getMultChoiceAnswer() {
        return answer;
    }
}
