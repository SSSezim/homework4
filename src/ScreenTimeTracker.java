import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    int socialTime = 0;
    int gamingTime = 0;
    int studyTime = 0;
    int streamingTime = 0;
    int totalTime = 0;
    int sessions = 0;
    int choice = 0;

    while (choice != 6) {
        System.out.println("\n===== SCREEN-TIME TRACKER =====");
        System.out.println("""
                \n1. Add social media time
                2. Add gaming time
                3. Add studying time
                4. Add video or streaming time
                5. View statistics
                6. Exit
                """);
        System.out.println("Choose an option: ");
        choice = sc.nextInt();

        if (choice >= 1 && choice <= 4) {
            if (choice == 1) {
                System.out.println("Enter social media minutes: ");
            } else if (choice == 2) {
                System.out.println("Enter gaming minutes: ");
            } else if (choice == 3) {
                System.out.println("Enter studying minutes: ");
            } else {
                System.out.println("Enter streaming minutes: ");
            }
            int minutes = sc.nextInt();

            if (minutes <= 0) {
                System.out.println("Invalid time. Minutes must be greater than 0.");
            } else {
                if (choice == 1) {
                    socialTime += minutes;
                } else if (choice == 2) {
                    gamingTime += minutes;
                } else if (choice == 3) {
                    studyTime += minutes;
                } else {
                    streamingTime += minutes;
                }
                totalTime += minutes;
                sessions++;
                System.out.println("\nTime added successfully!");
            }
        } else if (choice == 5) {
            System.out.println("\n===== TODAY'S SCREEN TIME =====");
            System.out.println("\nSocial media: " + socialTime + " minutes");
            System.out.println("Gaming: " + gamingTime + " minutes");
            System.out.println("Studying: " + studyTime + " minutes");
            System.out.println("Streaming: " + streamingTime + " minutes");
            System.out.println("\nTotal screen time: " + totalTime + " minutes");
            System.out.println("Recorded sessions: " + sessions);

            int entertainmentTime = socialTime + gamingTime + streamingTime;
            if (studyTime > entertainmentTime) {
                System.out.println("\nStudy screen time is greater than entertainment screen time. Good balance!");
            } else if (studyTime < entertainmentTime) {
                System.out.println("\nEntertainment screen time is greater than study time.");
            } else {
                System.out.println("\nStudy and entertainment screen time are equal.");
            }

            if (totalTime < 120) {
                System.out.println("Low screen time");
            } else if (totalTime <= 240) {
                System.out.println("Moderate screen time");
            } else {
                System.out.println("High screen time");
            }
        } else if (choice != 6) {
            System.out.println("Invalid option. Choose between 1-6.");
        }
    }

    System.out.println("Screen-time tracker closed.");
    sc.close();
}