package com.facebook.scripts;

import com.facebook.generic.BaseTest;
import com.facebook.generic.UtilitiesFunctions;
import com.facebook.pagefactory.SignUpPage;

public class FacebookSignUpTest {

		
		
		public static void main(String[] args) {
			UtilitiesFunctions objUtilitiesFunctions=new UtilitiesFunctions();
			SignUpPage objSignUpPage=new SignUpPage();
			objSignUpPage.intialiseEnvironment();
			objSignUpPage.openURL("https://www.facebook.com");
			objSignUpPage.goToLoginPage();
			objSignUpPage.clickOnCreateNewAccount();
			objSignUpPage.goToSignUpPage();
			objSignUpPage.setFirstNameOnSignUpPage(objUtilitiesFunctions.generateRandomString());
			objSignUpPage.setLastNameOnSignUpPage(objUtilitiesFunctions.generateRandomString());
			objSignUpPage.setMobileNumberOnSignUpPage(objUtilitiesFunctions.generateRandomMobileNumber());
			objSignUpPage.setPassword("Alpha690");
			objSignUpPage.setDateOfBirthOnSignUpPage(objUtilitiesFunctions.randomDOBInRange(1, 31));
			objSignUpPage.setMonthOfBirthOnSignUpPage(objUtilitiesFunctions.randomMonthOfBirth());
			objSignUpPage.setYearOfBirthOnSignUpPage(objUtilitiesFunctions.randomYearOfBirthInRange(1909, 2009));
			objSignUpPage.clickOnGenderOnsignUpPage("Female");
			objSignUpPage.clickOnSignUpButton();
			objSignUpPage.goToConfirmationCodePopup();
			objSignUpPage.enterConfirmationCode("56783");
			objSignUpPage.clickUpdateContactInfo();
			objSignUpPage.veryfyUserSignUpSuccessfully();
			objSignUpPage.tearDownEnvironment();

		}

}


