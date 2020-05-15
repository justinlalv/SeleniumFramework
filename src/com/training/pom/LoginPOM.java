package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//Login Scenarios Elements
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	//Edit Profile Scenarios Elements
	@FindBy(linkText="Edit profile")
	private WebElement editProfile;
	
	@FindBy(id="profile_password0")
	private WebElement pass;
	
	@FindBy(id="password1")
	private WebElement newPass;
	
	@FindBy(id="profile_password2")
	private WebElement confirmPass;
	
	@FindBy(xpath="//button[@id='profile_apply_change']")
	private WebElement saveSettings;
	
	//Lost Password link Scenario
	@FindBy(partialLinkText="lost")
	private WebElement lostPassword;
	
	@FindBy(id="lost_password_user")
	private WebElement lostunemail;
	
	@FindBy(xpath="//button[@id='lost_password_submit']")
	private WebElement sendMsgButton;
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clickEditProfile() {
		this.editProfile.click();
	}
	
	public void enterPass(String password1) {
		this.pass.sendKeys(password1); 
	}
	
	public void enterNewPass(String password2) {
		this.newPass.sendKeys(password2); 
	}
	
	public void enterConfirmPass(String password3) {
		this.confirmPass.sendKeys(password3); 
	}
	
	public void clickSaveSettings() {
		this.saveSettings.click();
	}
	
	public void clickLostPassLink() {
		this.lostPassword.click();
	}
	
	public void enterLostUnemail(String password3) {
		this.lostunemail.sendKeys(password3); 
	}
	
	public void clickSendMsgButton() {
		this.sendMsgButton.click();
	}
	
}
