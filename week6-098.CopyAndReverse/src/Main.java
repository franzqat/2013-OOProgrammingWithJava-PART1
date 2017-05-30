
import java.util.Arrays;



public class Main {

    public static int[] copy(int[] array){
        return array.clone();
    }
    public static int[] reverseCopy(int[] array){
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[array.length-i-1] = array[i];            
        }
        return reversed;
    
    
    }
    
    public static void main(String[] args) {
        // write testcode here
    int[] original = {1, 2, 3, 4};
    int[] reverse = reverseCopy(original);

    // print both
    System.out.println( "original: " +Arrays.toString(original));
    System.out.println( "reversed: " +Arrays.toString(reverse));
    }
    
}
