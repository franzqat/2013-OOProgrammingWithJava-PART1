
public class Main {

    public static void main(String[] args) {
        // Test your code here
        NightSky NightSky = new NightSky(0.4, 20, 10);
        NightSky.print();
        
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
    }
}
