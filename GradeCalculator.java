import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of subject: ");
        int numSubject = scanner.nextInt();

        
        int[] scores = new int[numSubject];

        
        for (int i = 0; i < numSubject; i++) {
            System.out.printf("Enter the score for each subject  out of 100 %d: ", i + 1);
            scores[i] = scanner.nextInt();
        }

        
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double averagePercentage = sum / numSubject;

        
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        
        System.out.printf("The average percentage obtained  is %.2f, The grade is %c%n", averagePercentage, grade);

        scanner.close();
    }
}