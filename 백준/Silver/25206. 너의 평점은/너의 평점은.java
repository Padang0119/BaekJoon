import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double totalSum = 0;
        double scoreSum = 0;

        for (int i = 0; i < 20 ; i++) {
            String subject  = scanner.next();
            double score = scanner.nextDouble(); //학점
            String grade = scanner.next(); //과목평점

            if (grade.equals("P")) {
                continue;
            }

            double gradePoint = getGradePoint(grade);

            totalSum += score * gradePoint;
            scoreSum += score;
        }
        if (scoreSum != 0) {
            System.out.printf("%.6f", totalSum / scoreSum);
        } else {
            System.out.println("0.000000");
        }
    }

    public static double getGradePoint(String grade) {
        switch (grade) {
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            case "F": return 0;
            default: return 0;
        }
    }
}