public class Application {
    public static void main(String[] args) {
        Menu menu = new Menu(new String[] {"Quiz 1", "Quiz 2", "Midterm", "Final", "Exit"});
        int choice = menu.displayMenu();
        while (choice != 5) {
            switch (choice) {
                case 1:
                    // Handle Quiz 1
                    break;
                case 2:
                    // Handle Quiz 2
                    break;
                case 3:
                    // Handle Midterm
                    break;
                case 4:
                    // Handle Final
                    break;
            }
            choice = menu.displayMenu();
        }
    }
}

public class StudentRecord {
    private int quiz1;
    private int quiz2;
    private int midterm;
    private int finalExam;
    private double overallNumericScore;
    private char finalLetterGrade;

    public StudentRecord() {}

    public void inputScores() {
        System.out.print("Enter Quiz 1 score: ");
        quiz1 = Integer.parseInt(System.console().readLine());
        System.out.print("Enter Quiz 2 score: ");
        quiz2 = Integer.parseInt(System.console().readLine());
        System.out.print("Enter Midterm score: ");
        midterm = Integer.parseInt(System.console().readLine());
        System.out.print("Enter Final Exam score: ");
        finalExam = Integer.parseInt(System.console().readLine());
    }

    public void computeOverallNumericScore() {
        double quizAverage = (quiz1 + quiz2) / 20.0;
        overallNumericScore = (quizAverage * 0.25) + (midterm * 0.25) + (finalExam * 0.5);
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
        System.out.println("Student Record:");
        System.out.println("Quiz 1: " + quiz1);
        System.out.println("Quiz 2: " + quiz2);
        System.out.println("Midterm: " + midterm);
        System.out.println("Final Exam: " + finalExam);
        System.out.println("Overall Numeric Score: " + overallNumericScore);
        System.out.println("Final Letter Grade: " + finalLetterGrade);
    }
}
