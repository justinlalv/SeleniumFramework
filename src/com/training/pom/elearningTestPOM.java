package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class elearningTestPOM {
	private WebDriver driver; 
	
	public elearningTestPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	//Test Elements
	@FindBy(xpath="//img[@id='toolimage_10861']")
	private WebElement testIcon;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement createTestBtn;
	
	@FindBy(xpath="//input[@id='exercise_title']")
	private WebElement testNameInputBox;
	
	@FindBy(xpath="//button[@id='advanced_params']")
	private WebElement createTestAdvSettings;
	
	@FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset']")
	private WebElement testContextIframe;
	
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	private WebElement testContextText;
	
	@FindBy(xpath="//input[@id='exerciseType_0']")
	private WebElement feedbackradio;
	
	@FindBy(xpath="//input[@onclick='activate_start_date()']")
	private WebElement enableStartTimeChkbox;
	
	@FindBy(xpath="//p[@id='start_time_alt_text']")
	private WebElement selectStartTime;
	
	@FindBy(xpath="//a[contains(text(),'18')]")
	private WebElement selectStartTimeDate;
	
	@FindBy(xpath="//button[@class='ui-datepicker-close ui-state-default ui-priority-primary ui-corner-all']")
	private WebElement startTimeDoneBtn;
    
	@FindBy(xpath="//input[@id='pass_percentage']")
	private WebElement passPercentageTextBox;
	
	@FindBy(xpath="//button[@class=' btn btn-primary ']")
	private WebElement proceedToQuestionsBtn;
	
	@FindBy(xpath="//img[@title='Multiple choice']")
	private WebElement multipleChoiceIcon;
	
	@FindBy(xpath="//input[@id='question_admin_form_questionName']")
	private WebElement firstQuestionName;
	
	@FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset' and @aria-describedby='cke_112']")
	private WebElement firstChoiceAnswerIframe;
	
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	private WebElement firstChoiceAnswerInput;
	
	@FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset' and @aria-describedby='cke_166']")
	private WebElement secondChoiceAnswerIframe;
	
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	private WebElement secondChoiceAnswerInput;
	
	@FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset' and @aria-describedby='cke_220']")
	private WebElement thirdChoiceAnswerIframe;
	
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	private WebElement thirdChoiceAnswerInput;
	
	@FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset' and @aria-describedby='cke_274']")
	private WebElement fourthChoiceAnswerIframe;
	
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	private WebElement fourthChoiceAnswerInput;
	
	@FindBy(xpath="//input[@type='radio' and @value='1']")
	private WebElement selectFirstRadioBtn;
	
	@FindBy(xpath="//input[@type='radio' and @value='2']")
	private WebElement selectSecondRadioBtn;
	
	@FindBy(xpath="//input[@type='radio' and @value='3']")
	private WebElement selectThirdRadioBtn;
	
	@FindBy(xpath="//input[@type='radio' and @value='4']")
	private WebElement selectFourthRadioBtn;
	
	@FindBy(xpath="//input[@id='question_admin_form_weighting[1]']")
	private WebElement scoreforFirstQuestion;
	
	@FindBy(xpath="//input[@id='question_admin_form_weighting[2]']")
	private WebElement scoreforSecondQuestion;
	
	@FindBy(xpath="//input[@id='question_admin_form_weighting[3]']")
	private WebElement scoreforThirdQuestion;
	
	@FindBy(xpath="//input[@id='question_admin_form_weighting[4]']")
	private WebElement scoreforFourthQuestion;
	
	@FindBy(xpath="//button[@id='submit-question']")
	private WebElement addQuestionToTestBtn;
	
	@FindBy(xpath="//img[@title='Preview']")
	private WebElement testPreviewIcon;
	
	@FindBy(xpath="//a[@class='btn btn-success btn-large']")
	private WebElement startTestBtn;
	
	@FindBy(xpath="//p[contains(text(),'Selenium')]")
	private WebElement answerFirstQuestionRadio;
	
	@FindBy(xpath="//p[contains(text(),'Java')]")
	private WebElement answerSecondQuestionRadio;
	
	@FindBy(xpath="//button[@name='save_now']")
	private WebElement nextQuestionBtn;
	
	@FindBy(xpath="//button[@name='save_now']")
	private WebElement endTestBtn;
	
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	private WebElement profileIcon;
	
	@FindBy(xpath="//a[@id='logout_button']")
	private WebElement logoutLink;
	
	@FindBy(xpath="//button[@id='form-email_submit']")
	private WebElement correctTestBtn;
	
	
	//Admin Login page Elements
	
	@FindBy(xpath="//a[contains(text(),'Followed teachers')]")
	private WebElement followedTeachersLink;
	
	@FindBy(xpath="//a[contains(text(),'Followed students')]")
	private WebElement followedStudentsLink;
	
	@FindBy(xpath="//input[@id='search_user_keyword']")
	private WebElement teachersKeywordSearch;
	
	@FindBy(xpath="//button[@id='search_user_submit']")
	private WebElement teachersSearchBtn;
	
	@FindBy(xpath="//img[@title='Details justeach']")
	private WebElement teacherDetailsBtn;
	
	@FindBy(xpath="//img[@title='Details juststudent']")
	private WebElement studentDetailsBtn;
	
	@FindBy(xpath="//tr[1]//td[7]//img[@title='Details']")
	private WebElement courseDetailsBtn;
	
	@FindBy(xpath="//tr[4]//td[7]//img[@title='Details']")
	private WebElement studentCourseDetailsBtn;
	
	@FindBy(xpath="//td[5]//a[1]//img[@title='Test']")
	private WebElement testAttemptIcon;
	
	@FindBy(xpath="//input[@onclick='openEmailWrapper();']")
	private WebElement sendEmailChkbox;
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement emailSentMsg;
	
	@FindBy(xpath="//img[@title='Delete']")
	private WebElement deleteTest;
	
	//WebElements logic Methods
	public void clickTestIcon() {
	    this.testIcon.click();
		}
	
	public void clickCreateTestBtn() {
	    this.createTestBtn.click();
		}
	
	public void enterTestName(String text) {
	    this.testNameInputBox.click();
	    this.testNameInputBox.sendKeys(text);
		}
	
	public void clickCreateTestAdvSettings() {
	    this.createTestAdvSettings.click();
		}
	
	public void enterContextText(String text) {
		driver.switchTo().frame(testContextIframe);
		this.testContextText.sendKeys(text);
		driver.switchTo().defaultContent();
	}
	
	public void selectFeedbackradio() {
	    this.feedbackradio.click();
		}
	
	public void selectStartTimeChkBox() {
	    this.enableStartTimeChkbox.click();
		}
	
	public void selectStartTimeWin() {
	    this.selectStartTime.click();
		}
	
	public void selectStartTimeDate() {
	    this.selectStartTimeDate.click();
		}	
	
	public void clickStartTimeDoneBtn() {
	    this.startTimeDoneBtn.click();
		}
	
	public void enterPassPercentage(String text) {
	    this.passPercentageTextBox.click();
	    this.passPercentageTextBox.sendKeys(text);
		}
	
	public void clickProceedToQuestionsBtn() {
	    this.proceedToQuestionsBtn.click();
		}
	
	public void clickMultipleChoiceIcon() {
	    this.multipleChoiceIcon.click();
		}
	
	public void enterFirstQuestionName(String text) {
	    this.firstQuestionName.click();
	    this.firstQuestionName.sendKeys(text);
		}
	
	public void enterFirstChoiceAnswer(String text) {
		driver.switchTo().frame(firstChoiceAnswerIframe);
		this.firstChoiceAnswerInput.sendKeys(text);
		driver.switchTo().defaultContent();
	}
	
	public void enterSecondChoiceAnswer(String text) {
		driver.switchTo().frame(secondChoiceAnswerIframe);
		this.secondChoiceAnswerInput.sendKeys(text);
		driver.switchTo().defaultContent();
	}
	
	public void enterThirdChoiceAnswer(String text) {
		driver.switchTo().frame(thirdChoiceAnswerIframe);
		this.thirdChoiceAnswerInput.sendKeys(text);
		driver.switchTo().defaultContent();
	}
	
	public void enterFourthChoiceAnswer(String text) {
		driver.switchTo().frame(fourthChoiceAnswerIframe);
		this.fourthChoiceAnswerInput.sendKeys(text);
		driver.switchTo().defaultContent();
	}
	
	public void enterScoreforFirstQuestion(String text) {
	    this.scoreforFirstQuestion.clear();
	    this.scoreforFirstQuestion.sendKeys(text);
		}
	
	public void enterScoreforSecondQuestion(String text) {
	    this.scoreforSecondQuestion.clear();
	    this.scoreforSecondQuestion.sendKeys(text);
		}
	
	public void enterScoreforThirdQuestion(String text) {
	    this.scoreforThirdQuestion.clear();
	    this.scoreforThirdQuestion.sendKeys(text);
		}
	
	public void enterScoreforFourthQuestion(String text) {
	    this.scoreforFourthQuestion.clear();
	    this.scoreforFourthQuestion.sendKeys(text);
		}
	
	public void selectOptionFirstRadioBtn() {
	    this.selectFirstRadioBtn.click();
		}
	
	public void selectOptionSecondRadioBtn() {
	    this.selectSecondRadioBtn.click();
		}
	
	public void selectOptionThirdRadioBtn() {
	    this.selectThirdRadioBtn.click();
		}
	
	public void selectOptionFourthRadioBtn() {
	    this.selectFourthRadioBtn.click();
		}
	
	public void clickAddQuestiontoTestBTN() {
	    this.addQuestionToTestBtn.click();
		}
	
	public void clickTestQuestionsPreviewIcon() {
	    this.testPreviewIcon.click();
		}
	
	public void clickStartTest() {
	    this.startTestBtn.click();
		}
	
	public void selectAnswerforFirstQuestion() {
	    this.answerFirstQuestionRadio.click();
		}
	
	public void clickNextQuestionBtn() {
	    this.nextQuestionBtn.click();
		}
	
	public void selectAnswerforSecondQuestion() {
	    this.answerSecondQuestionRadio.click();
		}
	
	public void clickEndTestBtn() {
	    this.endTestBtn.click();
		}
	
	public void clickProfileIcon() {
	    this.profileIcon.click();
		}
	
	public void clickLogoutLink() {
	    this.logoutLink.click();
		}
	
	//Admin page elements Methods and logic
	
	public void clickFollowedTeachersLink() {
	    this.followedTeachersLink.click();
		}
	
	public void clickFollowedStudentsLink() {
	    this.followedStudentsLink.click();
		}
	
	public void enterTeachersKeywordSearch(String text) {
	    this.teachersKeywordSearch.click();
	    this.teachersKeywordSearch.sendKeys(text);
		}
	
	public void clickTeacherSearchButton() {
	    this.teachersSearchBtn.click();
		}
	
	public void clickTeacherDetailsButton() {
	    this.teacherDetailsBtn.click();
		}
	
	public void clickStudentDetailsButton() {
	    this.studentDetailsBtn.click();
		}
	
	public void clickCourseDetailsButton() {
	    this.courseDetailsBtn.click();
		}
	
	public void clickStudentCourseDetailsButton() {
	    this.studentCourseDetailsBtn.click();
		}
	
	public void clickTestAttemptIcon() {
	    this.testAttemptIcon.click();
		}
	
	public void selectSendEmailChkbox() {
	    this.sendEmailChkbox.click();
		}
	
	public void clickCorrectTestBtn() {
	    this.correctTestBtn.click();
		}
	
	public String emailSentSuccessMsg() {
		String emailSentMsgTxt = emailSentMsg.getText();
		return emailSentMsgTxt;
	}
	
	public void clickDeleteTest() {
	    this.deleteTest.click();
		}
}
