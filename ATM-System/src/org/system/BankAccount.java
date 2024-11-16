package org.system;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
	
	protected double balance;
	private List<String> transactionLog;
	
    public BankAccount() {
        this.balance = 0.0;
        this.transactionLog = new ArrayList<>();
    }
	
    public double GetBalance()
    {
    	return balance;
    }
    
    public void Deposit(double amount) {
    	
    	if (amount <= 0) {
    		
    	    throw new IllegalArgumentException("Deposit amount must be greater than €0.00.");
    	    
    	}else {
    		
    		this.balance += balance;
    		transactionLog.add("The amount of " + amount + " has been added.");
    		transactionLog.add("New balance is " + this.balance);
    	}
    	
    	


    }
    
    
    public void Withdraw(double amount) {
    	
    	//if user has <= o in balance
    	if(amount > 0 && amount <= balance) {
    		
    		this.balance -= amount;
    		transactionLog.add("The amount withdrew has been successful.\nWithdrew : €"+ amount);
    		transactionLog.add("New balance is: €" + this.balance);
    	}else {
    		  throw new IllegalArgumentException("Withdrawal amount must be greater than €0.00 and less than or equal to the current balance.");
    	}
    	
    }
    
    public List<String> getTransactionHistory() {
        return transactionLog;
    }
}
