import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double physics = input.nextDouble();
        double chemistry = input.nextDouble();
        double maths = input.nextDouble();

        double average = (physics + chemistry + maths) / 3;
        String grade, remarks;

        if (average >= 80) {
            grade = "A";
            remarks = "Excellent";
        } else if (average >= 70) {
            grade = "B";
            remarks = "Very Good";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Good";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Average";
        } else if (average >= 40) {
            grade = "E";
            remarks = "Below Average";
        } else {
            grade = "R";
            remarks = "Remedial";
        }

        System.out.println("Average Marks = " + average);
        System.out.println("Grade = " + grade);
        System.out.println("Remarks = " + remarks);

        input.close();
    }
}
