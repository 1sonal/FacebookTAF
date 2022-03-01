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
		String randomString="";
		int randomTwoDigits=random.nextInt(num1.length);
		UtilitiesFunctions objUtilitiesFunctions=new UtilitiesFunctions();
		randomString=randomString+num1[randomTwoDigits]+objUtilitiesFunctions.getRandomNumbers(8);
		return randomString;

	}

	public int getRandomNumberInRange(int start,int end){
		return random.nextInt(end+1-start)+start;
	}
	
	public String generateRandomMonth(){
		String[] month={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		int randomMonthnumber=random.nextInt(month.length);
		return month[randomMonthnumber];
	}
	
	public String generateRandomGender(){
		String[] gender={"Female","Male","Custom"};
		int randomGender=random.nextInt(gender.length);
		return gender[randomGender];
	}
	
	
	public String getRandomNumbers(int length){

		String allowedChars="0123456789";
		String randomString="";
		for(int i=0;i<length;i++){
		int rnum= (int) Math.floor(Math.random()*allowedChars.length());
		randomString += allowedChars.substring(rnum, rnum+1);
		}

		return randomString;
		}
	
	public String getRandomString(int length){
		String allowedChars="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		String randomString="";
		for(int i=0;i<length;i++){
		int rnum= (int) Math.floor(Math.random()*allowedChars.length());
		randomString += allowedChars.substring(rnum, rnum+1);
		}

		return randomString;
	}
}
