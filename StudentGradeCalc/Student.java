package StudentGradeCalc;

import java.util.Scanner;

public class Student {
    private String name;
    private int[] scores;
    private String grade;

    public Student(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
        calculateGrade();
    }

    private void calculateGrade() {
        if (scores.length == 0) {
            grade = "N";
            return;
        }

        int total = 0;
        for (int score : scores) {
            total = total + score;
        }

        double average = (double) total / scores.length;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B+";
        } else if (average >= 60) {
            grade = "B";
        } else if (average >= 50) {
            grade = "C+";
        } else if (average >= 40) {
            grade = "C";
        } else {
            grade = "F";
        }
    }

    private void dispInformation() {
        
        System.out.println("Student Information");
        System.out.println("Name: " + name);
        System.out.println("Score: ");

        for (int score : scores) {
            System.out.println(score + " ");
        }
        
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + grade);
        
    }

    private double calculateAverage() {
        if (scores.length == 0) {
            return 0.0;
        }
        int total = 0;
        for (int score : scores) {
            total = total + score;
        }
        return (double) total / scores.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Student Grade Calculator");
        System.out.println("Enter Student name: ");
        String name = sc.nextLine();

        System.out.println("Enter the number of score: ");
        int numScore = sc.nextInt();

        int[] scores = new int[numScore];
        System.out.println("Enter the scores: ");

        for (int i=0; i<numScore; i++){
            System.out.println("Score " + (i+1) + ": ");
            scores[i] = sc.nextInt();
        }
        Student stud = new Student(name, scores);
        stud.dispInformation();

        sc.close();
    }
}

