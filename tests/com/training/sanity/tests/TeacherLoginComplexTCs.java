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
import com.training.pom.elearningTestPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TeacherLoginComplexTCs {

	static WebDriver driver;
	private static String baseUrl;
	private static LoginPOM loginPOM;
	private static eLearningCoursePOM elearningPOM;
	private static Properties properties;
	private static ScreenShot screenShot;
	private static elearningTestPOM elearningOnlineTestPOM;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		elearningPOM = new eLearningCoursePOM(driver);
		elearningOnlineTestPOM = new elearningTestPOM(driver);
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
	public void validTeacherLogin() {
		loginPOM.sendUserName("justeach");
		loginPOM.sendPassword("Chennai2020");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("TC01_Teacher Homepage");
	}
	
	@Test (priority=2)
	public void createTestForTeacherSendReport() {
		elearningPOM.selectSTCMCourse();
		elearningOnlineTestPOM.clickTestIcon();
		elearningOnlineTestPOM.clickCreateTestBtn();
		elearningOnlineTestPOM.enterTestName("Justin Selenium Test");
		elearningOnlineTestPOM.clickCreateTestAdvSettings();
		elearningOnlineTestPOM.enterContextText("Online Quiz");
		elearningOnlineTestPOM.selectFeedbackradio();
		elearningOnlineTestPOM.selectStartTimeChkBox();
		elearningOnlineTestPOM.selectStartTimeWin();
		elearningOnlineTestPOM.selectStartTimeDate(); //select date May 18
		elearningOnlineTestPOM.clickStartTimeDoneBtn();
		elearningOnlineTestPOM.enterPassPercentage("60");
		elearningOnlineTestPOM.clickProceedToQuestionsBtn();
		elearningOnlineTestPOM.clickMultipleChoiceIcon();
		elearningOnlineTestPOM.enterFirstQuestionName("Which language you are Learning");
		elearningOnlineTestPOM.enterFirstChoiceAnswer("Selenium");
		elearningOnlineTestPOM.enterSecondChoiceAnswer("Java");
		elearningOnlineTestPOM.enterThirdChoiceAnswer("C");
		elearningOnlineTestPOM.enterFourthChoiceAnswer("C#");
		elearningOnlineTestPOM.enterScoreforFirstQuestion("1");
		elearningOnlineTestPOM.clickAddQuestiontoTestBTN();
		elearningOnlineTestPOM.clickMultipleChoiceIcon();
		elearningOnlineTestPOM.enterFirstQuestionName("Which language are you using in Selenium");
		elearningOnlineTestPOM.enterFirstChoiceAnswer("Selenium");
		elearningOnlineTestPOM.enterSecondChoiceAnswer("Java");
		elearningOnlineTestPOM.enterThirdChoiceAnswer("C");
		elearningOnlineTestPOM.enterFourthChoiceAnswer("C#");
		elearningOnlineTestPOM.selectOptionSecondRadioBtn();
		elearningOnlineTestPOM.enterScoreforSecondQuestion("1");
		elearningOnlineTestPOM.clickAddQuestiontoTestBTN();
		elearningOnlineTestPOM.clickTestQuestionsPreviewIcon();
		elearningOnlineTestPOM.clickStartTest();
		elearningOnlineTestPOM.selectAnswerforFirstQuestion();
		elearningOnlineTestPOM.clickNextQuestionBtn();
		elearningOnlineTestPOM.selectAnswerforSecondQuestion();
		elearningOnlineTestPOM.clickEndTestBtn();
		elearningOnlineTestPOM.clickProfileIcon();
		elearningOnlineTestPOM.clickLogoutLink();
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn();
		elearningPOM.clickReportingTab();
		elearningOnlineTestPOM.clickFollowedTeachersLink();
		elearningOnlineTestPOM.enterTeachersKeywordSearch("Justin");
		elearningOnlineTestPOM.clickTeacherSearchButton();
		elearningOnlineTestPOM.clickTeacherDetailsButton();
		elearningOnlineTestPOM.clickCourseDetailsButton();
		elearningOnlineTestPOM.clickTestAttemptIcon();
		elearningOnlineTestPOM.selectSendEmailChkbox();
		elearningOnlineTestPOM.clickCorrectTestBtn();
		System.out.println(elearningOnlineTestPOM.emailSentSuccessMsg());
		Assert.assertEquals(elearningOnlineTestPOM.emailSentSuccessMsg(), "Message Sent");
		
	}
	
	@Test (priority=3)
	public void resetTestData() {
		elearningOnlineTestPOM.clickProfileIcon();
		elearningOnlineTestPOM.clickLogoutLink();
		loginPOM.sendUserName("justeach");
		loginPOM.sendPassword("Chennai2020");
		loginPOM.clickLoginBtn();
		elearningPOM.selectSTCMCourse();
		elearningOnlineTestPOM.clickTestIcon();
		elearningOnlineTestPOM.clickDeleteTest();
		elearningPOM.acceptAlert();
		elearningOnlineTestPOM.clickProfileIcon();
		elearningOnlineTestPOM.clickLogoutLink();
	}
	
	@Test (priority=4,enabled=false)
	public void createTestForStudentSendReport() {
		loginPOM.sendUserName("justeach");
		loginPOM.sendPassword("Chennai2020");
		loginPOM.clickLoginBtn();
		elearningPOM.selectSTCMCourse();
		elearningOnlineTestPOM.clickTestIcon();
		elearningOnlineTestPOM.clickCreateTestBtn();
		elearningOnlineTestPOM.enterTestName("Justin Selenium Test");
		elearningOnlineTestPOM.clickCreateTestAdvSettings();
		elearningOnlineTestPOM.enterContextText("Online Quiz");
		elearningOnlineTestPOM.selectFeedbackradio();
		elearningOnlineTestPOM.selectStartTimeChkBox();
		elearningOnlineTestPOM.selectStartTimeWin();
		elearningOnlineTestPOM.selectStartTimeDate(); //select date May 18
		elearningOnlineTestPOM.clickStartTimeDoneBtn();
		elearningOnlineTestPOM.enterPassPercentage("60");
		elearningOnlineTestPOM.clickProceedToQuestionsBtn();
		elearningOnlineTestPOM.clickMultipleChoiceIcon();
		elearningOnlineTestPOM.enterFirstQuestionName("Which language you are Learning");
		elearningOnlineTestPOM.enterFirstChoiceAnswer("Selenium");
		elearningOnlineTestPOM.enterSecondChoiceAnswer("Java");
		elearningOnlineTestPOM.enterThirdChoiceAnswer("C");
		elearningOnlineTestPOM.enterFourthChoiceAnswer("C#");
		elearningOnlineTestPOM.enterScoreforFirstQuestion("1");
		elearningOnlineTestPOM.clickAddQuestiontoTestBTN();
		elearningOnlineTestPOM.clickMultipleChoiceIcon();
		elearningOnlineTestPOM.enterFirstQuestionName("Which language are you using in Selenium");
		elearningOnlineTestPOM.enterFirstChoiceAnswer("Selenium");
		elearningOnlineTestPOM.enterSecondChoiceAnswer("Java");
		elearningOnlineTestPOM.enterThirdChoiceAnswer("C");
		elearningOnlineTestPOM.enterFourthChoiceAnswer("C#");
		elearningOnlineTestPOM.selectOptionSecondRadioBtn();
		elearningOnlineTestPOM.enterScoreforSecondQuestion("1");
		elearningOnlineTestPOM.clickAddQuestiontoTestBTN();
		elearningOnlineTestPOM.clickTestQuestionsPreviewIcon();
		elearningOnlineTestPOM.clickProfileIcon();
		elearningOnlineTestPOM.clickLogoutLink();
		loginPOM.sendUserName("juststudent");
		loginPOM.sendPassword("Chennai890");
		loginPOM.clickLoginBtn();
		elearningPOM.clickCrsCatalog();;
		elearningPOM.search("Selenium Test Case Medium");
		elearningPOM.clickSearch();	
		//screenShot.captureScreenShot("TC02_CourseSearchScreen");
		elearningPOM.courseSubscribe();
		elearningPOM.clickHomePage();
		elearningPOM.selectSTCMCourse();
		elearningPOM.clickTestIconStudent();
		elearningPOM.selTestName();
		elearningOnlineTestPOM.clickStartTest();
		elearningOnlineTestPOM.selectAnswerforFirstQuestion();
		elearningOnlineTestPOM.clickNextQuestionBtn();
		elearningOnlineTestPOM.selectAnswerforSecondQuestion();
		elearningOnlineTestPOM.clickEndTestBtn();
		elearningOnlineTestPOM.clickProfileIcon();
		elearningOnlineTestPOM.clickLogoutLink();
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn();
		elearningPOM.clickReportingTab();
		elearningOnlineTestPOM.clickFollowedStudentsLink();;
		elearningOnlineTestPOM.enterTeachersKeywordSearch("Justin");
		elearningOnlineTestPOM.clickTeacherSearchButton();
		elearningOnlineTestPOM.clickStudentDetailsButton();
		elearningOnlineTestPOM.clickStudentCourseDetailsButton();
		elearningOnlineTestPOM.clickTestAttemptIcon();
		elearningOnlineTestPOM.selectSendEmailChkbox();
		elearningOnlineTestPOM.clickCorrectTestBtn();
		System.out.println(elearningOnlineTestPOM.emailSentSuccessMsg());
		Assert.assertEquals(elearningOnlineTestPOM.emailSentSuccessMsg(), "Message Sent");
		
	}
	
}