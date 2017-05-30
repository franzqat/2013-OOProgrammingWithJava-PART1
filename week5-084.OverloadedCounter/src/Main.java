public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter start = new Counter (50);
        Counter check = new Counter (true);
        Counter c = new Counter (900,false);
        
        c.decrease();
        System.out.println(c.value());
        if (c.value()== 899) System.out.println("TEST DECREASE OK");
        else System.out.println("TEST NO DECREASE");
                
        
                
                
    }
}
