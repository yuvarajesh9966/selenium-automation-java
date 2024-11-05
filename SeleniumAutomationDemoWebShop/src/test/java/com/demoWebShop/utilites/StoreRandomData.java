package com.demoWebShop.utilites;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;

public class StoreRandomData {
	
	private int fileNumber = 0;
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	public StoreRandomData() throws Exception {
		RandomGenerateData rgd = new RandomGenerateData();
		firstName = rgd.validName();
		lastName = rgd.validName();
		email = rgd.validEmail();
		password = rgd.validPassword();
		storeInFile();
	}
	
	public void storeInFile() throws Exception {
		
		File f = new File(System.getProperty("user.dir")+"/RegistrationDataRandomGenerated/credentials"+fileNumber+".txt");
		
		if(f.exists() && f.length()>1024*1024) {
			fileNumber+=1;
			
			while(true) {
				f = new File(System.getProperty("user.dir")+"/RegistrationDataRandomGenerated/credentials"+fileNumber+".txt");
				if(f.exists() && f.length()<1024*1024) {
					break;
				}
				fileNumber+=1;
			}
		}
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(f,true));
		writer.write("Date and Time \t"+LocalDateTime.now()+"\n");
		writer.write("First Name \t"+firstName+"\n");
		writer.write("Last Name \t"+lastName+"\n");
		writer.write("Email \t"+email+"\n");
		writer.write("Password \t"+password+"\n");
		writer.write("....................................\n");
		
		writer.flush();
		writer.close();
		System.out.println("Data Wrote Successfully...");
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	
}
