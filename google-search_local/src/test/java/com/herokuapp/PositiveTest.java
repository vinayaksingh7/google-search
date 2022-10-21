package com.herokuapp;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PositiveTest {

    public String title;

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

    }

    //Rahul changes
    @Test(priority = 2)
    public void loginPageTitleTest() {

        Assert.assertEquals(title, "The Internet");
    }

    @Test(priority = 3)
    public void testingMergeConflict() {
        System.out.println("Testing Merge Conflict");
    }

    @Test(priority = 4)
    public void test1() {
        System.out.println("Testing 1");
    }

    @Test(priority = 5)
    public void test2() {
        System.out.println("Testing 2");
    }
/*
	@Test
	public void testingMergeConflictRahul() {
		System.out.println("rahul changes");
	}

	@Test
	public void testingMergeConflictRahulSecond() {
		System.out.println("rahul changes 2");
	}

	@Test(priority = 4)
	public void test1(){
		System.out.println("Testing 1 rahul 3rd changes");
	}*/
@Test(priority = 5)
public void testingMergeConflictRahulSecond() {
    System.out.println("rahul changes 2");
}

    @Test(priority = 6)
    public void test12(){
        System.out.println("Testing 1 rahul 3rd changes");

        }

        @Test(priority = 9)
        public void test145() {
            System.out.println("Testing 1 rahul 3rd changes");

        }



        private void sleep ( long m){
            try {
                Thread.sleep(m);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
