package com.facebook.scripts;

import com.facebook.generic.BaseTest;
import com.facebook.generic.UtilitiesFunctions;
import com.facebook.pagefactory.SignUpPage;

public class FacebookSignUpTest {

		
		
		public static void main(String[] args) {
			UtilitiesFunctions objUtilitiesFunctions=new UtilitiesFunctions();
			SignUpPage objSignUpPage=new SignUpPage();
			SignUpPage objectSignUpPage=new SignUpPage("Lata","Dey");
			objSignUpPage.intialiseEnvironment();
			objSignUpPage.openURL("https://www.facebook.com");
			objSignUpPage.goToLoginPage();
			objSignUpPage.clickOnCreateNewAccount();
			objSignUpPage.goToSignUpPage();
			objSignUpPage.setFirstNameOnSignUpPage(objUtilitiesFunctions.getRandomString(4));
			objectSignUpPage.setLastNameOnSignUpPage(objUtilitiesFunctions.getRandomString(4));
			objSignUpPage.setMobileNumberOnSignUpPage(objUtilitiesFunctions.generateRandomMobileNumber());
			objSignUpPage.setPassword(objUtilitiesFunctions.getRandomString(4)+objUtilitiesFunctions.getRandomNumbers(3));
			objSignUpPage.setDateOfBirthOnSignUpPage(objUtilitiesFunctions.getRandomNumberInRange(1, 31));
			objSignUpPage.setMonthOfBirthOnSignUpPage(objUtilitiesFunctions.generateRandomMonth());
			objSignUpPage.setYearOfBirthOnSignUpPage(objUtilitiesFunctions.getRandomNumberInRange(1950, 2009));
			objSignUpPage.clickOnGenderOnsignUpPage(objUtilitiesFunctions.generateRandomGender());
			objSignUpPage.clickOnSignUpButton();
			objSignUpPage.goToConfirmationCodePopup();
			objSignUpPage.enterConfirmationCode("56783");
			objSignUpPage.clickUpdateContactInfo();
			objSignUpPage.veryfyUserSignUpSuccessfully();
			objSignUpPage.tearDownEnvironment();

		}

}


