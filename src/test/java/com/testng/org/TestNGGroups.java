package com.testng.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGGroups {
	
	static WebDriver driver;
	@BeforeClass(groups="smoke")
	public static void launch() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(groups="smoke")
	public void t1() {
		driver.findElement(By.id("email")).sendKeys("Harun");
	}
	@Test
	public void t2() {
		driver.findElement(By.id("pass")).sendKeys("12345");
	}
	@Test(groups="smoke")
	
	public void t3() {
		driver.findElement(By.id("u_0_b")).click();
	}
}
