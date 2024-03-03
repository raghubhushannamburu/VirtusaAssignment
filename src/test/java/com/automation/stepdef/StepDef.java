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
	public void assertedtext()  {
			impl.assertedtext();

			}
	@Then("^I mouse hovered on solutions and validated finance accounting URL$")
	public void i_mouse_hovered_on_solutions_and_validated_finance_accounting_URL()  {
         impl.i_mouse_hovered_on_solutions_and_validated_finance_accounting_URL();
	}




	
	
	
	
	

}
