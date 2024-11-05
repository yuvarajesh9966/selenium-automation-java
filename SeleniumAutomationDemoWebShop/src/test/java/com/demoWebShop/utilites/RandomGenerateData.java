package com.demoWebShop.utilites;

import java.util.Random;

public class RandomGenerateData {
	
	String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwaxyz1234567890";

	
	public String validName() {
		StringBuilder buildName = new StringBuilder();
		Random random = new Random();
		
		int len = 10;
		
		for(int i =0; i<=len;i++) {
			int index = random.nextInt(letters.length());
			char text = letters.charAt(index);
			buildName.append(text);
		}
		
		return buildName.toString();
	}
	

	public String validEmail() {
		StringBuilder buildName = new StringBuilder();
		Random random = new Random();
		
		int len = 10;
		
		for(int i =0; i<=len;i++) {
			int index = random.nextInt(letters.length());
			char text = letters.charAt(index);
			buildName.append(text);
		}
		
		return buildName.toString()+"@gmail.com";
	}
	
	public String validPassword() {
		StringBuilder buildName = new StringBuilder();
		Random random = new Random();
		
		int len = 10;
		
		for(int i =0; i<=len;i++) {
			int index = random.nextInt(letters.length());
			char text = letters.charAt(index);
			buildName.append(text);
		}
		
		return buildName.toString();
	}
	
	
	

}
