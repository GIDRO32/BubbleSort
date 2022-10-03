import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static String getUserInput(String prompt)
    {
        print(prompt);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine().trim().toLowerCase();
    }
    public static void print(String toPrint)
    {
        System.out.print(toPrint);
    }
    public static int[] getUserArray() {
        int arrayLength = Integer.parseInt(
                getUserInput("How many number to sort: ")
        );
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < arrayLength; ++i)
        {
            numbers[i] = Integer.parseInt(
                    getUserInput("number " + (i + 1) + ": ")
            );
        }
        return numbers;

    }
    public static int[] randArray(int size)
    {
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++)
        {
            array[i] = rand.nextInt(100000);
        }
        Arrays.sort(array);
        return array;
    }
    public static void printArrayOrder(int[] array) {
        System.out.print(Arrays.toString(array));
        print(array[array.length - 1] + "\n");
        Arrays.sort(array);
    }

    public static boolean toContinue() {
        String userInput = getUserInput("Do you want to continue? (Y/N)\n");
        return userInput.equalsIgnoreCase("Y");
    }
    public static void main(String[] args)
    {
        String decision;
        Scanner key = new Scanner(System.in);
        print("type R to generate random array elements.\n type o to make your own elements\n");
        decision = key.nextLine();
        if(decision.equals("o"))
        {
            do {
                int[] arr;
                arr = getUserArray();
                printArrayOrder(arr);
            } while (toContinue());
        }
        else if (decision.equals("r"))
        {
            do {
                int[] arr;
                int arrayLength = Integer.parseInt(
                getUserInput("How many number to sort: ")
        );
                arr = randArray(arrayLength);
                printArrayOrder(arr);
            } while (toContinue());
        }
    }
}