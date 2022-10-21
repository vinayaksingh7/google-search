package com.herokuapp.theinternet;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PositiveTest {

	public String title;
	
	public String currentURL;

	@Test(priority = 1)
	public void loginTest() {

		// create driver
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();

		System.out.println("Starting login Test");

		// open test page
		String url = "https://the-internet.herokuapp.com/login";
		driver.get(url);
		System.out.println("Page is opened successfully");

		sleep(3000);

		// enter username
		driver.findElement(By.id("username")).sendKeys("tomsmith");

		// enter password
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

		// click on Login button
		driver.findElement(By.className("radius")).click();

		// getTitle   Rahul changes
		title = driver.getTitle();
		
		currentURL = driver.getCurrentUrl();

	}
        //Rahul changes
	@Test(priority = 2)
	public void loginPageTitleTest() {

		Assert.assertEquals(title, "The Internet");
	}

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


}
