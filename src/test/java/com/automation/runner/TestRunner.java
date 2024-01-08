package com.automation.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:FeatureFiles/automationanywhere.feature"}, glue={"classpath:com.automation.stepdef","classpath:com.automation.base"}, plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})
public class TestRunner {

}
