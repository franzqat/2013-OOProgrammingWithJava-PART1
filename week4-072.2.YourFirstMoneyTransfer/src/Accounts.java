
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account matts = new Account("Matt's account", 1000);
        Account mine = new Account("My account", 0);
        matts.withdrawal(100);
        mine.deposit(100);
        System.out.println(matts);
        System.out.println(mine);
    }

}
