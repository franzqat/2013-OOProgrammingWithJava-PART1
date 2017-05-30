
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added){
        Money m = new Money(this.euros + added.euros, this.cents + added.cents);
        return m;
    }
    
     public boolean less(Money compared){
         if (this.euros < compared.euros) return true;
         if (this.euros == compared.euros && this.cents < compared.cents) return true;
                 return false;
     }
    
    public Money minus(Money decremented){
        
        int eur = this.euros - decremented.euros();
        int cen;
        if (this.cents >= decremented.cents())
         cen = this.cents - decremented.cents();
        else {
             cen = 100 - decremented.cents();
             eur--;}

        if (this.less(decremented)) {
            eur = 0;
            cen = 0;
            Money m = new Money(eur, cen);
            return m;
        }
        if (cen < 0) {
            eur--;
        }

        cen = Math.abs(cen);
        Money m = new Money(eur, cen);
        return m;
    }
}
