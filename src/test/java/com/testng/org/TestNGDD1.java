package com.testng.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDD1 extends TestNGDD {
	@Test(dataProvider="smoke")
	public void Test1(String s1,String s2) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys(s1);
		driver.findElement(By.id("pass")).sendKeys(s2);
		
		
	}
	@DataProvider(name="smoke",parallel=true)
	public static Object[][]data() throws Throwable {
		return getData();
		
	}
	

}
