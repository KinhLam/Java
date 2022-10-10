package C6_Java_B4;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BankAccount extends Thread{
    long amount = 100000;
    private int num;
    private String err;

    public BankAccount(int num){
        this.num = num;
    }

    public long getAmount() {
        return amount;
    }

    public int getNum() {
        return num;
    }

    public String getErr() {
        return err;
    }

    //Hàm kiểm tra
    public boolean checkAccountBalance(long withDrawAmount){
        //Giả lập thời gian
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();}
        if (withDrawAmount <= amount){
            //cho phép rút tiền
            return true;
        }
        return false;
    }

    //Hàm đồng bộ
    public synchronized boolean withdraw(long withdrawAmount){
        //In thông tin người rút
        System.out.println("Bank id"+ num+" check: "+withdrawAmount);
        if (checkAccountBalance(withdrawAmount)){
            try{
                //Giả lập thời gian rút tiền
                //Cập nhật số tiền còn lại và cơ sở dữ liệu
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                Logger.getLogger(BankAccount.class.getName()).log(Level.SEVERE,null,ex);
            }
            amount-= withdrawAmount;
            System.out.println("Bank id: "+num+" withdraw successful: "+withdrawAmount);
        }
        else {
            System.out.println("Bank id: "+num+" witchdraw error");
            this.err="Transfer error";
            return false;
        }
        //In ra số dư tài khoản
        System.out.println("Bank id: "+num+" see balance "+amount);
        return true;
    }
    public synchronized void deposit(long amount){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException ex){
            Logger.getLogger(BankAccount.class.getName()).log(Level.SEVERE,null,ex);
        }
        this.amount+=amount;
        System.out.println("Bank id "+num+"deposit successful: "+amount);
    }
}
