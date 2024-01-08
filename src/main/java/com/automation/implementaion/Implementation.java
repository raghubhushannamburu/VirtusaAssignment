package com.automation.implementaion;
import static com.automation.base.Base.getActionClassReference;
import static com.automation.base.Base.getJavaScriptExecutor;
import static org.junit.Assert.*;

import com.automation.pages.HomePage;
import com.automation.utils.Elements;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;


public class Implementation extends Elements{
	public static Logger log=Logger.getLogger(Implementation.class);

	HomePage homePo=new HomePage();



	public void clickAcceptAllCookiesandproductbutton() {

		try {
			Thread.sleep(3000);
			clickObject(homePo.button, "button");

			//clickObject(homePo.productLink, "productLink");


		} catch (InterruptedException e) {

		}
	}

	public void  mousehoveronProductlink()	{
		try {
		Actions actions=getActionClassReference();
		Thread.sleep(3000);
		actions.moveToElement(homePo.productLink).click().perform();
		} catch (InterruptedException e) {

		}

	}
		public void assertedtext() throws InterruptedException {
			Thread.sleep(3000);
			assertEquals(homePo.text.getText(),"Register for Demo");

		}

      public void clickRequestDemoandValidateLabels(){
		  try {
		   Thread.sleep(1000);

		   JavascriptExecutor js=getJavaScriptExecutor();
		   js.executeScript("arguments[0].click()", homePo.demolink);
		   boolean firstname=homePo.FirstnameLabel.isDisplayed();
		   boolean lastname=homePo.lastnameLabel.isDisplayed();
		   if(firstname &&lastname){
			   log.info("Both labels are present");

		  }
		  } catch (InterruptedException e) {

		  }
	  }



	

}
