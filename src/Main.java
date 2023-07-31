import java.util.Scanner;

public class Main {
    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        } else {
            int min = findMin(arr, n - 1);
            return Math.min(min, arr[n - 1]);
        }
    }
    public static double findAverage(int[] arr, int n) {
        if (n == 0) {
            return arr[0];
        } else {
            double sum = findAverage(arr, n - 1) * (n - 1) + arr[n - 1];
            return sum / n;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1
        System.out.print(" ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int min = findMin(array, array.length);
        System.out.println("minimum num: " + min);

        // Task 2
        double average = findAverage(array, array.length);
        System.out.println("Average of numbers in the array: " + average);
        scanner.close();
    }


 }

