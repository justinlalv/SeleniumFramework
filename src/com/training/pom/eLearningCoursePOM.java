package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class eLearningCoursePOM {
	private WebDriver driver; 
	
	public eLearningCoursePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//WebElements Declaration
	@FindBy(linkText="Course catalog")
	private WebElement crscatalog;
	
	@FindBy(className="form-control")
	private WebElement searchBox;
	
	@FindBy(xpath="//div[@class='input-group']//button[1]")
	private WebElement clickSearch;

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
}

