package com.training.regression.tests;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.eLearningCoursePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginExcelTest {
	private static WebDriver driver;
	private static String baseUrl;
	private static LoginPOM loginPOM;
	private static Properties properties;
	private static ScreenShot screenShot;
	private static eLearningCoursePOM elearningPOM;

	/*@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}*/

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		elearningPOM = new eLearningCoursePOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	/*@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}*/
	
	@Test (priority=1)
	public void validLoginTest(){
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
	}

	@Test(priority=2, dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest(String FirstName, String LastName, String eMail, String phone, String Login, String Password, String Profile) throws InterruptedException, AWTException {
		elearningPOM.clickAdminTab();
		Thread.sleep(2000);
		elearningPOM.dismissAlert();
		elearningPOM.selectAddUserlink();
		elearningPOM.enterUserFirstName(FirstName);
		elearningPOM.enterUserLastName(LastName);
		elearningPOM.enterUserEmailId(eMail); // data need to be changed on every run
		elearningPOM.enterUserPhoneNo(phone);
		elearningPOM.enterUserLoginName(Login); // data need to be changed on every run
		elearningPOM.selectPasswordradio();
		elearningPOM.enterUserPassword(Password); 
		elearningPOM.selectProfile();
		elearningPOM.enterProfileText(Profile);
		//elearningPOM.pressEnter();//enable this Robo press enter step in window and use test.xlsx
		//elearningPOM.selProfileName();
		elearningPOM.pressEnterActMethod();
		elearningPOM.submitAddedUser();

	}

}