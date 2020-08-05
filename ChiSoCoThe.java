import java.util.Scanner;

public class ChiSoCoThe {
    public static void main(String[] args) {
        double weight, height, bmi;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your weight (in kilogram):");
        weight = scanner.nextDouble();

        System.out.print("Your height (in meter):");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.4f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-21.4f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
// cần nhớ %f,%d,%c và làm tròn số,khoảng trắng các kí tự
