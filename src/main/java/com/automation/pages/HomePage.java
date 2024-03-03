package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	
	@FindBy(xpath="//button[text()='Accept All Cookies']")
	public WebElement button;
	


	@FindBy(xpath = "//a[@href='/products']")
	public  WebElement productLink;


	@FindBy(xpath = "//a[@title='Request a Demo']")
	public  WebElement text;

	@FindBy(xpath = "//a[text()='Request Demo']")
	public WebElement demolink;

	@FindBy(xpath = "//label[@for='LastName']")
	public WebElement lastnameLabel;

	@FindBy(xpath = "//label[@for='FirstName']")
	public WebElement FirstnameLabel;

	@FindBy(xpath = "//a[@href='/solutions']")
	public WebElement  solutions;

	@FindBy(xpath ="//div/a[@href='/solutions/financial-services']")
	public WebElement financialaccounting;



}
