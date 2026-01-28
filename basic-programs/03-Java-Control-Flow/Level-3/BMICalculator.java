import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight = input.nextDouble(); // in kg
        double heightCm = input.nextDouble(); // in cm

        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);

        System.out.println("BMI = " + bmi);

        if (bmi <= 18.4)
            System.out.println("Underweight");
        else if (bmi <= 24.9)
            System.out.println("Normal");
        else if (bmi <= 39.9)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

        input.close();
    }
}
