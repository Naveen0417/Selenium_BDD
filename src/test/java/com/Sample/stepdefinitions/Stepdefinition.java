package com.Sample.stepdefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinition {

	private static WebDriver driver;
	public final static int TIMEOUT = 30;
	SoftAssert soft = new SoftAssert();

	@Before
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@After
	public void teardown() {

		driver.quit();
		soft.assertAll();
	}

	@Given("User is on HRMLogin page {string}")
	public void user_is_on_hrm_login_page(String url) {
		driver.get(url);
	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String userName, String passWord) {
		// login to application
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(passWord);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).submit();

		// go the next page
	}

	@Then("User should be able to login sucessfully and new page open")
	public void user_should_be_able_to_login_sucessfully_and_new_page_open() {

		String PageTitle = driver.getTitle();

		// Verify new page - HomePage
		//Assert.assertEquals(PageTitle, "OrangeHRM");
		soft.assertEquals(PageTitle, "OrangeHR");
	}

	@Then("User should validate {string} tabs clickable in HomePage")
	public void user_should_validate_tabs_clickable_in_home_page(String tab) {
		
		WebElement Value  = driver.findElement(By.xpath("//span[text()='"+tab+"']//parent::a"));
		Value.click();
	}

}
