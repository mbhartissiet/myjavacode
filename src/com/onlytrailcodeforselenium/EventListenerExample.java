package com.onlytrailcodeforselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EventListenerExample {
      
	private WebDriver driver;
	private EventFiringWebDriver e_driver;
	private WebEventListener eventListener;
	private WebDriverWait wait;
	private String appURL = "http://www.google.com";
	public int waitTime = 10;
	private String headerText = "Google";
	private String errMessage = "The email and password you entered don't match.";

	@BeforeClass()
	public void setUp() {

		// Initializing instance of Firefox WebDriver
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, waitTime);

		// Initializing EventFiringWebDriver using Firefox WebDriver instance
		e_driver = new EventFiringWebDriver(driver);

		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();

		e_driver.register(eventListener);
	
		e_driver.manage().window().maximize();
		e_driver.get(appURL);
	}

	@Test
	public void testEventsONE() {
		System.out.println("***** Executing Test ONE ***** ");
		e_driver.findElement(By.linkText("Gmail")).click();
		String pageHeaderText = e_driver.findElement(By.tagName("h1")).getText();
		System.out.println("header text......." +pageHeaderText);
		//Assert.assertTrue(pageHeaderText.equalsIgnoreCase(headerText));
	}

	@Test
	public void testEventsTWO()  {
		System.out.println("***** Executing Test Two ***** ");
		//Entering user name and clicking on next
		e_driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("mbharti@kabloomcorp.com");
		e_driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")));
		//Entering password and clicking on sign-in
		e_driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("yuvraj@123");
		e_driver.findElement(By.xpath("//*[@id='passwordNext']/content")).click();
		
		//Get the error message and validate it
		//String pageHeaderText = e_driver.findElement(By.id("errormsg_0_Passwd")).getText();
		//System.out.println("pageHeaderText");
		//Assert.assertTrue(pageHeaderText.equalsIgnoreCase(errMessage));
	}

	/*@AfterClass()
	public void tearDown() {
		if (e_driver != null) {
			e_driver.quit();
		}
	}*/

}
