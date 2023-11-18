
package lab2dats;

import java.util.Arrays;
import java.util.Random;
public class Lab2DatS {

    
    public static void main(String[] args) {
        int[] initialArray = {4, 1, 99, 8, 11, 7, 3, 55, 66, 77, 111, 3};
        System.out.println("\n" + Arrays.toString(findTop10Largest(initialArray)));

        long start, end;
        int[] randomArray;

        randomArray = generateRandomArray(100);
        start = System.nanoTime();
        int[] result = findTop10Largest(randomArray);
        end = System.nanoTime();
        System.out.println("\n" + Arrays.toString(result) + "\nComputed in: " + (end - start) + " nanoseconds");

        randomArray = generateRandomArray(1000);
        start = System.nanoTime();
        result = findTop10Largest(randomArray);
        end = System.nanoTime();
        System.out.println("\n" + Arrays.toString(result) + "\nComputed in: " + (end - start) + " nanoseconds");

        randomArray = generateRandomArray(10000);
        start = System.nanoTime();
        result = findTop10Largest(randomArray);
        end = System.nanoTime();
        System.out.println("\n" + Arrays.toString(result) + "\nComputed in: " + (end - start) + " nanoseconds");

        randomArray = generateRandomArray(100000);
        start = System.nanoTime();
        result = findTop10Largest(randomArray);
        end = System.nanoTime();
        System.out.println("\n" + Arrays.toString(result) + "\nComputed in: " + (end - start) + " nanoseconds");

        randomArray = generateRandomArray(1000000);
        start = System.nanoTime();
        result = findTop10Largest(randomArray);
        end = System.nanoTime();
        System.out.println("\n" + Arrays.toString(result) + "\nComputed in: " + (end - start) + " nanoseconds");
    }

    public static int[] findTop10Largest(int[] array) {
        int[] top10Largest = new int[10];
        int maxIndex;
        int currentIndex = 0;

        for (int i = 0; i < 10; i++) {
            int maxVal = array[0];
            maxIndex = 0;

            for (int j = 0; j < array.length - i; j++) {
                if (maxVal < array[j]) {
                    maxVal = array[j];
                    maxIndex = j;
                }
            }

            top10Largest[currentIndex] = maxVal;
            currentIndex++;

            int temp = array[maxIndex];
            array[maxIndex] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        return top10Largest;
    }

    public static int[] generateRandomArray(int size) {
        Random random = new Random(100); // Creating Random object with a seed value
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(); // Storing random integers in an array
        }

        return array;
    }
}
    
    
