public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        hours = new BoundedCounter(23); //24-1!!!!
        hours.setValue(hoursAtBeginning);
        minutes = new BoundedCounter(59); //60-1!!!!
        minutes.setValue(minutesAtBeginning);
        seconds = new BoundedCounter(59);
        seconds.setValue(secondsAtBeginning);
    }
    
//    public void tick() {
//        // Clock advances by one second
//          seconds.next();
//        if (seconds.getValue() == 60) {
//            minutes.next();
//            seconds.resetCounter();
//        }
//
//        if (minutes.getValue() == 60) {
//            hours.next();
//            minutes.resetCounter();
//        }
//        if (hours.getValue() == 24) {
//            hours.resetCounter();
//        }
//        
//
//
//    }
//    
//    
        public void tick() {
        // Clock advances by one second
        seconds.next();
        if (seconds.getValue() == 0) {
            minutes.next();
            if (minutes.getValue() == 0) {
                hours.next();
            }
        }
    }
    public String toString() {
        // returns the string representation
        return hours + ":" + minutes + ":" + seconds;
    }
}
