import java.util.Scanner;

public class GradeCalculator { public static void main(String[] args) { Scanner scanner = new Scanner(System.in); System.out.println("Grade Calculator");

System.out.print("Enter the number of subjects: ");
    int numSubjects = scanner.nextInt();
    double total = 0;

    for (int i = 1; i <= numSubjects; i++) {
        System.out.print("Enter grade for subject " + i + ": ");
        double grade = scanner.nextDouble();
        total += grade;
    }

    double average = total / numSubjects;
    System.out.println("Average Grade: " + average);

    if (average >= 90) {
        System.out.println("Performance: Excellent");
    } else if (average >= 75) {
        System.out.println("Performance: Good");
    } else if (average >= 50) {
        System.out.println("Performance: Average");
    } else {
        System.out.println("Performance: Needs Improvement");
    }

    scanner.close();
}

}
