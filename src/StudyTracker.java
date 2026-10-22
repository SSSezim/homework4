import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    int weeklyGoal = 600;
    int studySessions = 0;
    int totalTime = 0;
    int pTime = 0;
    int mTime = 0;
    int eTime = 0;
    int oTime = 0;
    int choice = 0;
    int subjChoice = 0;

    while (choice != 4) {
        System.out.println("===== STUDY TRACKER =====");
        System.out.println("\n1. Add study session");
        System.out.println("2. View statistics");
        System.out.println("3. Check weekly goal");
        System.out.println("4. Exit");
        System.out.println("\nChoose an option: ");
        choice = sc.nextInt();

        if (choice == 1 ) {
            System.out.println("Choose subject: " );
            System.out.println("""
                    1.Programming
                    2.Mathematics
                    3.English
                    4.Other
                    \nChoose an option:""");
            subjChoice = sc.nextInt();

            if (subjChoice < 1 || subjChoice > 4 ) {
                System.out.println("Invalid option. Choose between 1-4");
            } else {
                System.out.print("Enter study time in min: ");
                int timeMin = sc.nextInt();
                if (timeMin <= 0) {
                    System.out.println("Invalid study time. Time must be greater than 0.");
                } else {
                    if (subjChoice == 1) {
                        pTime += timeMin;
                    } else if (subjChoice == 2) {
                        mTime += timeMin;
                    } else if (subjChoice == 3) {
                        eTime += timeMin;
                    } else {
                        oTime += timeMin;
                    }
                    totalTime += timeMin;
                    studySessions++;
                    System.out.println("Study session added!");
                    System.out.println("Current total study time: " + totalTime + " minutes");
                }
            }

        } else if (choice == 2) {
            System.out.println("===== WEEKLY STATISTICS =====");
            System.out.println("\nStudy sessions: " + studySessions);
            System.out.println("Total study time: " + totalTime + " minutes");

            System.out.println("\nProgramming: " + pTime + " minutes");
            System.out.println("Mathematics: " + mTime + " minutes");
            System.out.println("English: " + eTime + " minutes");
            System.out.println("Other: " + oTime + " minutes");
        } else if (choice == 3) {
            System.out.println("Weekly goal: " + weeklyGoal + " minutes");
            System.out.println("You studied: " + totalTime + " minutes");
            int remaining = weeklyGoal - totalTime;
            if(totalTime < weeklyGoal) {
                System.out.println("Remaining: " + remaining + " minutes");
            } else {
                System.out.println("Weekly goal achieved!");
            }
        }
    }
    System.out.println("Study tracker closed. Keep up the good work!");

    sc.close();
}