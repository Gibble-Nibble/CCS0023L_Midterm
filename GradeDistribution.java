public class GradeDistribution {
    private int numA;
    private int numB;
    private int numC;
    private int numD;
    private int numF;

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public void setNumC(int numC) {
        this.numC = numC;
    }

    public void setNumD(int numD) {
        this.numD = numD;
    }

    public void setNumF(int numF) {
        this.numF = numF;
    }

    public int getTotalNumGrades() {
        return numA + numB + numC + numD + numF;
    }

    public int getPercentA() {
        return (int) Math.round((double) numA / getTotalNumGrades() * 100);
    }

    public int getPercentB() {
        return (int) Math.round((double) num B / getTotalNumGrades() * 100);
    }

    public int getPercentC() {
        return (int) Math.round((double) numC / getTotalNumGrades() * 100);
    }

    public int getPercentD() {
        return (int) Math.round((double) numD / getTotalNumGrades() * 100);
    }

    public int getPercentF() {
        return (int) Math.round((double) numF / getTotalNumGrades() * 100);
    }

    public void drawGraph() {
        System.out.println("0 10 20 30 40 50 60 70 80 90 100");
        System.out.print("**** A");
        for (int i = 0; i < getPercentA() / 2; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("************** B");
        for (int i = 0; i < getPercentB() / 2; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("********************* C");
        for (int i = 0; i < getPercentC() / 2; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("******* D");
        for (int i = 0; i < getPercentD() / 2; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("**** F");
        for (int i = 0; i < getPercentF() / 2; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
