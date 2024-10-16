import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentRecord student = new StudentRecord();
        student.inputScores();
        student.computeOverallNumericScore();
        student.computeFinalLetterGrade();
        student.outputRecord();

        GradeDistribution distribution = new GradeDistribution();
        distribution.setNumA(1);
        distribution.setNumB(4);
        distribution.setNumC(6);
        distribution.setNumD(2);
        distribution.setNumF(1);
        distribution.drawGraph();
    }
}