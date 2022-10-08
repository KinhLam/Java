package C6_Java.B4;

import java.util.Objects;
import java.util.Vector;

public class TransferThread extends Thread{
    BankAccount fromAccount;
    BankAccount toAccount;
    long amount;

    public TransferThread(BankAccount fromAccount, BankAccount toAccount, long amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    @Override
    public void run(){
        Vector<Object> vt = new Vector<>();
        vt.add(this.getName());
        vt.add(amount);
        vt.add(fromAccount.getNum());
        vt.add(toAccount.getNum());
        if (fromAccount.withdraw(amount)) {
            toAccount.deposit(amount);
            vt.add("Success");
        }
        else{
            vt.add(fromAccount.getErr());
        }
        Main.dtm.addRow(vt);
    }
}
