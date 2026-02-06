import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; // height, weight, bmi
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (m): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter weight (kg): ");
            personData[i][1] = sc.nextDouble();

            personData[i][2] = personData[i][1] / 
                              (personData[i][0] * personData[i][0]);

            double bmi = personData[i][2];

            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi <= 24.9)
                weightStatus[i] = "Normal";
            else if (bmi <= 39.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.println(personData[i][0] + "\t" +
                               personData[i][1] + "\t" +
                               personData[i][2] + "\t" +
                               weightStatus[i]);
        }
    }
}