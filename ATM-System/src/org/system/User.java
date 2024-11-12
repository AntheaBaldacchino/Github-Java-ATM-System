package org.system;

import java.time.LocalDateTime;

public class User {
	
	private String firstName;
	private String lastName;
	private LocalDateTime dateOpened;
	
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
		
		return String.format("FirstName: %s\nLastname: %s\nDate Opened: %s", firstName , lastName , dateOpened);
	}

}
