package com.automation.implementaion;
import static com.automation.base.Base.*;
import static org.junit.Assert.*;

import com.automation.pages.HomePage;
import com.automation.utils.Elements;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Implementation extends Elements{
	public static Logger log=Logger.getLogger(Implementation.class);


	WebDriverWait wait = new WebDriverWait(driver,20);

	HomePage homePo=new HomePage();


	public void clickAcceptAllCookiesandproductbutton() {

		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Accept All Cookies']")));
			clickObject(homePo.button, "button");
		} catch (Exception e) {

		}
	}

	public void  mousehoveronProductlink()	{
		try
		{
			Actions actions = new Actions(driver);	;
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='/products']")));
		actions.moveToElement(homePo.productLink).click().perform();
		}catch (Exception e) {
         log.error("Failed due to error"+e.getMessage());
		}

	}
	public void assertedtext()  {

			try{
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title='Request a Demo']")));
			    assertEquals(homePo.text.getText(),"Register for Demo");
			}catch(Exception e){
				log.error("Failed due to error"+e.getMessage());
				}

		}

      public void clickRequestDemoandValidateLabels(){
		  try {
			  JavascriptExecutor js=getJavaScriptExecutor();
		   js.executeScript("arguments[0].click()", homePo.demolink);
		   boolean firstname=homePo.FirstnameLabel.isDisplayed();
		   boolean lastname=homePo.lastnameLabel.isDisplayed();
		   if(firstname &&lastname){
			   log.info("Both labels are present");

		  }
		  } catch (Exception e) {
			  log.error("Failed due to error"+e.getMessage());

		  }
	  }



	

}
