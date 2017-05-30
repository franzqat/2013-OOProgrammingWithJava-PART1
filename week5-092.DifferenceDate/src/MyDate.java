public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
 

    public int differenceInYears(MyDate comparedDate) {  
        int dif;
        if ((year - comparedDate.year) >= 1 && month >= comparedDate.month) {
            if (day < comparedDate.day) {
                System.out.println("Test DAY");
                return Math.abs(year - comparedDate.year); 
            }
            
           return Math.abs(year - comparedDate.year);
        }

            dif= Math.abs(year - comparedDate.year) -1;
        
        return dif ;
}

}