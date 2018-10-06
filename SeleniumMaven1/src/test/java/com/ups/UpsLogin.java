package com.ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpsLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\KamrulIslam\\eclipse-workspace\\SeleniumJuel\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.ups.com/us/en/Home.page");
		driver.manage().window().maximize();
		WebElement signin = driver.findElement(By.xpath("//*[@id=\"ups-navItems\"]/ul[2]/li[1]/a"));
	signin.click();
	Thread.sleep(2000);
	WebElement username= driver.findElement(By.xpath("//input[@id='email']"));
	username.sendKeys("ichigo");
	Thread.sleep(2000);
	WebElement password= driver.findElement(By.xpath("//input[@id='pwd']"));
	password.sendKeys("bleach123");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id='submitBtn']")).click();
	}

}
