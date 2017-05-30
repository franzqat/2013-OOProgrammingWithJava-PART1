public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;

        while (beginning <= end) {
            int middle = (beginning + end) / 2;
            if (array[middle] == searchedValue) {
                return true;
            }
            
            
            // restrict the search area 
                        if (searchedValue < array[middle]) {
                //parte di sotto
                            end=array[middle]-1;
            } else{
                    //parte di sopra
                          beginning = array[middle]+1;
                        }
        }
        return false;
    }
}
