import java.util.Scanner;

interface DataProvider {
    double calcPercentage();
}

class Intern implements DataProvider {
    private int marksSecured;
    private int graceMarks;

    public Intern(int marksSecured, int graceMarks) {
        this.marksSecured = marksSecured;
        this.graceMarks = graceMarks;
    }

    @Override
    public double calcPercentage() {
        int totalMarks = marksSecured + graceMarks;
        double percentage = ((double) totalMarks / 8000) * 100;
        return percentage;
    }
}

class Trainee implements DataProvider {
    private int marksSecured;

    public Trainee(int marksSecured) {
        this.marksSecured = marksSecured;
    }

    @Override
    public double calcPercentage() {
        double percentage = ((double) marksSecured / 8000) * 100;
        return percentage;
    }
}

public class correctmarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // For Intern
        boolean validInternInput = false;
        int internMarks = 0;
        int internGraceMarks = 0;
        while (!validInternInput) {
            System.out.println("Enter marks secured for Intern:");
            internMarks = scanner.nextInt();
            System.out.println("Enter grace marks for Intern:");
            internGraceMarks = scanner.nextInt();
            if (internMarks + internGraceMarks <= 8000) {
                validInternInput = true;
            } else {
                System.out.println("Please enter the correct marks.");
            }
        }
        Intern intern = new Intern(internMarks, internGraceMarks);
        double internPercentage = intern.calcPercentage();
        System.out.println("Intern: the total aggregate percentage secured is " + internPercentage);

        // For Trainee
        boolean validTraineeInput = false;
        int traineeMarks = 0;
        while (!validTraineeInput) {
            System.out.println("Enter marks secured for Trainee:");
            traineeMarks = scanner.nextInt();
            if (traineeMarks <= 8000) {
                validTraineeInput = true;
            } else {
                System.out.println("Please enter the correct marks.");
            }
        }
        Trainee trainee = new Trainee(traineeMarks);
        double traineePercentage = trainee.calcPercentage();
        System.out.println("Trainee: the total aggregate percentage secured is " + traineePercentage);

        // Close the scanner
        scanner.close();
    }
}

