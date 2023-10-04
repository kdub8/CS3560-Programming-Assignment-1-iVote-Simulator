# Voting Service Simulation in Java

Author: Kevin Wong

Course: CS3560-01

Assignment: Programming Assignment 1

Due Date: 10/5/2023

---

## Overview

This Java code implements a voting service simulation that generates random student answers to a set of multiple-choice questions, analyzes the results, and displays the statistics. The simulation allows for the creation of a variable number of students and random answers for each student.

## Components

### VotingService.java

- `VotingService` class manages the voting service simulation.
- It includes methods to generate student answers, calculate results, and display the results.
- Students' single and multiple-choice answers are generated randomly.
- The results are calculated by comparing student answers to the correct answers.
- Results for each question are displayed, including the number of correct and wrong answers.

### Question.java

- `Question` class handles the analysis and display of results for individual questions.
- The `analyzeResults` method calculates and displays the number of correct and wrong answers for a question.
- The `displayQuestions` method displays the set of questions and answer choices.

### Student.java

- `Student` class represents a student in the simulation.
- It generates a random student ID and stores it.
- It allows for setting and getting single-choice and multiple-choice answers for a student.

### SimulationDriver.java

- `SimulationDriver` class contains the main method to run the voting service simulation.
- It defines the questions, answer choices, and correct answers.
- It generates a random number of students for the simulation.
- It orchestrates the simulation by creating instances of `VotingService` and `Question`.

## Usage

1. Compile and run the `SimulationDriver` class.
2. The simulation will display the set of questions and answer choices.
3. A random number of students will participate in the simulation.
4. Each student's answers to the questions are generated randomly.
5. The simulation calculates and displays the results for each question, including the number of correct and wrong answers.

The program is designed to demonstrate a simple voting service simulation with random student participation and answers. You can adjust the number of questions, answer choices, and the correct answers by modifying the arrays in `SimulationDriver`.
