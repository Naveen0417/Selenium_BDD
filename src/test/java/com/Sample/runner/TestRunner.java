package com.Sample.runner;

import io.cucumber.testng.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
    
@CucumberOptions(tags = "@VeifyHomePage", features = {"src/test/resources/features/"}, glue = {"com.Sample.stepdefinitions"},
plugin = {"pretty", "json:target/CucumberTestReport.json", "html:target/CucumberTestReport.html"})
    
public class TestRunner extends AbstractTestNGCucumberTests {
    
}