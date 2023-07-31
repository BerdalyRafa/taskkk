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

    public static boolean isPrime(int n, int divisor) {
        if (n < 2) {
            return false;
        }
        if (divisor > Math.sqrt(n)) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrime(n, divisor + 1);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static double power(double a, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return a * power(a, n - 1);
        } else {
            return 1 / (a * power(a, -n - 1));
        }
    }

    public static void reverseArray(int[] arr, int n) {
        if (n == 0) {
            return;
        }
        System.out.print(arr[n - 1] + " ");
        reverseArray(arr, n - 1);
    }

    public static boolean allDigits(String s) {
        if (s.length() == 0) {
            return false;
        } else if (s.length() == 1) {
            return Character.isDigit(s.charAt(0));
        } else {
            char firstChar = s.charAt(0);
            return Character.isDigit(firstChar) && allDigits(s.substring(1));
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
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
        // Task 3
        System.out.print(" prime or composite: ");
        int numberToCheck = scanner.nextInt();
        boolean isPrimeNumber = isPrime(numberToCheck, 2);
        if (isPrimeNumber) {
            System.out.println(numberToCheck + " is a prime number.");
        } else {
            System.out.println(numberToCheck + " is a composite number.");
        }

        // Task 4
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("not defined for negative numbers.");
        } else {
            int result = factorial(number);
            System.out.println( result);
        }

        // Task 5
        System.out.print("");
        int fibonacciNumber = scanner.nextInt();
        if (fibonacciNumber < 0) {
            System.out.println("not defined for negative numbers.");
        } else {
            int fibonacciResult = fibonacci(fibonacciNumber);
            System.out.println( fibonacciResult);
        }

        // Task 6
        System.out.print("Enter a base number (a): ");
        double a = scanner.nextDouble();
        System.out.print("Enter an exponent (n): ");
        int exponent = scanner.nextInt();
        double powerResult = power(a, exponent);
        System.out.println(a + " raised to the power of " + exponent + ": " + powerResult);


        // Task 7
        System.out.println("Enter the number of elements in the array: ");
        n = scanner.nextInt();

        int[] arrayToReverse = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arrayToReverse[i] = scanner.nextInt();
        }
        System.out.print("Reversed array: ");
        reverseArray(arrayToReverse, arrayToReverse.length);
        System.out.println();


        // Task 8
        System.out.print("Enter a string to check if it consists of only digits: ");
        scanner.nextLine(); // Consume the previous newline character
        String input = scanner.nextLine();
        if (allDigits(input)) {
            System.out.println("The input consists of only digits.");
        } else {
            System.out.println("The input contains non-digit characters.");
        }


        // Task 10
        System.out.print("Enter the first number (a): ");
        int numA = scanner.nextInt();
        System.out.print("Enter the second number (b): ");
        int numB = scanner.nextInt();
        if (numA < 0 || numB < 0) {
            System.out.println("Sorry, try again by entering non-negative numbers.");
        } else {
            int gcdResult = gcd(numA, numB);
            System.out.println("GCD of " + numA + " and " + numB + ": " + gcdResult);
        }


        scanner.close();
    }


 }

