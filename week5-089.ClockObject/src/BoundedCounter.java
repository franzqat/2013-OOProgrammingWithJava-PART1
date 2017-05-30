
public class BoundedCounter {
    
    private int counter;
    private int upperBound;
    
    public BoundedCounter(int upperBound){     
        this.upperBound = upperBound;     
        counter = 0;
    }
    public void next(){
        if (counter == upperBound) {
            counter = 0;
        } else
        counter++;
    }
    

   
    public int getValue() {
        return counter;
    }

    public void setValue(int value) {
        if (value >= 0 && value <= upperBound) {
            counter = value;
        }
    }
    public void resetCounter(){
        counter = 0;
    } 
    public String toString(){
        if (counter < 10) return "0"+counter;
        return ""+counter;
    }
    
    
}
