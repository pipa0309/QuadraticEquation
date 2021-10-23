package HomeExtraTaskOne;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        Scanner scanNum = new Scanner(System.in);
        System.out.println("Квадратное уравнение имеет вид: ax^2 + bx + c = 0");
        double scanNumOne = enteredScanNumOne(scanNum);
        double scanNumTwo = enteredScanNumTwo(scanNum);
        double scanNumThree = enteredScanNumThree(scanNum);
        double D = calculateD(scanNumOne, scanNumTwo, scanNumThree);
        calculate(scanNumOne, scanNumTwo, scanNumThree, D);
        scanNum.close();
    }

    private static double calculateD(double scanNumOne, double scanNumTwo, double scanNumThree) {
        double operationOne = (scanNumTwo * scanNumTwo);
        double operationTwo = (scanNumOne * scanNumThree);
        double operationThree = 4 * operationTwo;
        double D = operationOne - operationThree;
        System.out.println("D = " + D + "\n");
        return D;
    }

    private static double enteredScanNumThree(Scanner scanNum) {
        System.out.println("Введите значение c. После этого нажмите Enter: ");
        double scanNumThree = scanNum.nextDouble();
        System.out.println("Значение c = " + scanNumThree + "\n");
        return scanNumThree;
    }

    private static double enteredScanNumTwo(Scanner scanNum) {
        System.out.println("Введите значение b. После этого нажмите Enter: ");
        double scanNumTwo = scanNum.nextDouble();
        System.out.println("Значение b = " + scanNumTwo + "\n");
        return scanNumTwo;
    }

    private static double enteredScanNumOne(Scanner scanNum) {
        System.out.println("Введите значение a. После этого нажмите Enter: ");
        double scanNumOne = scanNum.nextDouble();
        System.out.println("Значение a = " + scanNumOne + "\n");
        return scanNumOne;
    }

    public static void calculate(double scanNumOne, double scanNumTwo, double scanNumThree, double D) {
        if(D > 0) {
            double x1 = (-scanNumTwo + Math.sqrt(D)) / (2 * scanNumOne);
            System.out.println("x1 = " + x1);
            double x2 = (-scanNumTwo - Math.sqrt(D)) / (2 * scanNumOne);
            System.out.println("x2= " + x2);
        } else if (D == 0) {
            double x = (-scanNumTwo) / (2 * scanNumOne);
            System.out.println("x = " + x);
        } else {
            System.out.println("Ур-ние не имеет корней");
        }
    }
}
