package org.system;

import java.time.LocalDateTime;
import java.time.LocalDate;

public class User {
	
	//[Key]
			
	private int Id;
	private String firstName;
	private String lastName;
	private LocalDate dob;
	LocalDateTime dateOpened;
	
	private String username;
	private String password;
	private BankAccount account;
	
	public User (String username, String password, String firstName
			,String lastName, LocalDateTime dateOpened) {
		this.username = username;
		this.password = password;
		this.account = new BankAccount();
	}
	
	public String GetInfo() {
		
		return String.format("First Name: %s\nLast Name: %s\nDate Opened: %s", firstName , lastName , dateOpened);
	}
	
	public String ChangeofSurname(String newSurname)
	{
		 this.lastName = newSurname;
		
		 return this.lastName;
	}
	
    public boolean authenticate(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public BankAccount getAccount() {
        return account;
    }
    
    public boolean isValidPassword(String password) {
        return password.length() > 8; // Example check
    }


}
