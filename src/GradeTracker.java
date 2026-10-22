import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    double asTotal = 0;
    int asCount = 0;
    double exTotal = 0;
    int exCount = 0;
    int choice = 0;

    while (choice != 4) {
        System.out.println("\n===== SEMESTER GRADE TRACKER =====");
        System.out.println("""
                \n1. Add assignment result
                2. Add exam result
                3. View current grade
                4. Exit
                """);
        System.out.println("\nChoose an option: ");
        choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Enter assignment score: ");
            double score = sc.nextDouble();
            if (score < 0 || score > 100) {
                System.out.println("Invalid score. Enter a value from 0 to 100.");
            } else {
                asTotal += score;
                asCount++;
                System.out.println("Assignment score added.");
            }
        } else if (choice == 2) {
            System.out.println("Enter exam score: ");
            double score = sc.nextDouble();
            if (score < 0 || score > 100) {
                System.out.println("Invalid score. Enter a value from 0 to 100.");
            } else {
                exTotal += score;
                exCount++;
                System.out.println("Exam score added.");
            }
        } else if (choice ==3) {
            if (asCount == 0 && exCount == 0) {
                System.out.println("No results available yet.");
            } else {
                double overall;
                System.out.println("\n===== CURRENT RESULTS =====");

                if (asCount > 0) {
                    double aAverage = asTotal / asCount;
                    System.out.println("\nAssignments completed: " + asCount);
                    System.out.println("Assignment average: " + aAverage);
                } else {
                    System.out.println("\nNo assignment results yet.");
                }

                if (exCount > 0) {
                    double eAverage = exTotal / exCount;
                    System.out.println("\nExams completed: " + exCount);
                    System.out.println("Exam average: " + eAverage);
                } else {
                    System.out.println("\nNo exam results yet.");
                }

                if (asCount > 0 && exCount > 0) {
                    overall = (asTotal / asCount) * 0.50 + (exTotal / exCount) * 0.50;
                } else if (asCount > 0) {
                    overall = asTotal / asCount;
                    System.out.println("\nNote: only assignments entered, so the overall average equals the assignment average.");
                } else {
                    overall = exTotal / exCount;
                    System.out.println("\nNote: only exams entered, so the overall average equals the exam average.");
                }

                System.out.println("\nOverall average: " + overall);

                if (overall >= 90) {
                    System.out.println("Grade: A");
                } else if (overall >= 80) {
                    System.out.println("Grade: B");
                } else if (overall >= 70) {
                    System.out.println("Grade: C");
                } else if (overall >= 60) {
                    System.out.println("Grade: D");
                } else {
                    System.out.println("Grade: F");
                }

                if (overall >= 60) {
                    System.out.println("Status: Passing");
                } else {
                    System.out.println("Status: Failing");
                }
            }

        }
    }

    System.out.println("Grade tracker closed.");

    sc.close();
}