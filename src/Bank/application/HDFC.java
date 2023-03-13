package Bank.application;

import java.util.UUID;

public class HDFC implements BankInterface{
    private int balance;
    private String accountNo;
    private String password;
    public String name;
    public static double rateOfInterest ;


    public HDFC(int balance, String password, String name) {
        this.accountNo = UUID.randomUUID().toString();
        this.balance = balance;
        this.password = password;
        this.name = name;
    }

    @Override
    public int checkBalance(String password) {
        if(this.password == password){
            return balance;
        }
        else{
            return -1;
        }
    }

    @Override
    public String addMoney(int money) {

        balance = balance + money;
        return money + "has been added to Account No: "+ accountNo
                +"\n Total Balance is : " + balance;
    }

    @Override
    public String withdrawMoney(int moneyToWithdraw, String password) {
        if(this.password == password){
            if(moneyToWithdraw < balance){
                balance = balance - moneyToWithdraw;
                return moneyToWithdraw + " Rs. withdrawn \n Current Balance is: " + balance;
            }
            else{
                return "Insufficient Balance";
            }
        }
        else{
            return "Incorrect Password";
        }
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword)){
            this.password = newPassword;
            return  "Password updated Successfully";
        }
        else{
            return "Incorrect password";
        }
    }

    @Override
    public double calculateTotalInterest(int years, String password) {

        double interest = balance * rateOfInterest * years / 100;
        return interest;
    }
}
