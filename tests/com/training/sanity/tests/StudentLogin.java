package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.eLearningCoursePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class StudentLogin {

	static WebDriver driver;
	private static String baseUrl;
	private static LoginPOM loginPOM;
	private static eLearningCoursePOM elearningPOM;
	private static Properties properties;
	private static ScreenShot screenShot;

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
		Thread.sleep(8000);
		driver.quit();
	}*/

	@Test (priority=1)
	public void validLoginTest() {
		loginPOM.sendUserName("juststudent");
		loginPOM.sendPassword("Chennai890");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("TC01_StudentHomepage");
	}
	
	@Test (priority=2)
	public void courseProject_taskComment () {
		elearningPOM.clickCrsCatalog();;
		elearningPOM.search("Selenium Test Case Medium");
		elearningPOM.clickSearch();	
		screenShot.captureScreenShot("TC02_CourseSearchScreen");
		elearningPOM.courseSubscribe();
		elearningPOM.clickHomePage();
		elearningPOM.selectSTCMCourse();
		elearningPOM.selectSTCMProject();
		elearningPOM.selectSTCMTask();
		elearningPOM.clickProjectHome();
		elearningPOM.clickProjectTask();
		elearningPOM.enterTaskTitle("Test Title");
		elearningPOM.entercomment("Test comments");
		elearningPOM.clickTaskSaveBtn();
		screenShot.captureScreenShot("TC01_Add Comment Success");
	}
	
	@Test (priority=3)
	public void unsubscribeCourse () {
		elearningPOM.clickHomePage();
		elearningPOM.clickUnsubsCourse();
		
	}
	
}

