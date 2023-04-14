package com.Sample.runner;

import io.cucumber.testng.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
    
@CucumberOptions(tags = "@VeifyPIMtab", features = {"src/test/resources/features/"}, glue = {"com.Sample.stepdefinitions"},
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
    
public class TestRunner extends AbstractTestNGCucumberTests {
    
}


//"pretty", "json:target/CucumberTestReport.json", "html:target/CucumberTestReport.html"