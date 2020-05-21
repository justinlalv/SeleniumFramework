package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.eLearningCoursePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class AdminLogin {

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
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("TC02_Adminpage");
	}
	
	@Test (priority=2,enabled=true)
	public void categoryCourseCreation() throws InterruptedException,AWTException {
		Thread.sleep(2000);
		elearningPOM.dismissAlert();
		elearningPOM.clickCourseCategories();	
		elearningPOM.clickNewCategoriesIcon();
		elearningPOM.enterCategoryCode("JT3");// data need to be changed on every run
		elearningPOM.enterCategoryName("Just Test3");// data need to be changed on every run
		elearningPOM.selectAddCRSCategoryRadio();
		elearningPOM.clickAddCategoryBtn();
		screenShot.captureScreenShot("TC02_Add category Success");
		System.out.println(elearningPOM.getAddCategoryMsg());
		Assert.assertEquals(elearningPOM.getAddCategoryMsg(), "Created");
		elearningPOM.clickAdminTab();
		Thread.sleep(2000);
		elearningPOM.dismissAlert();
		elearningPOM.clickCreateCourse();
		elearningPOM.enterCourseTitle("Justin Test Course3"); // data need to be changed on every run
		elearningPOM.enterCourseCode("JTC3"); // data need to be changed on every run
		elearningPOM.selectTeachers("Man");
		//elearningPOM.pressEnter(); -- Robo class not working on Mac
		elearningPOM.pressEnterActMethod();
		//elearningPOM.selectTeacherName(); //workaround to find element and click it.
		elearningPOM.clickCourseCategory();
		elearningPOM.enterCourseCategoryName("Blended");
		//elearningPOM.pressEnter(); -- Robo class not working on Mac
		elearningPOM.pressEnterActMethod();
		//elearningPOM.selectCourseCategoryName(); //workaround to find element and click it.
		System.out.println(elearningPOM.getSelectedLang());
		elearningPOM.clickSubmitCourseCreation();
		elearningPOM.enterCourseSearch("Justin");
		elearningPOM.clickCourseSearch();
		screenShot.captureScreenShot("TC02_Course Search page");
		
				
    } 
	
	@Test (priority=3,enabled=false)
	public void addUser() throws InterruptedException {
		elearningPOM.clickAdminTab();
		Thread.sleep(2000);
		elearningPOM.dismissAlert();
		elearningPOM.selectAddUserlink();
		elearningPOM.enterUserFirstName("Manzoor");
		elearningPOM.enterUserLastName("Mehadi");
		elearningPOM.enterUserPhoneNo("9876543210");
		elearningPOM.enterUserEmailId("justinv123@gmail.com"); // data need to be changed on every run
		elearningPOM.enterUserLoginName("justinlalv123"); // data need to be changed on every run
		elearningPOM.selectPasswordradio();
		elearningPOM.enterUserPassword("test123"); 
		elearningPOM.selectProfile();
		elearningPOM.enterProfileText("Trainer");
		elearningPOM.selProfileName();
		elearningPOM.submitAddedUser();
		screenShot.captureScreenShot("TC03_Add User Success");
		System.out.println(elearningPOM.addUserSuccessMsg());
		Assert.assertEquals(elearningPOM.addUserSuccessMsg(), "The user has been added: Manzoor Mehadi"); //Based on First and Last name the expected result name need to be updated
	    elearningPOM.clickAdminTab();
		Thread.sleep(2000);
		elearningPOM.dismissAlert();
		elearningPOM.clickAddUsertoCourseLink();
		elearningPOM.selectUserListFilter();
		elearningPOM.selectUserinList();
		elearningPOM.selectCourseListFilter();
		elearningPOM.selectCourseinList();
		elearningPOM.clickAddUsertoCoursesBtn();
		Assert.assertEquals(elearningPOM.getSuccessMsgUserAddedToCourse(), "The selected users are subscribed to the selected course");
		screenShot.captureScreenShot("TC03_Add User to Course Success Msg");
		System.out.println(elearningPOM.getSuccessMsgUserAddedToCourse());
	}	
}