package lang.print.gaps.task4;

import java.util.Scanner;

public class FormulaCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println((9 * Math.pow(a, 2) - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2));
        System.out.println((9 * Math.pow(a, 2) - 5 * b + 2 + a - 7) * (a + b - 4 * a * b) / 2);
        System.out.println((9 * a * a - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2));
        System.out.println((9 * (a ^ 2) - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2));
        System.out.println((9 * (a * a) - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2));
        System.out.println((9*Math.pow(a, 2) - 5*b + 2 + a - 7) * ((a + b - 4*a*b) / 2));
        System.out.println((9 * a * a - 5 * b + 2 + a - 7) * (a + b - 4 * a * b) / 2);
    }
}
