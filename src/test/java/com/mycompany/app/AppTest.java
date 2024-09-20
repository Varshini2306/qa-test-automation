package com.mycompany.app;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test; 
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless=new");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://login.salesforce.com");
	driver.findElement(By.id("username")).sendKeys("varshini.jangam@salesforce.cm");
	driver.findElement(By.id("password")).sendKeys("test1234");
	driver.findElement(By.id("Login")).click();	
	String ActualTitle = driver.getTitle();
	String ExpectedTitle = "Verify Your Identity | Salesforce";
	System.out.println(ActualTitle);
	System.out.println(ExpectedTitle);
	Assert.assertEquals(ExpectedTitle, ActualTitle);
	driver.quit();
    }
}
