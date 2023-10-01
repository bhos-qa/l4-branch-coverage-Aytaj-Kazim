package org.example;
import java.lang.Math;
import java.io.File;
import java.io.IOException;

public class MathMethod {

    public double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    public String intToBinary(int number) {
        return Integer.toBinaryString(number);
    }

    public int findMax(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    public int calculateSquare(int number) {
        return number * number;
    }

    public boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public double calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public String[] reverseArray(String[] arr) {
        String[] reversed = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
    public void main() {
        try {
            File tempDir = File.createTempFile("mytemp", "");

            if (!tempDir.delete()) {
                throw new IOException("Failed to delete the temporary file");
            }

            if (!tempDir.mkdir()) {
                throw new IOException("Failed to create the temporary directory");
            }

            System.out.println("Temporary directory created: " + tempDir.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error creating temporary directory: " + e.getMessage());
        }
    }
}


