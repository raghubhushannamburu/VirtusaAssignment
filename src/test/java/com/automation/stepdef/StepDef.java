package com.automation.stepdef;

import com.automation.base.Base;
import com.automation.implementaion.Implementation;
import com.automation.utils.Elements;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class StepDef{
	Implementation impl=new Implementation();
	Elements element=new Elements();
	
	@Given("I navigate and login to automationanywhere website$")
	public void i_NavigateToApplication() throws Throwable {
		Base.navigatetoautomationanywhere();
	}
	
	@And("^I click AcceptAllCookies button$")
	public void IclickAcceptAllCookiesbutton(){
		impl.clickAcceptAllCookiesandproductbutton();
	}

	@And("^I mouse hovered on product$")
	public void Imousehoveredonproduct() {
		impl.mousehoveronProductlink();
	}
	@Then("^I click on RequestDemo button and validated labels$")
	public void IclickonRequestDemobutton() {
		impl.clickRequestDemoandValidateLabels();
	}

	@And("^I asserted text$")
	public void assertedtext() throws InterruptedException {
			impl.assertedtext();

			}




	
	
	
	
	

}
