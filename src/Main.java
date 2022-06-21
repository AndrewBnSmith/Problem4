import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Please enter a number greater than 10");
            n = scanner.nextInt();
        } while (n < 10);

        int[] intArray = new int[n];
        Random randomNum = new Random();
        int min = 2;
        int max = 75;
        int sum = 0;

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = randomNum.nextInt(max - min) + min;
        }
        sum += intArray[2] + intArray[5] + intArray[7] + intArray[9];
        System.out.println("Before swap:" + "\n" + Arrays.toString(intArray));
        System.out.println("Sum of elements at indexes 2, 5, 7, and 9 is: " + sum);

        int temp = intArray[2];
        int temp1 = intArray[6];
        int temp2 = intArray[4];
        int temp3 = intArray[7];
        int sum1 = 0;

        for (int i = 0; i < intArray.length; i++) {

            intArray[2] = temp1;
            intArray[6] = temp;
            intArray[4] = temp3;
            intArray[7] = temp2;

        }
        sum1 += intArray[2] + intArray[5] + intArray[7] + intArray[9];
        System.out.println("After swap: " + "\n" + Arrays.toString(intArray));
        System.out.println("Sum of elements at indexes 2, 5, 7, and 9 is: " + sum1);

    }
}