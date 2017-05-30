
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }
/*
    public static void sort(int[] array) {
        int min;
        for (int index = 0; index < array.length; index++) {
            min = index;
            System.out.println(Arrays.toString(array));
            for (int i = index + 1; i < array.length; i++) {
                if (array[i] < array[min]) {
                    min = i;
                }
                swap(array, min, i);
            }
            System.out.println(Arrays.toString(array));

        }
    }
*/
    
    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
             printArray(array);
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
             printArray(array);
        }
       
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static int smallest(int[] array) {
        // write the code herei
        int small = array[0];
        for (int s : array) {
            if (s < small) {
                small = s;
            }
        }
        return small;

    }

    public static int indexOfTheSmallest(int[] array) {
     return indexOfTheSmallestStartingFrom(array, 0);

    }
    
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // write the code here
        // code goes here
        if (index < array.length) {
            int min = array[index];
            int ind = index;
            for (int i = index; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                    ind = i;
                }
            }
            return ind;

        }
        return 0;
    }

    public static void swap(int[] array, int index1, int index2) {
    // code goes here
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
  
}
  

