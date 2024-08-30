package com.template;

import java.util.LinkedList;
import java.util.List;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        // TODO: Implement this method
        return a + b;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        // TODO: Implement this method
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        // TODO: Implement this method
        int currentMax = a;
        if (currentMax < b) {
            currentMax = b;
        } else {
            currentMax = a;
        }
        return currentMax;
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        // TODO: Implement this method
        int currentFactorial = 1;
        for (int i = 1; i <= n; i++) {
            currentFactorial *= i;
        }
        return currentFactorial;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        // TODO: Implement this method
        return input.length();
    }

    // 6. Reverse a String
    public String reverse(String input) {
        // TODO: Implement this method
        String currentReverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            currentReverse += input.charAt(i);
        }
        return currentReverse;
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        // TODO: Implement this method
        boolean conditionOfPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                conditionOfPrime = false;
            }
        }
        return conditionOfPrime;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        // TODO: Implement this method
        List<Integer> workOverList = new LinkedList<>();
        for (int i : array) {
            workOverList.add(i);
        }
        int currentMin = workOverList.get(0);
        for (int i : workOverList) {
            if (i <= currentMin) {
                currentMin = i;
            }
        }
        return currentMin;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        // TODO: Implement this method
        int currentSum = 0;
        for (int i : array) {
            currentSum += i;
        }
        return currentSum;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        // TODO: Implement this method
        return 1.8 * celsius + 32;
    }

    public static void main(String[] args) {
    }
}
