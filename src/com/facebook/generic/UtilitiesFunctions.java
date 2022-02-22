package com.facebook.generic;

import java.util.Random;

public class UtilitiesFunctions {
	Random random = new Random();
	public String generateRandomString(){
		String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
	    String alphabetic = upperAlphabet + lowerAlphabet;
	    StringBuilder sb = new StringBuilder();

	    // specify length of random string
	    int length = 10;

	    for(int i = 0; i < length; i++) {
	      int index = random.nextInt(alphabetic.length());
	      char randomChar = alphabetic.charAt(index);
          sb.append(randomChar);
	    }

	    String randomString = sb.toString();
	//    System.out.println("Random String is: " + randomString);
	    return randomString;
	}
	
	public String generateRandomMobileNumber(){
		String[] num1={"99","98","94","73","90","96","90"};
		int num2=random.nextInt(10000)+1000;
		int num3=random.nextInt(10000)+1000;
		int randomTwoDigits=random.nextInt(num1.length);
		
		String randomMobileNumber=num1[randomTwoDigits]+num2+num3;
	//	System.out.println(randomMobileNumber);
		return randomMobileNumber;
	}

	public int randomDOBInRange(int start,int end){
	//	System.out.println(random.nextInt(end+1-start)+start);
		return random.nextInt(end+1-start)+start;
	}
	
	public String randomMonthOfBirth(){
		String[] month={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		int randomMonthnumber=random.nextInt(month.length);
		return month[randomMonthnumber];
	}
	
	public int randomYearOfBirthInRange(int start,int end){
		return random.nextInt(end+1-start)+start;
	}
}
