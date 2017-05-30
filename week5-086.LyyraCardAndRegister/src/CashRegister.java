
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private final double economical = 2.5;
    private final double gourmet = 4;
    
    
    public CashRegister() {
        // at start the register has 1000 euros 
        cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens        
       

        if (cashGiven >= economical) {
            economicalSold++;
            cashInRegister += economical;
            return cashGiven - economical;
        } else {
            return cashGiven;
        }

    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        

        if (cashGiven >= gourmet) {
            gourmetSold++;
            cashInRegister += gourmet;
            return cashGiven - gourmet;
        } else {
            return cashGiven;
        }
    }

    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if (card.pay(economical)) {
            economicalSold++;

            return true;
        }
        return false;

    }

    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if (card.pay(gourmet))
        {
            gourmetSold++;

            return true;
        }
        return false;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        
        if (sum > 0) {
            card.loadMoney(sum);
            cashInRegister+=sum;
        }
        
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}