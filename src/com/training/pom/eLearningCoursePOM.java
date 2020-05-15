package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class eLearningCoursePOM {
	private WebDriver driver; 
	
	public eLearningCoursePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//WebElements Declaration for Student/Teacher Login
	@FindBy(linkText="Course catalog")
	private WebElement crscatalog;
	
	@FindBy(className="form-control")
	private WebElement searchBox;
	
	@FindBy(xpath="//div[@class='input-group']//button[1]")
	private WebElement clickSearch;
	
	@FindBy(xpath="//a[@class='btn btn-success btn-sm']")
	private WebElement subscribeCourse;
	
	@FindBy(linkText="Homepage")
	private WebElement homePage;
	
	@FindBy(xpath="//a[contains(text(),'Selenium Test case medium')]")
	private WebElement STCM;
	
	@FindBy(xpath="//img[@id='toolimage_10881']")
	private WebElement STCMProject;
	
	@FindBy(xpath="//a[contains(text(),'New Task for the Test case validation')]")
	private WebElement STCMTask;
	
	@FindBy(xpath="//img[@src='http://elearning.upskills.in/main/img/icons/32/blog.png']")
	private WebElement projectHome;
	
	@FindBy(linkText="Task 2 Test case")
	private WebElement projectTask;
	
	@FindBy(xpath="//input[@id='add_post_title']")
	private WebElement taskTitle;
	
	@FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset']")
	private WebElement commentIframe;
	
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	private WebElement commentText;
	
	@FindBy(xpath="//button[@name='save']")
	private WebElement taskSaveBtn;
	
	@FindBy(xpath="//a[@class='btn btn-danger btn-sm']")
	private WebElement unsubscibeCourse;
	
	//WebElements Declaration for Admin Login
	
	@FindBy(xpath="//button[@class='close']")
	private WebElement adminAlert;
	
	@FindBy(xpath="//a[contains(text(),'Administration')]")
	private WebElement adminTab;
	
	@FindBy(partialLinkText="Courses categories")
	private WebElement coursecategoriesLink;
	
	@FindBy(xpath="//img[@src='http://elearning.upskills.in/main/img/icons/32/new_folder.png']")
	private WebElement newcategoriesIcon;
	
	@FindBy(xpath="//input[@id='course_category_code']")
	private WebElement newCategoryCode;
	
	@FindBy(xpath="//input[@id='course_category_name']")
	private WebElement newCategoryName;
	
	@FindBy(xpath="//input[@type='radio' and @value='TRUE']")
	private WebElement addCRSCategoryRadio;
	
	@FindBy(xpath="//button[@id='course_category_submit']")
	private WebElement addCategoryBtn;
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement addCategoryMsg;
	
	@FindBy(xpath="//a[contains(text(),'Create a course')]")
	private WebElement courseCreation;
	
	@FindBy(xpath="//input[@id='update_course_title']")
	private WebElement courseTitle;
	
	@FindBy(xpath="//input[@id='visual_code']")
	private WebElement courseCode;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	private WebElement teacherlist;
	
	@FindBy(xpath="//li[contains(text(),'110334 mehadi (ManzoorTest100)')]")
	private WebElement teacherName;
	
	@FindBy(xpath="//div[@class='filter-option-inner-inner']")
	private WebElement courseCategory;
	
	@FindBy(xpath="//input[@type='text' and @role='textbox']")
	private WebElement courseCategoryName;
	
	@FindBy(xpath="//span[@class='text']")
	private WebElement selectCourseCategory;
	
	@FindBy(xpath="//div[contains(text(),'English')]")
	private WebElement courseLanguage;
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement submitCourseCreation;
	
	@FindBy(xpath="//input[@id='course-search-keyword']")
	private WebElement courseSearch;
	
	@FindBy(xpath="//button[@id='search_simple_submit']")
	private WebElement searchCourse;
	
	@FindBy(xpath="//a[contains(text(),'Add a ')]")
	private WebElement addUser;
	
	@FindBy(xpath="//input[@id='firstname']")
	private WebElement userFirstName;
	
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement userLastName;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement userEmailId;
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement userPhoneNo;
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement userLoginName;
	
	@FindBy(xpath="//label[contains(text(),'Enter password')]")
	private WebElement selPasswordRadio;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement userPassword;
	
	@FindBy(xpath="//div[@class='filter-option']")
	private WebElement selectProfile;
	
	@FindBy(xpath="//input[@class='form-control' and @role='textbox']")
	private WebElement enterProfileText;
	
	@FindBy(xpath="//span[contains(text(),'Trainer')]")
	private WebElement selectProfileName;
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement UserAdd;
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement addUserSuccessMsg;
	
	@FindBy(linkText="Add users to course")
	private WebElement addUserstoCourseLink;
	
	@FindBy(xpath="//select[@name='firstLetterUser']")
	private WebElement addUsersListFilter;
	
	@FindBy(xpath="//select[@name='UserList[]']")
	private WebElement selectUserfromList;
	
	@FindBy(xpath="//select[@name='firstLetterCourse']")
	private WebElement addCoursesListFilter;
	
	@FindBy(xpath="//select[@name='CourseList[]']")
	private WebElement selectCoursesfromList;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement addBtnUserstoCourses;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement successmsgCourseAddtoUser;
	
	@FindBy(xpath="//input[@class='form-control'][1]")
	private WebElement searchUserAdmin;
	
   //WebElements logic Methods
	public void clickCrsCatalog() {
		this.crscatalog.click();
	}
	
	public void search(String text) {
		this.searchBox.click();
		this.searchBox.sendKeys(text);
	}
	
	public void clickSearch() {
		this.clickSearch.click();
	}
	
	public void courseSubscribe() {
		this.subscribeCourse.click();
	}
	
	public void clickHomePage() {
		this.homePage.click();
	}
	
	public void selectSTCMCourse() {
		this.STCM.click();
	}
	
	public void selectSTCMProject() {
		this.STCMProject.click();
	}
	
	public void selectSTCMTask() {
		this.STCMTask.click();
	}
	
	public void clickProjectHome() {
		this.projectHome.click();
	}
	
	public void clickProjectTask() {
		this.projectTask.click();
	}
	
	public void enterTaskTitle(String text) {
		this.taskTitle.click();
		this.taskTitle.sendKeys(text);
	}
	
	public void entercomment(String text) {
		driver.switchTo().frame(commentIframe);
		this.commentText.sendKeys(text);
		driver.switchTo().defaultContent();
	}
	
	public void clickTaskSaveBtn() {
		this.taskSaveBtn.click();
	}
	
	public void clickUnsubsCourse() {
		this.unsubscibeCourse.click();
	}
	
	//Admin Methods
	
	public void dismissAlert() {
        this.adminAlert.click();
			
	}
	
	public void clickAdminTab() {
		this.adminTab.click();
	}
	
	public void clickCourseCategories() {
		this.coursecategoriesLink.click();
	}
	
	public void clickNewCategoriesIcon() {
        this.newcategoriesIcon.click();			
	}
	
	public void enterCategoryCode(String text) {
		this.newCategoryCode.click();
		this.newCategoryCode.sendKeys(text);
	}
	
	public void enterCategoryName(String text) {
		this.newCategoryName.click();
		this.newCategoryName.sendKeys(text);
	}
	
	public void selectAddCRSCategoryRadio() {
		this.addCRSCategoryRadio.click();
	}
	
	public void clickAddCategoryBtn() {
		this.addCategoryBtn.click();
	}
	
	public String getAddCategoryMsg() {
		String msg = addCategoryMsg.getText();
		return msg;
	}
	
	public void clickCreateCourse() {
		this.courseCreation.click();
	}
	
	public void enterCourseTitle(String text) {
		this.courseTitle.click();
		this.courseTitle.sendKeys(text);
	}
	
	public void enterCourseCode(String text) {
		this.courseCode.click();
		this.courseCode.sendKeys(text);
	}
	
	public void selectTeachers(String text) {
		this.teacherlist.click();
		this.teacherlist.sendKeys(text);
	}
	
	public void selectTeacherName() {
		this.teacherName.click();
	}
	
	public void clickCourseCategory() {
		this.courseCategory.click();
	}
	
	public void enterCourseCategoryName(String text) {
		this.courseCategoryName.sendKeys(text);
	}
	
	public void selectCourseCategoryName() {
		this.selectCourseCategory.click();
	}
	
	public String getSelectedLang() {
		String selLang = courseLanguage.getText();
		return selLang;
	}
	
	public void clickSubmitCourseCreation() {
		this.submitCourseCreation.click();
	}
	
	public void enterCourseSearch(String text) {
		this.courseSearch.click();
		this.courseSearch.sendKeys(text);
	}
	
	public void clickCourseSearch() {
		this.searchCourse.click();
	}
	
	public void pressEnter() throws AWTException {
		Robot enter = new Robot();
		enter.keyPress(KeyEvent.VK_ENTER);
		enter.keyRelease(KeyEvent.VK_DOWN);
		enter.keyRelease(KeyEvent.VK_ENTER);		
	}
	// Method not used
	public void mouseClick() {
		Actions mouseact = new Actions(driver);
		mouseact.click();
	}
	
	public void selectAddUserlink() {
		this.addUser.click();
	}
	
	public void enterUserFirstName(String text) {
		this.userFirstName.click();
		this.userFirstName.sendKeys(text);
	}
	
	public void enterUserLastName(String text) {
		this.userLastName.click();
		this.userLastName.sendKeys(text);
	}
	
	public void enterUserEmailId(String text) {
		this.userEmailId.click();
		this.userEmailId.sendKeys(text);
	}
	
	public void enterUserPhoneNo(String text) {
		this.userPhoneNo.click();
		this.userPhoneNo.sendKeys(text);
	}
	
	public void enterUserLoginName(String text) {
		this.userLoginName.click();
		this.userLoginName.sendKeys(text);
	}
	
	public void selectPasswordradio() {
		this.selPasswordRadio.click();
	}
	
	public void enterUserPassword(String text) {
		this.userPassword.click();
		this.userPassword.sendKeys(text);
	}
	
	public void selectProfile() {
		this.selectProfile.click();
	}
	
	public void enterProfileText(String text) {
		this.enterProfileText.click();
		this.enterProfileText.sendKeys(text);
	}
	
	public void selProfileName() {
		this.selectProfileName.click();
	}
	
	public void submitAddedUser() {
		this.UserAdd.click();
	}
	
	public String addUserSuccessMsg() {
		String userAddedmsg = addUserSuccessMsg.getText();
		return userAddedmsg;
	}
	
	public void clickAddUsertoCourseLink() {
		this.addUserstoCourseLink.click();
	}
	
	public void selectUserListFilter() {
		Select addUserList = new Select(addUsersListFilter);
		addUserList.selectByValue("V");
	}
	
	public void selectUserinList() {
		Select selUserList = new Select(selectUserfromList);
		selUserList.selectByVisibleText("Vijay Justin (justeach)");
	}
	
	public void selectCourseListFilter() {
		Select addCourseList = new Select(addCoursesListFilter);
		addCourseList.selectByValue("G");
	}
	
	public void selectCourseinList() {
		Select selCoursefromList = new Select(selectCoursesfromList);
		selCoursefromList.selectByVisibleText("(GHI19) Source Management");
	}
	
	public void clickAddUsertoCoursesBtn() {
		this.addBtnUserstoCourses.click();
	}
	
	public String getSuccessMsgUserAddedToCourse() {
		String userCoursesAddedmsg = successmsgCourseAddtoUser.getText();
		return userCoursesAddedmsg;
	}
	
	// Method not used
    public void enterSearchText(String text) {
		this.searchUserAdmin.click();
		this.searchUserAdmin.sendKeys(text);
	}
}

