import java.util.Scanner;

public class StudentRecord {
    private int quiz1;
    private int quiz2;
    private int midterm;
    private int finalExam;
    private double overallNumericScore;
    private char finalLetterGrade;

    public StudentRecord() {}

    public void inputScores() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quiz 1 score (out of 10): ");
        quiz1 = scanner.nextInt();
        System.out.print("Enter quiz 2 score (out of 10): ");
        quiz2 = scanner.nextInt();
        System.out.print("Enter midterm score (out of 100): ");
        midterm = scanner.nextInt();
        System.out.print("Enter final exam score (out of 100): ");
        finalExam = scanner.nextInt();
    }

    public void computeOverallNumericScore() {
        double quizAverage = ((quiz1 / 10.0) + (quiz2 / 10.0)) / 2.0 * 100; // normalize quiz scores to percentage
        overallNumericScore = (0.5 * finalExam) + (0.25 * midterm) + (0.25 * quizAverage);
    }

    public void computeFinalLetterGrade() {
        if (overallNumericScore >= 90) {
            finalLetterGrade = 'A';
        } else if (overallNumericScore >= 80) {
            finalLetterGrade = 'B';
        } else if (overallNumericScore >= 70) {
            finalLetterGrade = 'C';
        } else if (overallNumericScore >= 60) {
            finalLetterGrade = 'D';
        } else {
            finalLetterGrade = 'F';
        }
    }

    public void outputRecord() {
        System.out.println("Quiz 1 score: " + quiz1);
        System.out.println("Quiz 2 score: " + quiz2);
        System.out.println("Midterm score: " + midterm);
        System.out.println("Final exam score: " + finalExam);
        System.out.println("Overall numeric score: " + overallNumericScore);
        System.out.println("Final letter grade: " + finalLetterGrade);
    }
}