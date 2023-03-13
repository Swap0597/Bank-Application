package Bank.application;

public class Main {
    public static void main(String[] args) {

        SBI account1 = new SBI(50000, "123", "Swapnil");
        HDFC account2 = new HDFC(60000,"666", "Vaishnavi");
        HDFC.rateOfInterest = 10;

        System.out.println(account1.checkBalance("123"));
        System.out.println(account1.withdrawMoney(20000, "123"));
        System.out.println(account1.withdrawMoney(100000,"123"));
        System.out.println(account1.addMoney(80000));
        System.out.println(account1.changePassword("123", "456"));

        System.out.println(account2.checkBalance("666"));
        System.out.println(account2.addMoney(5000));
        System.out.println(account2.calculateTotalInterest(3,"666"));

    }
}