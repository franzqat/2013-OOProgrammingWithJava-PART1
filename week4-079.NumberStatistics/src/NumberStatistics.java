
public class NumberStatistics {
    
    private int amountOfNumbers;
    private int sum;
    
    public NumberStatistics (){
        amountOfNumbers = 0;
        sum = 0;
    }
    
    public void addNumber(int number){
        amountOfNumbers++;
        sum+=number;
    }
    public int sum(){
        return sum;

    }
    public int amountOfNumbers(){
        return amountOfNumbers; 
    }
    public double average(){
        if (sum == 0) return 0; 
        return sum/(amountOfNumbers * 1.0);
    }
}
