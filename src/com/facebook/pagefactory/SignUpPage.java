package com.facebook.pagefactory;

import com.facebook.generic.BaseTest;

public class SignUpPage extends BaseTest {
			String userName;
			String lastName;
			public SignUpPage(){
				userName="Raj";
				lastName="Sinha";
			}
			public SignUpPage(String userName,String lastName){
				this.userName=userName;
				this.lastName=lastName;
			}
	
	        //Step 1 : open browser
			//Step 2 : open URL
			//Step 3 : navigate to login page
			//Step 4 : click on 'create new account'
			//Step 5 : navigate to signup page
			//Step 6 : enter first name
			//Step 7 : enter last name
			//Step 8 : enter mob number
			//Step 9 : enter password
			//Step 10 : enter date of birth
			//Step 11 : click on gender
			//Step 12 : click on signup
			//Step 13 : Go to Confirmation code popup
			//Step 14 : enter Confirmation Code
			//Step 15 : Click Update Contact Info
			//Step 16 : verify signup
			//Step 17 : close browser 
			
			//Step 1
			public void intialiseEnvironment(){
				this.beforeMethod();
			}
			
			//Step 2
			public void openURL(String URL){
				System.out.println("Open URL : "+URL);
			}
			
			//Step 3
			public void goToLoginPage(){
				System.out.println("Navigate to Login page");
			}
			
			//Step 4
			public void clickOnCreateNewAccount(){
				System.out.println("Click 'Create New Account' button");
			}
			
			//Step 5
			public void goToSignUpPage(){
				System.out.println("Navigate to Sign Up page");
			}
			
			//Step 6
			public void setFirstNameOnSignUpPage(String strFirstName){
				System.out.println("First Name:"+ userName+"_"+strFirstName);
			}
			
			//Step 7
			public void setLastNameOnSignUpPage(String strLastName){
				System.out.println("Last Name:"+lastName+"_"+strLastName);
			}
			
			//Step 8
			public void setMobileNumberOnSignUpPage(String mobileNumber){
				System.out.println("Mobile number:"+mobileNumber);
			}
			
			//Step 9
			public void setPassword(String password){
				System.out.println("Password:"+password);
			}
			
			//Step 10
			public void setDateOfBirthOnSignUpPage(int dateOfBirth){
				System.out.println("Date of birth:"+dateOfBirth);
			}
			
			//Step 11
			public void setMonthOfBirthOnSignUpPage(String monthOfBirth){
				System.out.println("Month of birth:"+monthOfBirth);
			}
			
			//Step 12
			public void setYearOfBirthOnSignUpPage(int yearOfBirth){
				System.out.println("Year of Birth:"+yearOfBirth);
			}
			
			//Step 13
			public void clickOnGenderOnsignUpPage(String gender){
				System.out.println("Gender:" + gender);
			}
			
			//Step 14
			public void clickOnSignUpButton(){
				System.out.println("Click on 'Sign Up' button");
			}
			
			//Step 15
			public void goToConfirmationCodePopup(){
				System.out.println("Go to Confirmation code popup");
			}
			
			//Step 16
			public void enterConfirmationCode(String code){
				System.out.println("Confirmation code:"+code);
			}
			
			//Step 17
			public void clickUpdateContactInfo(){
				System.out.println("Click 'Update Contact Info'");
			}
			
			//Step 18
			public void veryfyUserSignUpSuccessfully(){
				System.out.println("Verify user is registered into the system");
			}
			
			//Step 17
			public void tearDownEnvironment(){
				this.afterMethod();
			}
			

}
