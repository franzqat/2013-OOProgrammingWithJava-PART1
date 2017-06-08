import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum =0;
        for ( Integer number : list) sum +=number;
        return sum;
    }
    

    public static double average(ArrayList<Integer> list) {
        // write code here
        
        return sum(list)/(list.size()*1.0);
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double var =0;
        double average = average(list);
        for (int num : list)  var+=Math.pow(num - average,2);
        var/=(list.size()-1);
        return var;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
