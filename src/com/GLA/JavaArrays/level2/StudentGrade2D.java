import java.util.Scanner;

public class StudentGrade2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[][] data = new double[n][4]; // phy, chem, math, percentage
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
            data[i][2] = sc.nextDouble();

            data[i][3] = (data[i][0] + data[i][1] + data[i][2]) / 3;

            if (data[i][3] >= 80)
                grade[i] = 'A';
            else if (data[i][3] >= 70)
                grade[i] = 'B';
            else if (data[i][3] >= 60)
                grade[i] = 'C';
            else if (data[i][3] >= 50)
                grade[i] = 'D';
            else if (data[i][3] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Percentage: " + data[i][3] + " Grade: " + grade[i]);
        }
    }
}